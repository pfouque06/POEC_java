package com.jdbc.demo08.transaction02;

import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnseignantDaoImpl enseignants = new EnseignantDaoImpl();
		List<Enseignant> lesprofs;
		Scanner scan = new Scanner(System.in);

		// ---------------------------------------------
		System.out.println("---- display all");
		//enseignants.getAll().forEach(System.out::println);
		lesprofs = enseignants.getAll();
		lesprofs.forEach(System.out::println);
		// ---------------------------------------------

		// ---------------------------------------------
		System.out.println();
		System.out.println("---- insert Enseignant");
		System.out.print("son nom : ");
		String userName = scan.nextLine();
		System.out.print("son prenom : ");
		String userSurName = scan.nextLine();
		System.out.print("son salaire : ");
		String userPay = scan.nextLine();
		if (!userPay.matches("\\d*[.]?\\d*")) {
			System.out.println("ID doit être un double positif !");
			return;
		}
		Enseignant badass = new Enseignant(userName, userSurName, Double.valueOf(userPay));
		enseignants.save(badass);

		System.out.println("---- display all");
		//enseignants.getAll().forEach(System.out::println);
		lesprofs = enseignants.getAll();
		lesprofs.forEach(System.out::println);
		
		// ---------------------------------------------

		//---------------------------------------------
		System.out.println();
		System.out.println("---- update Enseignant by ID");
		System.out.print("son ID : ");
		String userID = scan.nextLine();
		if (!userID.matches("\\d*")) {
			System.out.println("ID doit être un entier !");
			return;
		}
		badass = enseignants.findById(Integer.valueOf(userID));
		System.out.println("badass est : " + badass);

		System.out.print("son nouveau nom : ");
		userName = scan.nextLine();
		System.out.print("son nouveau prenom : ");
		userSurName = scan.nextLine();
		System.out.print("son salaire : ");
		userPay = scan.nextLine();
		if (!userPay.matches("\\d*[.]?\\d*")) {
			System.out.println("ID doit être un double positif !");
			return;
		}
		badass.setNom(userName);
		badass.setPrenom(userSurName);
		badass.setSalaire(Double.valueOf(userPay));
		
		enseignants.update(badass);
		
		System.out.println("---- display all");
		lesprofs = enseignants.getAll();
		lesprofs.forEach(System.out::println);
		//--------------------------------------------

		
		
		// ---------------------------------------------
		System.out.println();
		System.out.println("---- delete Enseignant by name and surname");
		System.out.print("son nom : ");
		userName = scan.nextLine();
		System.out.print("son prenom : ");
		userSurName = scan.nextLine();

		lesprofs = enseignants.getAll();
		int userIndex = -1;
		for (Enseignant gugus : lesprofs) {
			if (gugus.getNom().equals(userName) && gugus.getPrenom().equals(userSurName)) {
				userIndex = gugus.getNum();
				break;
			}
		}
		if (userIndex == -1) {
			System.out.println("Enseignant introuvable !");
			return;
		}
		System.out.println("Son ID est : " + userIndex);

		enseignants.remove(userIndex);

		System.out.println("---- display all");
		lesprofs = enseignants.getAll();
		lesprofs.forEach(System.out::println);
		// ---------------------------------------------

		scan.close();
	}

}
