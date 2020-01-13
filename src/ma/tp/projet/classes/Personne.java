package ma.tp.projet.classes;

public class Personne {

	private int id;
	private String nom, prenom;

	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
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
		return "Je suis " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
	}

}
