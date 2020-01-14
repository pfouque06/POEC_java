package ma.projet.bean;

import ma.projet.Personne;

public class Manager extends Personne {

	private String service;

	public Manager(String nom, String prenom, String mail, String tel, int salaire, String service) {
		super(nom, prenom, mail, tel, salaire);
		this.service = service;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return super.toString() + "Le salaire du manager "+getNom()+" "+getPrenom()+" est : "+getSalaire()+" €, son service : " + service;
	}
	
	@Override
	public void calculSalaire() {
		// TODO Auto-generated method stub
		double salaire = (double) getSalaire();
		salaire = salaire * 1.35;
		setSalaire((int) salaire);
	}

}
