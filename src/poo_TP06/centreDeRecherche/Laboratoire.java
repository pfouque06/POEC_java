package poo_TP06.centreDeRecherche;

import java.util.ArrayList;
import java.util.List;

public class Laboratoire {

	private int id;
	private static int count;
	private String nom;
	private String specialite;
	private List<Bureau> bureaux = new ArrayList<>();
	private int indexMax = 50;

	public Laboratoire(String nom, String specialite) {
		this.id = count++;
		this.nom = nom;
		this.specialite = specialite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public List<Bureau> getBureaux() {
		return bureaux;
	}

	public void setBureaux(List<Bureau> bureaux) {
		this.bureaux = bureaux;
	}

	public void add(Bureau bureau) {
		if (this.bureaux.size() < indexMax)
			this.bureaux.add(bureau);
	}

	public boolean contains(Bureau bureau) {
		return this.bureaux.contains(bureau);
	}

	public Bureau get(int index) {
		if ( index <= this.bureaux.size())
			return this.bureaux.get(index);
		return null;
	}

	public int indexOf(Bureau bureau) {
		if (this.bureaux.contains(bureau)) 
			return this.bureaux.indexOf(bureau);
		return -1;
	}

	public int getId() {
		return id;
	}

	
}
