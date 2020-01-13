package poo_J01;

public class Voiture {

	private String immatriculation;
	private String marque;
	private String modele;
	private int power;
	private String couleur;
	
	public Voiture(String immatriculation, String marque, String modele, int power, String couleur) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.power = power;
		this.couleur = couleur;
	}

	public String getImmatriculion() {
		return immatriculation;
	}

	public void setImmatriculion(String immatriculion) {
		this.immatriculation = immatriculion;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Voiture [immatriculation=" + immatriculation + ", marque=" + marque + ", modele=" + modele + ", power="
				+ power + ", couleur=" + couleur + "]";
	}
	
}
