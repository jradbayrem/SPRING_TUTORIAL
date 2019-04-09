package com.adaming.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author INTI0261
 *
 */
@Component("personneBean")
public class Personne {

	@Value("vangel")
	private String nom;
	
	@Value("stephane")
	private String prenom;
	
	@Value("vangel@gmail.com")
	private String mail;

	/**
	 * ctor 
	 */
	public Personne() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + "]";
	}

}
