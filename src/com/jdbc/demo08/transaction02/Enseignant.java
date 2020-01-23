package com.jdbc.demo08.transaction02;

public class Enseignant {

	private int num;
	private String nom;
	private String prenom;
	private double salaire;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Enseignant(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	public Enseignant(int num, String nom, String prenom, double salaire) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
}
