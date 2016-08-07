package fr.nicolascdi.eportfolio.beans;

public class Entreprise {
	
	int id_entreprise;
	String nom_entreprise;
	String adresse_entreprise;
	public int getId_entreprise() {
		return id_entreprise;
	}
	public void setId_entreprise(int id_entreprise) {
		this.id_entreprise = id_entreprise;
	}
	public String getNom_entreprise() {
		return nom_entreprise;
	}
	public void setNom_entreprise(String nom_entreprise) {
		this.nom_entreprise = nom_entreprise;
	}
	public String getAdresse_entreprise() {
		return adresse_entreprise;
	}
	public void setAdresse_entreprise(String adresse_entreprise) {
		this.adresse_entreprise = adresse_entreprise;
	}
	public Entreprise() {
	}
	@Override
	public String toString() {
		return "Entreprise [id_entreprise=" + id_entreprise + ", nom_entreprise=" + nom_entreprise
				+ ", adresse_entreprise=" + adresse_entreprise + "]";
	}
	
	

}
