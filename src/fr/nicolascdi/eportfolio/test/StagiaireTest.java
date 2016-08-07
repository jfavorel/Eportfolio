package fr.nicolascdi.eportfolio.test;

import java.sql.SQLException;
import java.util.List;

import fr.nicolascdi.eportfolio.beans.Stagiaire;
import fr.nicolascdi.eportfolio.dao.StagiaireDAOImpl;

public class StagiaireTest {

	public static void main(String[] args) throws SQLException {
		StagiaireDAOImpl metier = new StagiaireDAOImpl();
		 
			List<Stagiaire> stags = metier.getStagiaireParMC("R");
	
		for(Stagiaire s : stags)
			System.out.println(s.getNom_stagiaire());
		
	}

}
