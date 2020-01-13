package poo_J01;

import java.util.Date;

public class Etudiant extends Person {

	private String niveau;

	public Etudiant(String nom, String prenom, Date birthdate, String niveau) {
		super(nom, prenom, birthdate);
		this.niveau = niveau;
	}

	public Etudiant(String nom, String prenom, Date birthdate, Adresse adresse, String niveau) {
		super(nom, prenom, birthdate, adresse);
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant [ " + super.toString() + ", niveau=" + niveau + ", " + "]";
	}

	@Override
	public void displayFullName() {
		// TODO Auto-generated method stub
		System.out.println("Je suis etudiant: " + this.getNom() + " " +this.getPrenom());
	}

}
