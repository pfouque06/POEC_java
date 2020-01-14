package poo_TP03.ecole.test;

import java.util.ArrayList;
import java.util.List;

import poo_TP02.bean.Personne;
import poo_TP03.ecole.Etudiant;
import poo_TP03.ecole.Filiere;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Filiere php = new Filiere(15, "PHP");
		Filiere js = new Filiere(20, "JavaScript");
		Filiere java = new Filiere(25, "Java");
		Filiere angular = new Filiere(50, "Angular");
		
		List<Filiere> filieres = new ArrayList<>();
		filieres.add(php);
		filieres.add(js);
		filieres.add(java);
		filieres.add(angular);
		

		List<Etudiant> etudiants = new ArrayList<>();
		etudiants.add(new Etudiant("Mister", "Magoo", php));
		etudiants.add(new Etudiant("Jackson", "Five", js));
		etudiants.add(new Etudiant("Raoul", "saroule", java));
		etudiants.add(new Etudiant("Relax", "Max", angular));
		etudiants.add(new Etudiant("Tranquille", "Emile", java));
		etudiants.add(new Etudiant("Aleze", "Blaise", angular));
		
		System.out.println("--- La liste des filieres ---");
		System.out.println();
		filieres.forEach(System.out::println);

		System.out.println();
		System.out.println("--- La liste des etudiants ---");
		System.out.println();
		etudiants.forEach(System.out::println);
		//employes.forEach(etudiants::affiche);

		System.out.println();
		System.out.println("--- La liste des etudiants par filiere ---");
		System.out.println();
		for(Filiere filiere : filieres) {
			System.out.println("Filiere " + filiere.getLibelle() + ":");
			for(Etudiant zozo : etudiants)
				if (zozo.getFiliere().equals(filiere)) 
					System.out.println(zozo);
			System.out.println();
		}
	}

	
}
