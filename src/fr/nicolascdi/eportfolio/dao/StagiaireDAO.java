package fr.nicolascdi.eportfolio.dao;

import java.sql.SQLException;
import java.util.List;

import fr.nicolascdi.eportfolio.beans.Stagiaire;

public interface StagiaireDAO {
	
	
	public List<Stagiaire> getStagiaireParMC(String mc);
	public void addStagiaire(Stagiaire stag);
	public void updateStagiaire(Stagiaire stag);
	public List<Stagiaire> getAllStagiaires();
	public Stagiaire getStagiaireById(int idStagiaire);
	public void deleteStagiaire(int idStagiaire);

}
