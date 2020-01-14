package poo_J03.animal;

import java.util.ArrayList;
import java.util.List;

import poo_TP02.bean.Personne;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Animal> animaux = new ArrayList<>();
		animaux.add(new Chat("Felix"));
		animaux.add(new Chien("Scoubidou"));
		animaux.add(new Lapin("Hubert"));
		
		
		System.out.println();
		System.out.println("--- La liste des animaux (list) ---");
		System.out.println();
		animaux.forEach(Animal::crier);
		for(Animal toto : animaux) {
			System.out.println(toto.getName() + " : " + toto.crier());
		}
		
		System.out.println();
		System.out.println("--- La liste des animales (array) ---");
		System.out.println();
		
		Animal[] animales = { new Chat("Felix"), new Chien("Scoubidou"), new Lapin("Hubert") };
		for(Animal toto : animales) {
			System.out.println(toto.getName() + " : " + toto.crier());
		}
		
	}

}
