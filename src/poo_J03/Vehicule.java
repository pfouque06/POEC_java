package poo_J03;

public class Vehicule {

	private String immatriculation;
	private String marque;
	private String model;
	private Moteur moteur; // aggregation simple
	private final Chassis chassis; // composition = aggregation "forte" --> no setter !!!

	public Vehicule(String immatriculation, String marque, String model, Moteur moteur, Chassis chassis) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.model = model;
		this.moteur = moteur;
		this.chassis = chassis;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public Chassis getChassis() {
		return chassis;
	}

//	public void setChassis(Chassis chassis) {
//		this.chassis = chassis;
//	}

	@Override
	public String toString() {
		return "Vehicule [immatriculation=" + immatriculation + ", marque=" + marque + ", model=" + model + ", moteur="
				+ moteur + ", chassis=" + chassis + "]";
	}

}
