package poo_J01;

public class Video extends Article {

	long durée;

	public Video(String designation, long prix, long durée) {
		super(designation, prix);
		this.durée = durée;
	}

	public long getDurée() {
		return durée;
	}

	public void setDurée(long durée) {
		this.durée = durée;
	}

	@Override
	public String toString() {
		return "Video [ " + super.toString() + ", durée=" + durée + "]";
	}
	
	void afficher() {
		System.out.println(this.getDesignation() + " est en visio");
	}

}
