package XMLserial.exo02;

import java.util.ArrayList;

public class Personne {

	private int id;
	private static int count;
	private String nom;
	private String prenom;
	private ArrayList<Adresse> adresses = new ArrayList<Adresse>();

	public Personne() {
		super();
		this.id = count++;
	}


	public Personne(String nom, String prenom, Adresse adresse) {
		super();
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.adresses.add(adresse);
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


	public ArrayList<Adresse> getAdresses() {
		return adresses;
	}


	public void setAdresses(ArrayList<Adresse> adresses) {
		this.adresses = adresses;
	}

	public void addAdresse(Adresse adresse) {
		this.adresses.add(adresse);
	}

	public void remAdresse(Adresse adresse) {
		this.adresses.remove(adresse);
	}

	
	@Override
	public String toString() {
		return "[" + id + "] " + nom + " " + prenom + " " + adresses;
	}

}
