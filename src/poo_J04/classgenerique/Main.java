package poo_J04.classgenerique;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Humain<Personne> humain1 = new Humain();
		Humain<Etudiant> humain2 = new Humain();
		Humain<Voiture> humain3 = new Humain();
		
		humain1.setVar(new Personne("Mando", "Damien"));
		System.out.println(humain1.getVar());
		humain2.setVar(new Etudiant("Mando", "Damien", "novice"));
		System.out.println(humain2.getVar());
		humain3.setVar(new Voiture("chevronnée"));
		System.out.println(humain3.getVar());
		
		System.out.println();
		System.out.println("--- La liste des Humains ---");
		System.out.println();

		List<Humain> humains = new ArrayList<>();
		humains.add(humain1);
		humains.add(humain2);
		humains.add(humain3);
		humains.forEach(System.out::println);
		
	}

}
