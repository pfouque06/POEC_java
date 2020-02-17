package java8.tp02.lambda;

public class Lavomatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImachineAlaver m1 = (nom)->{System.out.println(nom + " démarre.");};
		m1.demarrer("Titine");
	}

}
