package poo_J03;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Moteur mot = new Moteur(0, 100);
		Chassis frame = new Chassis(null, null);
		
		Vehicule tuture = new Vehicule(null, null, null, mot, frame);
		
		System.out.println(tuture);
		System.out.println(tuture.getChassis());
	}

}
