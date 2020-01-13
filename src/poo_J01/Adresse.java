package poo_J01;

public class Adresse {

	private String rue;
	private long codePostale;
	private String ville;

	public Adresse(String rue, long codePostale, String ville) {
		super();
		this.rue = rue;
		this.codePostale = codePostale;
		ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public long getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(long codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse\n" + rue + "\n" + codePostale + ", " + ville;
	}

}
