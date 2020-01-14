package ma.tp.projet.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Personne> employes = new ArrayList<>();
		employes.add(new Employe("Baton", "Jean",  new Date("01/01/2000"), 1500));
		employes.add(new Employe("Garros", "Roland",  new Date("01/01/2000"), 100));

		List<Personne> etudiants = new ArrayList<>();
		etudiants.add(new ma.tp.projet.classes.Etudiant("Clire", "Marie",  new Date("01/01/2000"), "65678754"));
		etudiants.add(new ma.tp.projet.classes.Etudiant("Doe", "Thomas",  new Date("01/01/2000"), "87543543"));

		List<Personne> professeurs = new ArrayList<>();
		professeurs.add(new Professeur("Frey", "Kevin",  new Date("01/01/2000"), 5700, "JAVA/JEE"));
		professeurs.add(new Professeur("Dupont", "Mathieu",  new Date("01/01/2000"), 5000, "Mathématique"));

		System.out.println();
		System.out.println("La liste des employes :");
		System.out.println();
		employes.forEach(System.out::println);
		System.out.println();
		System.out.println("La liste des étudiants :");
		System.out.println();
		etudiants.forEach(System.out::println);
		System.out.println();
		System.out.println("La liste des professeurs :");
		System.out.println();
		professeurs.forEach(System.out::println);

		//System.out.println((a,b) -> a+b;);
	}

}
