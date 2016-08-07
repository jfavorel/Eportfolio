package fr.nicolascdi.eportfolio.beans;

public class Competence {
	
	int id_competence;
	String libelle_competence;
	public int getId_competence() {
		return id_competence;
	}
	public void setId_competence(int id_competence) {
		this.id_competence = id_competence;
	}
	public String getLibelle_competence() {
		return libelle_competence;
	}
	public void setLibelle_competence(String libelle_competence) {
		this.libelle_competence = libelle_competence;
	}
	public Competence() {
	}
	@Override
	public String toString() {
		return "Competence [id_competence=" + id_competence + ", libelle_competence=" + libelle_competence + "]";
	}

	
}
