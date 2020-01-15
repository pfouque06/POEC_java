package poo_J04.classgenerique;

public class Exemple<T, S> {

	private T var1;
	private S var2;

	public T getVar1() {
		return var1;
	}

	public void setVar1(T var1) {
		this.var1 = var1;
	}

	public S getVar2() {
		return var2;
	}

	public void setVar2(S var2) {
		this.var2 = var2;
	}

	public static void main(String[] args) {
		Exemple<Integer,String> toto = new Exemple<Integer,String>();
		toto.setVar1(10);
		toto.setVar2("Bonjour");
		System.out.println("var1: " + toto.getVar1().getClass().getTypeName() + " " + toto.getVar1());
		System.out.println("var2: " + toto.getVar2().getClass().getTypeName() + " " + toto.getVar2());
//		Exemple<String> chaine = new Exemple<String>();
//		chaine.setVar("Bonjour");
//		System.out.println(chaine.getVar().getClass().getTypeName() + " " + chaine.getVar());
//		Exemple<Double> doob = new Exemple<Double>();
//		doob.setVar(100d);
//		System.out.println(doob.getVar().getClass().getTypeName() + " " + doob.getVar());
	}
}
