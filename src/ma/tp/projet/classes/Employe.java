package ma.tp.projet.classes;

import java.util.Date;

public class Employe extends Personne {

	private double salaire;

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Employe(String nom, String prenom, Date birthdate, double salaire) {
		super(nom, prenom, birthdate);
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		// return "Employe [" + super.toString() + ", salaire=" + salaire + "]";
		return super.toString() + ", mon salaire est: " + (int) salaire + " €";
	}

}
