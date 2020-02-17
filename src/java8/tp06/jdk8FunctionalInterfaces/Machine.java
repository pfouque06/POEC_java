package java8.tp06.jdk8FunctionalInterfaces;

public class Machine {

	private int annee;
	private String nom;

	public Machine(int annee, String nom) {
		super();
		this.annee = annee;
		this.nom = nom;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Machine [annee=" + annee + ", nom=" + nom + "]";
	}

}
