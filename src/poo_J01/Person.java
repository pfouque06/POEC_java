package poo_J01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//public abstract class Person  {
public class Person implements IMiseEnForme {

	private String nom;
	private String prenom;
	private Date birthdate;
	private Adresse adresse;

	public Person(String nom, String prenom, Date birthdate) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.birthdate = birthdate;
	}

	public Person(String nom, String prenom, Date birthdate, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.birthdate = birthdate;
		this.adresse = adresse;
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
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		return "Person [nom=" + nom + ", prenom=" + prenom + ", birthdate=" + dateFormat.format(birthdate) + "," + adresse.toString() + " ]";
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
		String date = df.format(birthdate);
		//return "Person [nom=" + nom + ", prenom=" + prenom + ", birthdate=" + date + "," + adresse.toString() + " ]";
		return "Person [nom=" + nom + ", prenom=" + prenom + ", birthdate=" + date + "," + adresse.toString() + " ]";
	}

	//public abstract void displayFullName() {
	public void displayFullName() {
		System.out.println();
	}

	@Override
	public void displayUpperCaseName() {
		// TODO Auto-generated method stub
		// System.out.println("Mon nom est " + this.getNom().toUpperCase());
		System.out.println("Mon nom est " + nom.toUpperCase());
	}

	@Override
	public void displayUpperCaseLastName() {
		// TODO Auto-generated method stub
		// System.out.println("Mon prénom est " + this.getPrenom().toUpperCase());
		System.out.println("Mon prénom est " + prenom.toUpperCase());
	}
}
