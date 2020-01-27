package com.jdbc.demo08.transaction02_prof;

import java.util.Scanner;

public class Appplication {

	public static void main(String args[]) {
		PersonneDAOImpl personneDaoImpl = new PersonneDAOImpl();
		
		System.out.println("------------------Afficher liste----------------------");
		personneDaoImpl.show();

		System.out.println();
		System.out.println("------------------Inserer une nouvelle personne---------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez rentrez un nom, svp");
		String n = sc.next();
		System.out.println("Veuillez rentrez un prénom, svp");
		String p = sc.next();
		Personne personne = new Personne(n, p);
		personneDaoImpl.show();
		
		System.out.println();
		System.out.println("------------------Modifier une personne---------------------");	
		System.out.println("Veuillez rentrez un nom, svp");
		String no = sc.next();
		System.out.println("Veuillez rentrez un prénom, svp");
		String pr = sc.next();
		System.out.println("Veuillez rentrez un identifiant, svp");
		int ide = sc.nextInt();
		Personne personne3 = new Personne();
		personne3.setNom(no);
		personne3.setPrenom(pr);
		personne3.setNum(ide);
		personneDaoImpl.updateAndShow(personne3);
		
		System.out.println();
		System.out.println("------------------Supprimer une personne---------------------");
		System.out.println("Veuillez rentrez un identifiant, svp");
		int i = sc.nextInt();
		Personne personne4 = new Personne();
		personne4.setNum(i);
		personneDaoImpl.removeAndShow(personne4);
	}
}