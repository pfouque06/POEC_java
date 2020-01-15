package poo_J04.classgenerique;

public class Voiture {
	String marque;

	public Voiture(String marque) {
		super();
		this.marque = marque;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + "]";
	}
	
}
