package poo_J01;

public class Livre {

	String title;
	String author;
	String editor;
	int year;
	int yearFirstEdition;
	String genre;
	Float price;
	String ISBN;
	public Livre(String title, String author, String editor, int year, int yearFirstEdition, String genre,
			Float price, String idISBN) {
		super();
		this.title = title;
		this.author = author;
		this.editor = editor;
		this.year = year;
		this.yearFirstEdition = yearFirstEdition;
		this.genre = genre;
		this.price = price;
		this.ISBN = idISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYearFirstEdition() {
		return yearFirstEdition;
	}
	public void setYearFirstEdition(int yearFirstEdition) {
		this.yearFirstEdition = yearFirstEdition;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getIdISBN() {
		return ISBN;
	}
	public void setIdISBN(String pISBN) {
		this.ISBN = pISBN;
	}
	@Override
	public String toString() {
		return String.format(
				"Livre [title=%s, author=%s, editor=%s, year=%s, yearFirstEdition=%s, genre=%s, price=%s, ISBN=%s]",
				title, author, editor, year, yearFirstEdition, genre, price, ISBN);
	}

// operator overloading is NOT supported in Java
// java-OO (java Operator Overloading) plugin can sort thas out 
//	public Livre operate_add(Livre pLivre)
//	{
//		String result = this.title + pLivre.getTitle();
//		float sum = this.price + pLivre.getPrice();
//		Livre tuture = new Livre(result, this.author, this.editor, this.year, this.yearFirstEdition, this.genre, sum,
//				this.ISBN);
//		return tuture;
//	}

}
