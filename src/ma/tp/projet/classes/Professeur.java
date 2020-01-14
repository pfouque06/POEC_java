package ma.tp.projet.classes;

import java.util.Date;

public class Professeur extends Employe {

	private String specialit;

	public Professeur(String nom, String prenom, Date birthdate, double salaire, String specialit) {
		super(nom, prenom, birthdate, salaire);
		this.specialit = specialit;
	}

	public String getSpecialit() {
		return specialit;
	}

	public void setSpecialit(String specialit) {
		this.specialit = specialit;
	}

	@Override
	public String toString() {
		// return "Professeur [" + super.toString() + ", specialit=" + specialit + "]";
		return super.toString() + ", ma spécialité est : " + specialit;
	}

}
