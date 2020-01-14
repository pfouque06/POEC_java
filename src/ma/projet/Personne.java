package ma.projet;

public abstract class Personne {

	private int id;
	private static int count;
	private String nom;
	private String prenom;
	private String mail;
	private String tel;
	private int salaire;

	public Personne(String nom, String prenom, String mail, String tel, int salaire) {
		super();
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.salaire = salaire;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "[" + id + "] ";
	}

	public abstract void calculSalaire();
}
