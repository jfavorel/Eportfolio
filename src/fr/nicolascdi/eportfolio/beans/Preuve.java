package fr.nicolascdi.eportfolio.beans;

public class Preuve {
	
	int id_preuve;
	String type_preuve;
	public int getId_preuve() {
		return id_preuve;
	}
	public void setId_preuve(int id_preuve) {
		this.id_preuve = id_preuve;
	}
	public String getType_preuve() {
		return type_preuve;
	}
	public void setType_preuve(String type_preuve) {
		this.type_preuve = type_preuve;
	}
	public Preuve() {
	}
	@Override
	public String toString() {
		return "Preuve [id_preuve=" + id_preuve + ", type_preuve=" + type_preuve + "]";
	}
	
	

}
