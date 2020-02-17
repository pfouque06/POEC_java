package java8.tp07.MethodReference;

import java.util.function.Consumer;

public class Dummy3 {

	public Dummy3() {}
	public Dummy3(String s) {System.out.println("Dummy3 constructor avec " + s);}
	
	public static void consumeString(Consumer<String> c, String str) {
		c.accept(str);
	}

	public static void execute(String commande) {
		System.out.println("Execution de la commande \"" + commande + "\"");
	}

	public void executor(String commande) {
		System.out.println("Executor de la commande \"" + commande + "\"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sysout ref method
		consumeString(System.out::println, "Hello !");
		
		//static Ref method
		consumeString(Dummy3::execute, "ls -la");

		Dummy3 dummy = new Dummy3();
		// instance ref method
		consumeString(dummy::executor, "ls -la");

		// constructor
		consumeString(Dummy3::new, "ls -la");
	}

}