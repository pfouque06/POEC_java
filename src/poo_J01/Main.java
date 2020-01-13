package poo_J01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Voiture toto = new Voiture("toto", "marque1", "modele1", 10, "couleur1");
		System.out.println(toto);
		
		List<Voiture> listVoiture = new ArrayList<>();
		listVoiture.add(toto);
		Voiture tata = new Voiture("tata", "marque2", "modele2", 20, "couleur2");
		listVoiture.add(tata);
		listVoiture.add(new Voiture("titi", "marque3", "modele3", 30, "couleur3"));
		
		System.out.println("\n------------------------------------------------");
		// prog fonctionnel java 8
		listVoiture.forEach(Voiture -> System.out.println(Voiture));
		
		System.out.println("\n------------------------------------------------");
		// prog fonctionnel java 8
		listVoiture.forEach(System.out::println);
		
		System.out.println("\n------------------------------------------------");
		// prog java 5
		for (Voiture voiture : listVoiture) 
			System.out.println(voiture);
		
		System.out.println("\n------------------------------------------------");
		// prog legacy
		for (int index = 0; index < listVoiture.size(); index++) 
		      System.out.println(listVoiture.get(index));
		
		System.out.println("\n------------------------------------------------");
		System.out.println(tata);
		System.out.println(tata.getClass());
		System.out.println(tata.hashCode());
		tata = toto;
		System.out.println("tata = toto\n--->");
		System.out.println(toto);
		System.out.println(toto.getClass());
		System.out.println(toto.hashCode());
		System.out.println(tata);
		System.out.println(tata.getClass());
		System.out.println(tata.hashCode());
		
		System.out.println("\n------------------------------------------------");
		Livre livre1 = new Livre("title1", "author", "editor", 2011, 2001, "genre", 11.0f, "ISBN1");
		Livre livre2 = new Livre("title2", "author", "editor", 2012, 2002, "genre", 12.0f, "ISBN2");
		Livre livre3 = new Livre("title3", "author", "editor", 2013, 2003, "genre", 13.0f, "ISBN3");
		
		List<Livre> listLivre = new ArrayList<>();
		listLivre.add(livre1);
		listLivre.add(livre2);
		listLivre.add(livre3);

		listLivre.forEach(System.out::println);

//		System.out.println("\n------------------------------------------------");
//		Livre livre3 = livre1 + livre2;
		
		System.out.println("\n------------------------------------------------");
		
		Adresse addr = new Adresse("rue toto", 06000, "Nice");
		
		Person prof = new Enseignant("Mandolorien", "Damien", new Date("01/01/2000"), addr, 400000, new Date("01/01/2020"));
		Person Sihem = new Etudiant("Abrot", "Sihem", new Date("01/01/2010"), addr, "maternelle");
		System.out.println(prof);
		System.out.println(Sihem);

		System.out.println("\n------------------------------------------------");
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(prof);
		listPerson.add(Sihem);
		listPerson.add(new Etudiant("Claquos", "Thierry", new Date("01/01/1901"), addr, "bac+50.000"));
		listPerson.add(new Etudiant("Chechout", "Philou", new Date("01/01/1002"), addr, "bac-15"));
		
		listPerson.forEach(System.out::println);
		listPerson.forEach(Person::displayFullName);
		listPerson.forEach(Person::displayUpperCaseName);
		listPerson.forEach(Person::displayUpperCaseLastName);
		

		System.out.println("\n------------------------------------------------");
		List<Article> listArticles = new ArrayList<>();
		listArticles.add(new Broché("broché", 100, "666", 100));
		listArticles.add(new Poche("poche", 100, "666", 100, "Manga"));
		listArticles.add(new Disque("disque", 100, "label"));
		listArticles.add(new Video("video", 100, 60));
		
		listArticles.forEach(System.out::println);
		
		Article p1 = new Poche("poche1", 15, "2h2h2gf3f", 174, "roman");
		Article d1 = new Disque("IAM", 19, "Universal");
		Article v1 = new Video("Matrix", 14, 150);
		System.out.println("\n--------Le livre de poche est achete----------");
		p1.acheter();
		((Book) p1).lire();
		System.out.println("\n--------Le disque est achete et ecoute------------------");
		d1.acheter();
		((Disque) d1).ecouter();
		System.out.println("\n---------La video est achete et lue -----------------");
		v1.acheter();
		((Video) v1).afficher();

	}

}
