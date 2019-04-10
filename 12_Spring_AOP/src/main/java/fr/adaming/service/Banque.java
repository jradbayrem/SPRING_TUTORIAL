package fr.adaming.service;

public class Banque implements Ibanque  {

	private double solde=200;
	
	public double retrait(double somme){
		if (somme<solde){
			return solde-somme;
		}else {
			throw new IllegalArgumentException();
		}
					
	}
}
