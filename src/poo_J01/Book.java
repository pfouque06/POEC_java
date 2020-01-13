package poo_J01;

public class Book extends Article {
	
	String isbn;
	long nbPages;
	public Book(String designation, long prix, String isbn, long nbPages) {
		super(designation, prix);
		this.isbn = isbn;
		this.nbPages = nbPages;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public long getNbPages() {
		return nbPages;
	}
	public void setNbPages(long nbPages) {
		this.nbPages = nbPages;
	}
	@Override
	public String toString() {
		return "Book [ " + super.toString() + ", isbn=" + isbn + ", nbPages=" + nbPages + "]";
	}
	
	

}
