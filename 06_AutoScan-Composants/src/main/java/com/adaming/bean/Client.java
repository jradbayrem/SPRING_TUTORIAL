package com.adaming.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author INTI0261
 *
 */
@Component("clientBean")
public class Client {

	@Value("achat")
	private String action;
	
	@Value("1")
	private int type;
	
	@Autowired
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
