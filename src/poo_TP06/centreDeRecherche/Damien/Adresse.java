package poo_TP06.centreDeRecherche.Damien;

public class Adresse {
	private int id;
	private String rue;
	private String ville;
	private int codePostal;
	private static int count;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public Adresse(String rue, String ville, int codePostal) {
		super();
		this.id = ++count;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	public void modifier(int c) {
		codePostal = c;
	}

	public String toString() {
		return "Code postal: " + codePostal + " rue: " + rue + " Ville: " + ville;
	}

	public void afficher() {
		System.out.println("Code postal: " + codePostal + " rue: " + rue + " Ville: " + ville);
	}
}