package poo_TP04.société.projet.test;

import java.util.ArrayList;
import java.util.List;

import poo_TP04.société.projet.Profil;
import poo_TP04.société.projet.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profil profilCP = new Profil("CP", "Chef de Projet");
		Profil profilMN = new Profil("MN", "Manager");
		Profil profilDP = new Profil("DP", "Développeur");
		
		List<Profil> profiles = new ArrayList<>();
		profiles.add(profilDP);
		profiles.add(profilMN);
		profiles.add(profilCP);
		
		System.out.println("--- La liste des profiles ---");
		System.out.println();
		profiles.forEach(System.out::println);

		List<User> utilisateurs = new ArrayList<>();
		utilisateurs.add(new User("Mister", "Magoo", profilMN));
		utilisateurs.add(new User("Jackson", "Five", profilMN));
		utilisateurs.add(new User("Raoul", "saroule", profilDP));
		utilisateurs.add(new User("Relax", "Max", profilCP));
		utilisateurs.add(new User("Tranquille", "Emile", profilDP));
		utilisateurs.add(new User("Aleze", "Blaise", profilDP));
		
		System.out.println();
		System.out.println("--- La liste des utilisateurs ---");
		System.out.println();
		utilisateurs.forEach(System.out::println);
		//employes.forEach(etudiants::affiche);

		System.out.println();
		System.out.println("--- La liste des utilisateurs par profil ---");
		System.out.println();
		for(Profil profiletype : profiles) {
			System.out.println(">> Profil : " + profiletype + ":");
			for(User zozo : utilisateurs)
				if (zozo.getProfil().equals(profiletype)) 
					System.out.println("- " + zozo);
			System.out.println();
		}
	}

	
}
