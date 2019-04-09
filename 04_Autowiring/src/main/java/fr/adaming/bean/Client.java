package fr.adaming.bean;

public class Client {

	private String nom;
	private Adresse adresse;

	/**
	 * ctor
	 */
	public Client() {
	}

	public Client(Adresse adresse) {
		super();
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", adresse=" + adresse + "]";
	}

}
