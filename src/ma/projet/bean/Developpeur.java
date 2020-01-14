package ma.projet.bean;

import ma.projet.Personne;

public class Developpeur extends Personne {

	private String specialite;

	public Developpeur(String nom, String prenom, String mail, String tel, int salaire, String specialite) {
		super(nom, prenom, mail, tel, salaire);
		this.specialite = specialite;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return super.toString() + "Le salaire du développeur "+getNom()+" "+getPrenom()+" est : "+getSalaire()+" €, sa specialite : " + specialite;
	}

	@Override
	public void calculSalaire() {
		// TODO Auto-generated method stub
		double salaire = (double) getSalaire();
		salaire = salaire * 1.2;
		setSalaire((int) salaire);
	}

}
