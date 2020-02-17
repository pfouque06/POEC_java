package java8.tp05.lambda;

public class Lavomatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			// Java 8 avec lambda expression
			ImachineAlaver m1 = (nom)->{return nom + " démarre.";};
			System.out.println(m1.demarrer("Titine"));
		}
		
		{
			// <= Java 7 avec classe anonyme
			ImachineAlaver m2 = new ImachineAlaver() {
				
				@Override
				public String demarrer(String nom) {
					// TODO Auto-generated method stub
					return nom + " démarre en classe anonyme (java 7 et versions ultérieures)";
				}
			};
			System.out.println(m2.demarrer("Titine"));
		}

		{
			// <= Java 7 avec classe anonyme : 2 méthodes donc impossible d'appeller une lambda !!!
			IVehicule v1 = new IVehicule() {
				
				@Override
				public String demarrer() {
					// TODO Auto-generated method stub
					return "le véhicule démarre en classe anonyme (java 7 et versions ultérieures)";
				}

				@Override
				public String stopper() {
					// TODO Auto-generated method stub
					return "le véhicule stoppe en classe anonyme (java 7 et versions ultérieures)";
				}
			};
			System.out.println(v1.demarrer());
			System.out.println(v1.stopper());
		}
		
		
	}

}
