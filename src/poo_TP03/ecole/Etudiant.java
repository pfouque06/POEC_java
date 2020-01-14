package poo_TP03.ecole;

public class Etudiant {

	private int id;
	private static int count;
	private String nom;
	private String prenom;
	private final Filiere filiere;

	public Etudiant(String nom, String prenom, Filiere filiere) {
		super();
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
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

	public Filiere getFiliere() {
		return filiere;
	}

	@Override
	public String toString() {
		return "[" + id + "] " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase() + " en filiere " + filiere.getLibelle();
	}

	
}
