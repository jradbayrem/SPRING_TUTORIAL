package com.adaming.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 
 * @author INTI0261
 *
 */
public class Client {

	private String action;
	private int type;
	
	//ByType - prop/setter/ctor
	@Autowired(required=false)
	@Qualifier("personneBean2")
	private Personne personne;

	/**
	 * ctor 
	 */
	public Client() {
		super();
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Client [action=" + action + ", type=" + type + ", personne=" + personne + "]";
	}

}
