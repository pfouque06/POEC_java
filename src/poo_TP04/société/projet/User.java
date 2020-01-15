package poo_TP04.société.projet;

import java.util.Date;

public class User {

	private int id;
	private static int count;
	private String nom;
	private String prenom;
	private Date hiringDate;
	private final Profil profil;

	public User(String nom, String prenom, Profil profil) {
		super();
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.profil = profil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Profil getProfil() {
		return profil;
	}

	@Override
	public String toString() {
		return "[" + id + "] " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase()
				+ prenom.substring(1).toLowerCase() + ", profil " + profil;
	}

}
