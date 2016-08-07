package fr.nicolascdi.eportfolio.beans;

public class Formation {
	
	int id_formation;
	String libelle_formation;
	int annee;
	public int getId_formation() {
		return id_formation;
	}
	public void setId_formation(int id_formation) {
		this.id_formation = id_formation;
	}
	public String getLibelle_formation() {
		return libelle_formation;
	}
	public void setLibelle_formation(String libelle_formation) {
		this.libelle_formation = libelle_formation;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public Formation() {
	}
	@Override
	public String toString() {
		return "Formation [id_formation=" + id_formation + ", libelle_formation=" + libelle_formation + ", annee="
				+ annee + "]";
	}

	
}
