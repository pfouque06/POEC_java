package poo_J01;

public class Broché extends Book {

	public Broché(String designation, long prix, String isbn, long nbPages) {
		super(designation, prix, isbn, nbPages);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Broché [ " + super.toString() + "]";
	}

	
}
