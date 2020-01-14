package poo_J03.animal;

public abstract class Animal implements Expression {
	
	private String name;
	private String race;
	public Animal(String name, String race) {
		super();
		this.name = name;
		this.race = race;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	@Override
	public abstract String crier();

}
