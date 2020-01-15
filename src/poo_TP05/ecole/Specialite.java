package poo_TP05.ecole;

public class Specialite {

	private int id;
	private static int count;
	private String code;
	private String libelle;
	
	public Specialite(String code, String libelle) {
		super();
		this.id = count++;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "[" + id + "] " + libelle + " (code=" + code + ")";
	}

}
