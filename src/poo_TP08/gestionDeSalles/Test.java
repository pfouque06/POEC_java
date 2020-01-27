package poo_TP08.gestionDeSalles;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();

		System.out.println();
		System.out.println("------creation salles-------");
		Salle s1 = new Salle("A1", "Salle AA"); System.out.println(s1);
		Salle s2 = new Salle("B2", "Salle B2"); System.out.println(s2);
		Salle s3 = new Salle("C3", "Salle C3"); System.out.println(s3);
		Salle s4 = new Salle("A2", "Salle A2"); System.out.println(s4);
		Salle s5 = new Salle("C4", "Salle C4"); System.out.println(s5);

		System.out.println();
		System.out.println("------creation liste de salles-------");
		SalleService salles = new SalleService();
		salles.create(s1);
		salles.create(s2);
		salles.create(s3);
		salles.create(s4);
		salles.create(s5);

		System.out.println();
		System.out.println("------affichage liste de salles-------");
		salles.getAll().forEach(System.out::println);
		
		System.out.println();
		System.out.println("------suppression salle s3-------");
		salles.delete(s3);
		
		System.out.println();
		System.out.println("------modification salle s4-------");
		s4.setCode("A3");
		s4.setLibelle("Salle A3");
		
		System.out.println();
		System.out.println("------affichage liste de salles-------");
		salles.getAll().forEach(System.out::println);
		
		
		
		
	}

}
