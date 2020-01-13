package poo_J01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String nom;
	private String prenom;
	private Date birthdate;

	public Person(String nom, String prenom, Date birthdate) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.birthdate = birthdate;
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

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return "Person [nom=" + nom + ", prenom=" + prenom + ", birthdate=" + dateFormat.format(birthdate) + "]";
	}

}
