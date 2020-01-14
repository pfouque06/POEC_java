package poo_J03;

public class Moteur {

	private int num;
	private int poids;

	public Moteur(int num, int poids) {
		super();
		this.num = num;
		this.poids = poids;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Moteur [num=" + num + ", poids=" + poids + "]";
	}

}
