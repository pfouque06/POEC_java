package java8.tp03.lambda;

public class Lavomatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImachineAlaver m1 = (String nom)->{return nom + " démarre.";};
		System.out.println(m1.demarrer("Titine"));
	}

}
