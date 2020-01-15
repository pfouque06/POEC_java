package poo_TP05.ecole.test;

import java.util.ArrayList;
import java.util.List;

import poo_TP05.ecole.Professeur;
import poo_TP05.ecole.Specialite;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Specialite speNT = new Specialite("NT", ".net");
		Specialite speJJ = new Specialite("JJ", "JAVA/JEE");
		Specialite speGP = new Specialite("GP", "Gestion de Projet");
		Specialite speCO = new Specialite("CO", "CISCO");
		Specialite spePH = new Specialite("PH", "PHP");
		
		List<Specialite> specialites = new ArrayList<>();
		specialites.add(speNT);
		specialites.add(speJJ);
		specialites.add(speGP);
		specialites.add(speCO);
		specialites.add(spePH);
		

		List<Professeur> professeurs = new ArrayList<>();
		professeurs.add(new Professeur("Mandolarian", "Damien", speJJ));
		professeurs.add(new Professeur("Mister", "Magoo", speJJ));
		professeurs.add(new Professeur("Jackson", "Five", speCO));
		professeurs.add(new Professeur("Raoul", "saroule", speCO));
		professeurs.add(new Professeur("Relax", "Max", speNT));
		professeurs.add(new Professeur("Tranquille", "Emile", speGP));
		professeurs.add(new Professeur("Aleze", "Blaise", spePH));
		
		System.out.println("--- La liste des specialites ---");
		System.out.println();
		specialites.forEach(System.out::println);

		System.out.println();
		System.out.println("--- La liste des professeurs ---");
		System.out.println();
		professeurs.forEach(System.out::println);
		//employes.forEach(etudiants::affiche);

		System.out.println();
		System.out.println("--- La liste des professeurs par Specialite ---");
		System.out.println();
		for(Specialite speType : specialites) {
			System.out.println("Specialite " + speType.getLibelle() + ":");
			for(Professeur zozo : professeurs)
				//if (zozo.containsSpecialite(speType)) 
				if (zozo.getSpecialites().contains(speType)) 
					System.out.println(zozo);
			System.out.println();
		}
	}

	
}
