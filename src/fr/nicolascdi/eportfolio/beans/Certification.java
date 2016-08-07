package fr.nicolascdi.eportfolio.beans;

public class Certification {
	
	int id_certification;
	String libelle_certification;
	public int getId_certification() {
		return id_certification;
	}
	public void setId_certification(int id_certification) {
		this.id_certification = id_certification;
	}
	public String getLibelle_certification() {
		return libelle_certification;
	}
	public void setLibelle_certification(String libelle_certification) {
		this.libelle_certification = libelle_certification;
	}
	public Certification() {
	}
	@Override
	public String toString() {
		return "Certification [id_certification=" + id_certification + ", libelle_certification="
				+ libelle_certification + "]";
	}
	

}
