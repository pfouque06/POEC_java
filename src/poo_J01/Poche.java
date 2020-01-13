package poo_J01;

public class Poche extends Book {

	String categorie;

	public Poche(String designation, long prix, String isbn, long nbPages, String categorie) {
		super(designation, prix, isbn, nbPages);
		this.categorie = categorie;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Poche [ " + super.toString() + ", categorie=" + categorie + "]";
	}
	
	
}
