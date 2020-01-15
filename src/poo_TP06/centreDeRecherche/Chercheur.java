package poo_TP06.centreDeRecherche;

public class Chercheur {

	private int id;
	private static int count;
	private String nom;
	private String prenom;
	private String poste;
	private String computerID;

	public Chercheur() {
		this.id = count++;
	}
	public Chercheur(String nom, String prenom, String poste, String computerID) {
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.poste = poste;
		this.computerID = computerID;
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

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getComputerID() {
		return computerID;
	}

	public void setComputerID(String computerID) {
		this.computerID = computerID;
	}

	public int getId() {
		return id;
	}

	public boolean comparer(Chercheur ch) {
		if (! this.nom.equals(ch.getNom()))
			return false;
		if (! this.prenom.equals(ch.getPrenom()))
			return false;
		if (! this.poste.equals(ch.getPoste()))
			return false;
		if (! this.computerID.equals(ch.getComputerID()))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[" + id + "] Chercheur: nom=" + nom + ", prenom=" + prenom + ", poste=" + poste + ", computerID="
				+ computerID;
	}

	
}
