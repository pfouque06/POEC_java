package ma.tp.projet.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Personne {

	private int id;
	private static int count;
	private String nom, prenom;
	private Date birthdate;

	public Personne(String nom, String prenom, Date birthdate) {
		super();
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.birthdate = birthdate;
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

	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
		String birthdate_ = dateFormat.format(birthdate);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
//		String birthdate_ = df.format(birthdate);
		
		return "["+id+"] Je suis " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase() + ", né le " + birthdate_;
	}

}
