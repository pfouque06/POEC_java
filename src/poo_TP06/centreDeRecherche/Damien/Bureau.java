package poo_TP06.centreDeRecherche.Damien;

import java.util.List;

public class Bureau {
	private int id;
	private int code;
	private String nom;
	private List<Chercheur> staff;
	private static int count;

	public Bureau(int code, String nom, List<Chercheur> staff) {
		super();
		this.id = ++count;
		this.code = code;
		this.nom = nom;
		this.staff = staff;
	}

	public Bureau() {
		super();
// TODO Auto-generated constructor stub
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Chercheur> getStaff() {
		return staff;
	}

	public void setStaff(List<Chercheur> staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Bureau [id=" + id + ", code=" + code + ", nom=" + nom + ", staff=" + staff + "]";
	}

	public void afficher() {
		System.out.println("code: " + code + " Nom: " + nom + " staff: " + staff);
	}
}