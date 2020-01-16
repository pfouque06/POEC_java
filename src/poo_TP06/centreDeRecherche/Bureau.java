package poo_TP06.centreDeRecherche;

import java.util.ArrayList;
import java.util.List;

import poo_TP05.ecole.Specialite;

public class Bureau {

	private int id;
	private static int count;
	private String nom;
	private String code;
	private List<Chercheur> chercheurs;
	private int indexMax = 5;

	public Bureau(String nom, String code) {
		this.id = count++;
		this.nom = nom;
		this.code = code;
		this.chercheurs = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Chercheur> getChercheurs() {
		return chercheurs;
	}

	public void setChercheurs(List<Chercheur> chercheurs) {
		this.chercheurs = chercheurs;
	}

	public void add(Chercheur chercheur) {
		if (this.chercheurs.size() < indexMax)
			this.chercheurs.add(chercheur);
	}

	public boolean contains(Chercheur chercheur) {
		return this.chercheurs.contains(chercheur);
	}

	public Chercheur get(int index) {
		if ( index <= this.chercheurs.size())
			return this.chercheurs.get(index);
		return null;
	}

	public int indexOf(Chercheur chercheur) {
		if (this.chercheurs.contains(chercheur)) 
			return this.chercheurs.indexOf(chercheur);
		return -1;
	}

	public String toStringChercheurs() {
		String chercheursList = "";
		for(Chercheur item : this.chercheurs )
			chercheursList += (chercheursList.isEmpty() ? "" : "\n") + "- " + item.toString();
		return chercheursList;
	}


	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[" + id + "] Bureau: nom=" + nom + ", code=" + code + ", chercheurs=\n" + toStringChercheurs();
	}

	
}
