package exo018;

import java.io.IOException;
import java.util.Scanner;

// mini calculette
public class Exo022_EZCalculette2_prof {

	public static void main(String args[]) throws IOException {
		Scanner clavier = new Scanner(System.in);
		int choix;
		do {
			afficherMenu();
			choix = lireValiderEntier(0, 4);
			switch (choix) {
			case 1:
				additionner();
				break;
			case 2:
				soustraire();
				break;
			case 3:
				multiplier();
				break;
			case 4:
				diviser();
				break;
			}
		} while (choix != 0);
	} // fin de main


	/*------------------------------------------------------------------------------*/
	// methode permettant de lire et valider le choix
	public static int lireValiderEntier(int debut, int fin) throws IOException {
		int choix;
		boolean valeur = false;
		Scanner clavier = new Scanner(System.in);
		do {
			choix = clavier.nextInt();
			if (choix >= 0 && choix <= 4)
				valeur = true;
			else {
				System.out.print(" \tRefaire le choix :");
				valeur = false;
			}
		} while (!valeur);
		return choix;
	} // fin de methode


	/*-----------------------------------------------------------------------------*/
	// methode permettant de lire un entier
	static int lireNombreEntier() throws IOException {
		Scanner clavier = new Scanner(System.in);
		System.out.print("\n\nEntrez le nombre : ");
		int nb = clavier.nextInt();
		return nb;
	}// fin de methode
	/*------------------------------------------------------------------------------*/
	// methode permettant d'afficher le menu


	static void afficherMenu() {
		System.out.println("\n\n\n\t\tMENU PRINCIPAL\n");
		System.out.println("\t1. Additionner deux nombres\n");
		System.out.println("\t2. Soustraire deux nombres\n");
		System.out.println("\t3. Multiplier deux nombres\n");
		System.out.println("\t4. Deviser deux nombres\n");
		System.out.println("\t0. Quitter\n");
		System.out.print("\tFaites votre choix : ");
	}// fin de methode


	/*----------------------------------------------------------------------------- */
	// methode permettant d'additionner 2 entiers
	static void additionner() throws IOException {
		Scanner clavier = new Scanner(System.in);
		int nb1, nb2, resultat;
		nb1 = lireNombreEntier();
		nb2 = lireNombreEntier();
		resultat = nb1 + nb2;
		System.out.println("\n\t" + nb1 + " + " + nb2 + " = " + resultat);
	}// fin de methode
	/*------------------------------------------------------------------------------
	*/
	// methode permettant de soustraire un entier d'un autre entier


	static void soustraire() throws IOException {
		Scanner clavier = new Scanner(System.in);
		int nb1, nb2, resultat;
		nb1 = lireNombreEntier();
		nb2 = lireNombreEntier();
		resultat = nb1 - nb2;
		System.out.println("\n\t" + nb1 + " - " + nb2 + " = " + resultat);
	}// fin de methode
	/*----------------------------------------------------------------------------------------------
	--------
	*/
	// methode permettant de multiplier 2 entiers


	static void multiplier() throws IOException {
		Scanner clavier = new Scanner(System.in);
		int nb1, nb2, resultat;
		nb1 = lireNombreEntier();
		nb2 = lireNombreEntier();
		resultat = nb1 * nb2;
		System.out.println("\n\t" + nb1 + " * " + nb2 + " = " + resultat);
	}// fin de methode
	/*------------------------------------------------------------------------------*/
	// methode permettant de deviser un entier par un autre


	static void diviser() throws IOException {
	 Scanner clavier = new Scanner(System.in);
	double nb1, nb2, resultat;
	nb1 = lireNombreEntier();
	nb2 = lireNombreEntier();
	if (nb2 != 0) {
	resultat = nb1 / nb2;
	System.out.println("\n\t" + nb1 + " / " + nb2 + " = " +
	resultat);
	} else
	System.out.println("\n\t le nombre 2 est nul, devision par 0 est impossible ");
	}
}
