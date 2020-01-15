package poo_TP06.centreDeRecherche;

public class Adresse {

	private int id;
	private static int count;
	private String gouvernorat;
	private String ville;
	private String CP;
	
	public Adresse() {
		this.id = count++;
	}
	public Adresse(String gouvernorat, String ville, String cP) {
		this.id = count++;
		this.gouvernorat = gouvernorat;
		this.ville = ville;
		CP = cP;
	}
	
	public int getId() {
		return id;
	}

	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}

	@Override
	public String toString() {
		return "[" + id + "] Adresse: gouvernorat=" + gouvernorat + ", ville=" + ville + ", CP=" + CP;
	}
	
	
}
