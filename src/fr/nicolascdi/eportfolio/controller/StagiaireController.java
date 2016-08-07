package fr.nicolascdi.eportfolio.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.nicolascdi.eportfolio.beans.Stagiaire;
import fr.nicolascdi.eportfolio.dao.StagiaireDAO;
import fr.nicolascdi.eportfolio.dao.StagiaireDAOImpl;
import fr.nicolascdi.eportfolio.model.StagiaireModel;


public class StagiaireController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	public static final String INSERT_OR_EDIT = "/addStagiaire.jsp";
	public static final String STAGIAIRE_VIEW = "/stagiaireview.jsp";
	public static final String LISTE_RECHERCHE = "/listeRecherche.jsp";
	
	private StagiaireDAO metier;
	
	
	public void init() throws ServletException {
		metier= new StagiaireDAOImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter( "action" );
		
		if( action.equalsIgnoreCase( "delete" ) ) {
			forward = STAGIAIRE_VIEW;
			int idStagiaire = Integer.parseInt( request.getParameter("id") );
			metier.deleteStagiaire(idStagiaire);
			request.setAttribute("stagiaires", metier.getAllStagiaires() );
		}
		else if( action.equalsIgnoreCase( "edit" ) ) {
			forward = INSERT_OR_EDIT;
			int idStagiaire = Integer.parseInt( request.getParameter("id") );
			Stagiaire stagiaire = metier.getStagiaireById(idStagiaire);
			request.setAttribute("stagiaire", stagiaire);
		}
		else if( action.equalsIgnoreCase( "listeRecherche" ) ) {
			forward = LISTE_RECHERCHE;
			
		}
		
		else if( action.equalsIgnoreCase( "stagiaireview" ) ) {
			forward = STAGIAIRE_VIEW;
			request.setAttribute("stagiaires", metier.getAllStagiaires() );
		}
		else {
			forward = INSERT_OR_EDIT;
		}
		RequestDispatcher view = request.getRequestDispatcher( forward );
		view.forward(request, response);
	}

	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	
	     	String action = request.getParameter( "action" );
	    	String forward = "";
	    	if( action.equalsIgnoreCase( "listeRecherche" ) ) {
	    		//lire les mots clés de la requête
		    	String mc=request.getParameter("motCle");
		    	//créer une instance du modèle
		    	StagiaireModel mod = new StagiaireModel();
		    	//stocker les données de la requête dans le modèle
		    	mod.setMotCle(mc);
		    	//faire appel à la couche métier pour récuprer le résultat
				List<Stagiaire> stags = null;
				stags = metier.getStagiaireParMC(mc);
				//stocker le résultat dans le modèle
		    	mod.setStags(stags);
		    	//récupération du modèle pour le transmettre à la vue
		    	request.setAttribute("modele", mod);
		    	//afficher dans la vue
		    	request.getRequestDispatcher(LISTE_RECHERCHE).forward(request, response);
	    	}
	    	else if( action.equalsIgnoreCase( "edit" ) ) {
	    	Stagiaire stagiaire = new Stagiaire();
	    	stagiaire.setNom_stagiaire( request.getParameter( "nom" ) );
	    	stagiaire.setPrenom_stagiaire( request.getParameter( "prenom" ) );
	    	stagiaire.setAdresse_stagiaire( request.getParameter( "adresse" ) );
	    	stagiaire.setDateNaissance_stagiaire( request.getParameter( "dateNaissance" ) );
	    	stagiaire.setEmail_stagiaire( request.getParameter( "email" ) );
	    	stagiaire.setNumero_stagiaire( request.getParameter( "numero" ) );
	    	
			String idStagiaire = request.getParameter("id");
			if( idStagiaire.equals(null) || idStagiaire.isEmpty() ) {
				metier.addStagiaire(stagiaire);
				}else {
				stagiaire.setId_stagiaire( Integer.parseInt(idStagiaire) );
				metier.updateStagiaire(stagiaire);
				}
	    	
			RequestDispatcher view = request.getRequestDispatcher( STAGIAIRE_VIEW );
			request.setAttribute("stagiaires", metier.getAllStagiaires());
			view.forward(request, response);
	    	} 
	 }
}
