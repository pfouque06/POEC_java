package poo_TP06.centreDeRecherche.test;

import java.util.ArrayList;
import java.util.List;

import poo_TP06.centreDeRecherche.Adresse;
import poo_TP06.centreDeRecherche.Bureau;
import poo_TP06.centreDeRecherche.Chercheur;
import poo_TP06.centreDeRecherche.Laboratoire;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Chercheur> chercheurs = new ArrayList<>();
		List<Bureau> bureaux = new ArrayList<>();
		List<Laboratoire> laboratoires = new ArrayList<>();

		System.out.println("--- adresse1 ---");
		Adresse adresse1 = new Adresse();
		System.out.println(adresse1);
		adresse1.setGouvernorat("toto");
		adresse1.setVille("Nice");
		adresse1.setCP("06000");
		System.out.println(adresse1);
		adresse1.setCP("07000");
		System.out.println(adresse1);
		
		System.out.println();
		System.out.println("--- adresse2 ---");
		Adresse adresse2 = new Adresse("titi", "Cannes", "06800");
		System.out.println(adresse2);
		adresse2.setVille("Cagnes");
		System.out.println(adresse2);

		System.out.println();
		System.out.println("--- chercheur1 ---");
		Chercheur chercheur1 = new Chercheur();
		chercheur1.setNom("Raoul");
		chercheur1.setPrenom("Saroul");
		chercheur1.setPoste("11");
		chercheur1.setComputerID("aa01");
		System.out.println(chercheur1);

		System.out.println();
		System.out.println("--- chercheur2 ---");
		Chercheur chercheur2 = new Chercheur("Mando", "Damien", "12", "abc");
		System.out.println(chercheur2);

		System.out.println();
		System.out.println("--- liste de chercheur ---");
		chercheurs.add(chercheur1);
		chercheurs.add(chercheur2);
		System.out.println("nbr de chercheurs : " + chercheurs.size());
		chercheurs.forEach(System.out::println);

		System.out.println();
		System.out.println("--- chercheur1 ---");
		chercheur1.setComputerID("ab01");
		System.out.println(chercheur1);
		System.out.println("--- liste de chercheur ---");
		chercheurs.forEach(System.out::println);
		
		System.out.println();
		System.out.println("--- chercheur3 ---");
		Chercheur chercheur3 = new Chercheur();
		chercheur3.setNom("Aleze");
		chercheur3.setPrenom("Blaise");
		chercheur3.setPoste("44");
		chercheur3.setComputerID("dc01");
		chercheurs.add(chercheur3);
		System.out.println(chercheur3);
		System.out.println("--- liste de chercheur ---");
		chercheurs.forEach(System.out::println);

		System.out.println();
		System.out.println("--- liste de bureaux ---");
		Bureau bureau1 = new Bureau("bureau1", "AA");
		bureau1.add(chercheur1);
		bureau1.add(chercheur2);
		bureau1.add(chercheur3);
		bureaux.add(bureau1);
		Bureau bureau2 = new Bureau("bureau2", "BB");
		bureaux.add(bureau2);
		chercheurs.add(new Chercheur("Mister", "Magoo", null, null));
		chercheurs.add(new Chercheur("Tranquille", "Emile", null, null));
		chercheurs.add(new Chercheur("Relax", "Relax", null, null));
		bureau2.add(chercheurs.get(3));
		bureau2.add(chercheurs.get(4));
		bureau2.add(chercheurs.get(5));
		bureaux.forEach(System.out::println);

		System.out.println();
		System.out.println("--- liste de bureaux ---");
//		specialites.add(speJJ);
//		specialites.add(speGP);
//		specialites.add(speCO);
//		specialites.add(spePH);
//		
//
//		List<Professeur> professeurs = new ArrayList<>();
//		professeurs.add(new Professeur("Mandolarian", "Damien", speJJ));
//		professeurs.add(new Professeur("Mister", "Magoo", speJJ));
//		professeurs.add(new Professeur("Jackson", "Five", speCO));
//		professeurs.add(new Professeur("Raoul", "saroule", speCO));
//		professeurs.add(new Professeur("Relax", "Max", speNT));
//		professeurs.add(new Professeur("Tranquille", "Emile", speGP));
//		professeurs.add(new Professeur("Aleze", "Blaise", spePH));
//		
//		System.out.println("--- La liste des specialites ---");
//		System.out.println();
//		specialites.forEach(System.out::println);
//
//		System.out.println();
//		System.out.println("--- La liste des professeurs ---");
//		System.out.println();
//		professeurs.forEach(System.out::println);
//		//employes.forEach(etudiants::affiche);
//
//		System.out.println();
//		System.out.println("--- La liste des professeurs par Specialite ---");
//		System.out.println();
//		for(Specialite speType : specialites) {
//			System.out.println("Specialite " + speType.getLibelle() + ":");
//			for(Professeur zozo : professeurs)
//				//if (zozo.containsSpecialite(speType)) 
//				if (zozo.getSpecialites().contains(speType)) 
//					System.out.println(zozo);
//			System.out.println();
//		}
	}

	
}
