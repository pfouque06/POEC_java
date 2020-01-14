package ma.tp.projet.classes;

import java.util.Date;

public class Etudiant extends Personne {

	private String CNE;

	public Etudiant(String nom, String prenom, Date birthdate, String cNE) {
		super(nom, prenom, birthdate);
		CNE = cNE;
	}

	public String getCNE() {
		return CNE;
	}

	public void setCNE(String cNE) {
		CNE = cNE;
	}

	@Override
	public String toString() {
		// return "Etudiant [" + super.toString() + ", CNE=" + CNE + "]";
		return super.toString() + ", mon CNE est: " + CNE;
	}

}
