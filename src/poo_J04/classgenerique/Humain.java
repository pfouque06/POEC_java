package poo_J04.classgenerique;

public class Humain <T>{

	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	@Override
	public String toString() {
		return "Humain [ var=" + var.toString() + "]";
	}

	
}
