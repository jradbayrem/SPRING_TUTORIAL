package fr.adaming.bean;

public class Adresse {

	private String adresseComplete;

	/**
	 * ctor
	 */
	public Adresse() {
		super();
	}

	public String getAdresseComplete() {
		return adresseComplete;
	}

	public void setAdresseComplete(String adresseComplete) {
		this.adresseComplete = adresseComplete;
	}

	@Override
	public String toString() {
		return "Adresse [adresseComplete=" + adresseComplete + "]";
	}

}
