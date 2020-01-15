package poo_TP04.société.projet;

public class Profil {

	private int id;
	private static int count;
	private String code;
	private String libelle;
	
	public Profil(String code, String libelle) {
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
		return "[" + id + "] Profil " + libelle + " (code=" + code + ")";
	}

}
