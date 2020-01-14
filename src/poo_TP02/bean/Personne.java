package poo_TP02.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import poo_TP02.inter.IPersonne;

public class Personne implements IPersonne {

	private int id;
	private static int count;
	private String nom;
	private String prenom;
	private Date dateNais;
	private double salaire;
	private Profil profil;
	private Sport sport;

	public Personne(String nom, String prenom, Date dateNais, double salaire, Profil profil, Sport sport) {
		super();
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNais = dateNais;
		this.salaire = salaire;
		this.profil = profil;
		this.sport = sport;
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

	public Date getDateNais() {
		return dateNais;
	}

	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
		String birthdate_ = dateFormat.format(dateNais);
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNais=" + birthdate_ + ", salaire="
				+ salaire + ", profil=" + profil + ", sport=" + sport + "]";
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub
		SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
		String birthdate_ = dateFormat.format(dateNais);
		String buffer = "[id=" + id + "] Je suis le " + profil.getLibelle() + " " + nom.toUpperCase() + " "
				+ prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase() + " né le " + birthdate_
				+ " mon salaire est " + String.format("%.2f", salaire) + " € mon sport est le " + sport;
		System.out.println(buffer);

	}

	@Override
	public double caclulerSalaire() {
		// TODO Auto-generated method stub
		double salaire = this.salaire;
		switch (profil.getLibelle()) {
		case "directeur":
			salaire = salaire * 1.20;
			break;
		default:
			salaire = salaire * 1.10;
			break;
		}
		return salaire;
	}

}
