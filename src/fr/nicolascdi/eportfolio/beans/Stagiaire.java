package fr.nicolascdi.eportfolio.beans;

public class Stagiaire {
	
	private int id_stagiaire;
	private String nom_stagiaire;
	private String prenom_stagiaire;
	private String adresse_stagiaire;
	private String dateNaissance_stagiaire;
	private String email_stagiaire;
	private String numero_stagiaire;
	public int getId_stagiaire() {
		return id_stagiaire;
	}
	public void setId_stagiaire(int id_stagiaire) {
		this.id_stagiaire = id_stagiaire;
	}
	public String getNom_stagiaire() {
		return nom_stagiaire;
	}
	public void setNom_stagiaire(String nom_stagiaire) {
		this.nom_stagiaire = nom_stagiaire;
	}
	public String getPrenom_stagiaire() {
		return prenom_stagiaire;
	}
	public void setPrenom_stagiaire(String prenom_stagiaire) {
		this.prenom_stagiaire = prenom_stagiaire;
	}
	public String getAdresse_stagiaire() {
		return adresse_stagiaire;
	}
	public void setAdresse_stagiaire(String adresse_stagiaire) {
		this.adresse_stagiaire = adresse_stagiaire;
	}
	public String getDateNaissance_stagiaire() {
		return dateNaissance_stagiaire;
	}
	public void setDateNaissance_stagiaire(String dateNaissance_stagiaire) {
		this.dateNaissance_stagiaire = dateNaissance_stagiaire;
	}
	public String getEmail_stagiaire() {
		return email_stagiaire;
	}
	public void setEmail_stagiaire(String email_stagiaire) {
		this.email_stagiaire = email_stagiaire;
	}
	public String getNumero_stagiaire() {
		return numero_stagiaire;
	}
	public void setNumero_stagiaire(String numero_stagiaire) {
		this.numero_stagiaire = numero_stagiaire;
	}
	public Stagiaire() {
		super();
	}
	@Override
	public String toString() {
		return "Stagiaire [id_stagiaire=" + id_stagiaire + ", nom_stagiaire=" + nom_stagiaire + ", prenom_stagiaire="
				+ prenom_stagiaire + ", adresse_stagiaire=" + adresse_stagiaire + ", dateNaissance_stagiaire="
				+ dateNaissance_stagiaire + ", email_stagiaire=" + email_stagiaire + ", numero_stagiaire="
				+ numero_stagiaire + "]";
	}
	
	
	
	
	
	

}
