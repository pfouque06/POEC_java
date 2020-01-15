package poo_J04.classgenerique;

public class Operation <T> {
	
	private T var1;
	private T var2;
	public Operation(T var1, T var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public void plus() {
		if (var1.getClass().getSimpleName().equals("Double"))
			System.out.println(Double.parseDouble(var1.toString()) + Double.parseDouble(var2.toString()));
		else if (var1.getClass().getSimpleName().equals("Integer"))
			System.out.println(Integer.parseInt(var1.toString()) + Integer.parseInt(var2.toString()));
		else if (var1.getClass().getSimpleName().equals("Boolean"))
			System.out.println(Boolean.parseBoolean(var1.toString()) || Boolean.parseBoolean(var2.toString()));
		else
			System.out.println(var1.toString() + var2.toString());
		
	}

	public static void main(String[] args) {
		Operation<Integer> operation1 = new Operation<Integer> (5,3);
		operation1.plus();
		Operation<String> operation2 = new Operation<String> ("bon","jour");
		operation2.plus();
		Operation<Double> operation3 = new Operation<Double> (5.2,3.8);
		operation3.plus();
		Operation<Boolean> operation4 = new Operation<Boolean> (true, false);
		operation4.plus();
	}
}
