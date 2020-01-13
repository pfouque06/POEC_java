package poo_J01;

public class Disque extends Article {

	String label;

	public Disque(String designation, long prix, String label) {
		super(designation, prix);
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Disque [ " + super.toString() + ", label=" + label + "]";
	}

	void ecouter() {
		System.out.println(this.getDesignation() + " est en écoute");
	}
}
