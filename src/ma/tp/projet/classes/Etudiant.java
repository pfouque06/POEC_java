package ma.tp.projet.classes;

public class Etudiant extends Personne {

	private String CNE;

	public Etudiant(int id, String nom, String prenom, String cNE) {
		super(id, nom, prenom);
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
		return super.toString() + " mon CNE est: " + CNE;
	}

}
