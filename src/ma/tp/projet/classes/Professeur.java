package ma.tp.projet.classes;

public class Professeur extends Employe {

	private String specialit;

	public Professeur(int id, String nom, String prenom, double salaire, String specialit) {
		super(id, nom, prenom, salaire);
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
		return super.toString() + " ma spécialité est : " + specialit;
	}

}
