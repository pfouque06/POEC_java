package ma.tp.projet.classes;

public class Employe extends Personne {

	private double salaire;

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public Employe(int id, String nom, String prenom, double salaire) {
		super(id, nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		// return "Employe [" + super.toString() + ", salaire=" + salaire + "]";
		return super.toString() + " mon salaire est: " + (int) salaire + " €";
	}

}
