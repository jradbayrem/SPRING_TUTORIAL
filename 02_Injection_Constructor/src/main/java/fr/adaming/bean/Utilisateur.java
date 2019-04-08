package fr.adaming.bean;

public class Utilisateur {

	private String nom;
	private String adresse;
	private int age;
	private double salaire;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String nom, String adresse, int age, double salaire) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.age = age;
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", adresse=" + adresse + ", age=" + age + ", salaire=" + salaire + "]";
	}
}
