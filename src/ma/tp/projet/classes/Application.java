package ma.tp.projet.classes;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Personne> employes = new ArrayList<>();
		employes.add(new Employe(0, "Baton", "Jean", 1500));
		employes.add(new Employe(1, "Garros", "Roland", 100));

		List<Personne> etudiants = new ArrayList<>();
		etudiants.add(new ma.tp.projet.classes.Etudiant(2, "Clire", "Marie", "65678754"));
		etudiants.add(new ma.tp.projet.classes.Etudiant(3, "Doe", "Thomas", "87543543"));

		List<Personne> professeurs = new ArrayList<>();
		professeurs.add(new Professeur(4, "Frey", "Kevin", 5700, "JAVA/JEE"));
		professeurs.add(new Professeur(5, "Dupont", "Mathieu", 5000, "Mathématique"));

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
