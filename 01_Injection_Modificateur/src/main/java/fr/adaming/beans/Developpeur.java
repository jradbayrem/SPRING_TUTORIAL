package fr.adaming.beans;

import java.io.Serializable;

public class Developpeur implements Serializable{

	private String nom;
	private int anneeExperience;
	
	
	public Developpeur() {
		super();
	}
	
	
	public Developpeur(String nom, int anneeExperience) {
		super();
		this.nom = nom;
		this.anneeExperience = anneeExperience;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getAnneeExperience() {
		return anneeExperience;
	}


	public void setAnneeExperience(int anneeExperience) {
		this.anneeExperience = anneeExperience;
	}


	@Override
	public String toString() {
		return "Developpeur [nom=" + nom + ", anneeExperience=" + anneeExperience + "]";
	}


	
	
	
	
	
	
}
