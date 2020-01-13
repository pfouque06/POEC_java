package poo_J01;

public class Article {

	private String designation;
	private long prix;

	public Article(String designation, long prix) {
		super();
		this.designation = designation;
		this.prix = prix;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getPrix() {
		return prix;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Article [designation=" + designation + ", prix=" + prix + "]";
	}

	void acheter() {
		System.out.println(this.designation + " est acheté");
	}
}
