package poo_TP08.gestionDeSalles;

public class Salle {

	private int id;
	private static int count;
	
	private String code;
	private String libelle;
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	public Salle(String code, String libelle) {
		super();
		this.id = this.count++;
		this.code = code;
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Salle [" + id + "] " + code + ", " + libelle;
	}
	
	
}
