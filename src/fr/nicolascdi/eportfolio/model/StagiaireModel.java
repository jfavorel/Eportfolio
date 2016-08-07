package fr.nicolascdi.eportfolio.model;

import java.util.ArrayList;
import java.util.List;

import fr.nicolascdi.eportfolio.beans.Stagiaire;

public class StagiaireModel {
	

	private String motCle;
	private List<Stagiaire>stags = new ArrayList<Stagiaire>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Stagiaire> getStags() {
		return stags;
	}
	public void setStags(List<Stagiaire> stags) {
		this.stags = stags;
	}
	

}
