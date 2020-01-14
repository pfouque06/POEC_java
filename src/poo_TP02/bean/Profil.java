package poo_TP02.bean;

public class Profil {

	private int id;
	private static int count;
	private int code;
	private String libelle;

	public Profil(int code, String libelle) {
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

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
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
		return "Profil [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}

}
