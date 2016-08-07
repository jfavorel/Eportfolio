package fr.nicolascdi.eportfolio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.nicolascdi.eportfolio.beans.Stagiaire;
import fr.nicolascdi.eportfolio.utility.DBUtility;

public class StagiaireDAOImpl implements StagiaireDAO {
	
	private Connection connection;

	 public StagiaireDAOImpl() {
	  connection = DBUtility.getConnection();
	 }

	@Override
	public void addStagiaire(Stagiaire stag) {
		 try {
	            PreparedStatement preparedStatement = connection
	                    .prepareStatement("insert into STAGIAIRE(nom_stagiaire,prenom_stagiaire,dateNaissance_stagiaire,adresse_stagiaire,email_stagiaire,numero_stagiaire) values (?, ?, ?, ?, ?, ? )");
	            
	            preparedStatement.setString(1, stag.getNom_stagiaire());
	            preparedStatement.setString(2, stag.getPrenom_stagiaire());
	            preparedStatement.setString(3, stag.getDateNaissance_stagiaire());
	            preparedStatement.setString(4, stag.getAdresse_stagiaire());
	            preparedStatement.setString(5, stag.getEmail_stagiaire());
	            preparedStatement.setString(6, stag.getNumero_stagiaire());
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}

	@Override
	public void updateStagiaire(Stagiaire stag) {
		 try {
			   PreparedStatement preparedStatement = connection
			     .prepareStatement("update STAGIAIRE set nom_stagiaire=?, prenom_stagiaire=?, dateNaissance_stagiaire=?,adresse_stagiaire=?,email_stagiaire=?,numero_stagiaire=?"+
							"where id_stagiaire=?");
			   preparedStatement.setString(1, stag.getNom_stagiaire());
			   preparedStatement.setString(2, stag.getPrenom_stagiaire());
			   preparedStatement.setString(3, stag.getDateNaissance_stagiaire());
			   preparedStatement.setString(4, stag.getAdresse_stagiaire());
			   preparedStatement.setString(5, stag.getEmail_stagiaire());
			   preparedStatement.setString(6, stag.getNumero_stagiaire());
			   preparedStatement.setInt(7, stag.getId_stagiaire());
			   
			   preparedStatement.executeUpdate();

			  } catch (SQLException e) {
			   e.printStackTrace();
			  }
		
	}

	@Override
	public List<Stagiaire> getAllStagiaires() {
		List<Stagiaire> stags = new ArrayList<Stagiaire>();
		  try {
		   Statement statement = connection.createStatement();
		   ResultSet rs = statement.executeQuery("select * from STAGIAIRE");
		   while (rs.next()) {
		    Stagiaire stag = new Stagiaire();
		    stag.setId_stagiaire(rs.getInt("id_stagiaire"));
		    stag.setNom_stagiaire(rs.getString("nom_stagiaire"));
		    stag.setPrenom_stagiaire(rs.getString("prenom_stagiaire"));
		    stag.setAdresse_stagiaire(rs.getString("adresse_stagiaire"));
		    stag.setDateNaissance_stagiaire(rs.getString("dateNaissance_stagiaire"));
		    stag.setEmail_stagiaire(rs.getString("email_stagiaire"));
		    stag.setNumero_stagiaire(rs.getString("numero_stagiaire"));
		    stags.add(stag);
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }

		  return stags;
	}

	@Override
	public Stagiaire getStagiaireById(int idStagiaire) {
		Stagiaire stag = new Stagiaire();
		  try {
		   PreparedStatement preparedStatement = connection.
		     prepareStatement("select * from STAGIAIRE where id_stagiaire=?");
		   preparedStatement.setInt(1, idStagiaire);
		   ResultSet rs = preparedStatement.executeQuery();
		   
		   if (rs.next()) {
		     stag.setId_stagiaire(rs.getInt("id_stagiaire"));
		     stag.setNom_stagiaire(rs.getString("nom_stagiaire"));
		     stag.setPrenom_stagiaire(rs.getString("prenom_stagiaire"));    
		     stag.setAdresse_stagiaire(rs.getString("adresse_stagiaire"));
		     stag.setDateNaissance_stagiaire(rs.getString("dateNaissance_stagiaire"));
		     stag.setEmail_stagiaire(rs.getString("email_stagiaire"));
		     stag.setNumero_stagiaire(rs.getString("numero_stagiaire"));
		   }
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }

		  return stag;
	}

	@Override
	public void deleteStagiaire(int idStagiaire) {
		 try {
	            PreparedStatement preparedStatement = connection
	                    .prepareStatement("delete from STAGIAIRE where id_stagiaire=?");
	            
	            preparedStatement.setInt(1, idStagiaire);
	            preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}

	@Override
	public List<Stagiaire> getStagiaireParMC(String mc) {
		List<Stagiaire>stags = new ArrayList<Stagiaire>();
		
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("SELECT * FROM STAGIAIRE where nom_stagiaire like ?");
		
		ps.setString(1, "%"+mc+"%");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			Stagiaire stag = new Stagiaire();
			stag.setId_stagiaire(rs.getInt("id_stagiaire"));
			stag.setNom_stagiaire(rs.getString("nom_stagiaire"));
			stag.setPrenom_stagiaire(rs.getString("prenom_stagiaire"));
			stag.setDateNaissance_stagiaire(rs.getString("dateNaissance_stagiaire"));
			stag.setAdresse_stagiaire(rs.getString("adresse_stagiaire"));
			stag.setEmail_stagiaire(rs.getString("email_stagiaire"));
			stag.setNumero_stagiaire(rs.getString("numero_stagiaire"));
			stags.add(stag);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stags;
	}

}
