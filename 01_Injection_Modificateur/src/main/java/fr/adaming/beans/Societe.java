package fr.adaming.beans;

import java.io.Serializable;

public class Societe implements Serializable{
	
	
	private String nom;
	private Developpeur developpeur;
	private Developpeur chefProjet;
	
	
	
	public Societe() {
		super();
	}
	
	public Societe(String nom, Developpeur developpeur, Developpeur chefProjet) {
		super();
		this.nom = nom;
		this.developpeur = developpeur;
		this.chefProjet = chefProjet;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Developpeur getDeveloppeur() {
		return developpeur;
	}
	public void setDeveloppeur(Developpeur developpeur) {
		this.developpeur = developpeur;
	}
	public Developpeur getChefProjet() {
		return chefProjet;
	}
	public void setChefProjet(Developpeur chefProjet) {
		this.chefProjet = chefProjet;
	}

	@Override
	public String toString() {
		return "Societe [nom=" + nom + ", developpeur=" + developpeur + ", chefProjet=" + chefProjet + "]";
	};
	
	
	

}
