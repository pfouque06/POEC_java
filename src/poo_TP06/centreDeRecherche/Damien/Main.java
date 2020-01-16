package poo_TP06.centreDeRecherche.Damien;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Adresse adr = new Adresse("Rue Massena", "Nice", 2000);
		adr.afficher();
		adr.modifier(1987);
		adr.afficher();
		Adresse adr2 = new Adresse("Place de la liberte", "Toulon", 1500);
		adr2.afficher();
		adr2.modifier(10100);
		adr2.afficher();
		Chercheur C = new Chercheur("Francis", "Developpeur", 121651);
		C.afficher();
		Chercheur C2 = new Chercheur("Julien", "Integrateur", 15);
		System.out.println(C2);
		System.out.println("Nombre de chercheurs = " + C.nbrPersonnes);
		Boolean tes = C.comparer(C2);
		if (tes == true)
			System.out.println("les deux chercheurs sont identiques");
		else
			System.out.println("les deux chercheurs sont DIFFERENTS");
		C2.modifier(54651654);
		C.modifier(777777);
		Chercheur C3 = new Chercheur();
		C3.ajouter("Jean", "techlead", 55555);
		C3.afficher();
		System.out.println("Nombre de chercheurs = " + C.nbrPersonnes);
		List<Chercheur> staff = new ArrayList<>();
		staff.add(C);
		staff.add(C2);
		staff.add(C3);
		Bureau B1 = new Bureau(111, "bur1", staff);
		Bureau B2 = new Bureau(111, "bur1", staff);
		List<Bureau> bureaux = new ArrayList<>();
		bureaux.add(B1);
		bureaux.add(B2);
		Laboratoire L = new Laboratoire("lab1", "spce1", adr, bureaux);
		System.out.println("------------------------------------------------");
		L.afficher();
		System.out.println(L);
	}
}