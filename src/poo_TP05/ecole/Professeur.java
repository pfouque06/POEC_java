package poo_TP05.ecole;

import java.util.LinkedHashSet;

public class Professeur {

	private int id;
	private static int count;
	private String nom;
	private String prenom;
	private final LinkedHashSet<Specialite> specialites = new LinkedHashSet<Specialite>();;

	public Professeur(String nom, String prenom, Specialite specialite) {
		super();
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.specialites.add(specialite);
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

	public String toStringSpecialites() {
		String specialiteList = "";
		for(Specialite item : specialites )
			specialiteList += (specialiteList.isEmpty() ? "" : ", ") +  item.toString();
		return specialiteList;
	}

	public LinkedHashSet<Specialite> getSpecialites() {
		//return specialites.forEach(Specialite::toString);
		return this.specialites;
	}

	public boolean containsSpecialite(Specialite specialite) {
		return this.specialites.contains(specialite);
	}
	
	public void addSpecialite(Specialite specialite) {
		this.specialites.add(specialite);
	}
	
	@Override
	public String toString() {
		return "[" + id + "] " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase() + ", specialités : " + toStringSpecialites();
	}

	
}
