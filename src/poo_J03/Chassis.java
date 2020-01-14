package poo_J03;

public class Chassis {

	private String id;
	private String matiere;

	public Chassis(String id, String matiere) {
		super();
		this.id = id;
		this.matiere = matiere;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return "Chassis [id=" + id + ", matiere=" + matiere + "]";
	}

}
