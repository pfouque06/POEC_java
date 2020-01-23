package com.jdbc.demo08.transaction_prof;

import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonneDaoImpl personnes = new PersonneDaoImpl();
		List<Personne> lesgens;
		Scanner scan = new Scanner(System.in);

		//---------------------------------------------
		System.out.println("---- display all");
		lesgens = personnes.getAll();
		lesgens.forEach(System.out::println);
		//---------------------------------------------

		
		
		
		
		//---------------------------------------------
		System.out.println();
		System.out.println("---- insert personne");
		System.out.print("son nom : ");
		String userName = scan.nextLine();
		System.out.print("son prenom : ");
		String userSurName = scan.nextLine();

		Personne badass = new Personne(userName, userSurName);
		personnes.save(badass);

		System.out.println("---- display all");
		personnes.getAll().forEach(System.out::println);
		//---------------------------------------------

		
		
		//---------------------------------------------
		System.out.println();
		System.out.println("---- update personne by ID");
		System.out.print("son ID : ");
		String userID = scan.nextLine();
		if (!userID.matches("\\d*")) {
			System.out.println("ID doit être un entier positif !");
			return;
		}
		badass = personnes.findById(Integer.valueOf(userID));
		System.out.println("badass est : " + badass);

		System.out.print("son nouveau nom : ");
		userName = scan.nextLine();
		System.out.print("son nouveau prenom : ");
		userSurName = scan.nextLine();
		badass.setNom(userName);
		badass.setPrenom(userSurName);
		personnes.update(badass);
		
		System.out.println("---- display all");
		lesgens = personnes.getAll();
		lesgens.forEach(System.out::println);

		//---------------------------------------------
		
		
		
		//---------------------------------------------
		System.out.println();
		System.out.println("---- delete personne by name and surname");
		System.out.print("son nom : ");
		userName = scan.nextLine();
		System.out.print("son prenom : ");
		userSurName = scan.nextLine();
		badass = new Personne(userName, userSurName);
		
		lesgens = personnes.getAll();
		int userIndex = -1;
		for (Personne gugus : lesgens) {
			if ( gugus.getNom().equals(userName) && gugus.getPrenom().equals(userSurName)) {
				userIndex = gugus.getNum();
				break;
			}	
		}
		if ( userIndex == -1 ) {
			System.out.println("personnne introuvable !");
			return;
		}
		System.out.println("Son ID est : " + userIndex);
		
		personnes.remove(userIndex);
		
		
		System.out.println("---- display all");
		lesgens = personnes.getAll();
		lesgens.forEach(System.out::println);
		//---------------------------------------------

		scan.close();
	}

}
