package poo_J04.classgenerique;

public class Exemple02 <T> {
	
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	
	public static void main(String[] args) {
		Exemple02<Integer> entier = new Exemple02<Integer>();
		entier.setVar(10);
		System.out.println(entier.getVar().getClass().getTypeName() + " " + entier.getVar());
		Exemple02<String> chaine = new Exemple02<String>();
		chaine.setVar("Bonjour");
		System.out.println(chaine.getVar().getClass().getTypeName() + " " + chaine.getVar());
		Exemple02<Double> doob = new Exemple02<Double>();
		doob.setVar(100d);
		System.out.println(doob.getVar().getClass().getTypeName() + " " + doob.getVar());
	}
}
