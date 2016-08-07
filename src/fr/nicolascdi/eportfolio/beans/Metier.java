package fr.nicolascdi.eportfolio.beans;

public class Metier {

	int id_metier;
	String libelle_metier;
	public int getId_metier() {
		return id_metier;
	}
	public void setId_metier(int id_metier) {
		this.id_metier = id_metier;
	}
	public String getLibelle_metier() {
		return libelle_metier;
	}
	public void setLibelle_metier(String libelle_metier) {
		this.libelle_metier = libelle_metier;
	}
	public Metier() {
	}
	@Override
	public String toString() {
		return "Metier [id_metier=" + id_metier + ", libelle_metier=" + libelle_metier + "]";
	}
	
	
}
