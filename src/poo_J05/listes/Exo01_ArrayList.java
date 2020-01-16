package poo_J05.listes;

import java.util.ArrayList;

public class Exo01_ArrayList {

	public static void main(String[] args) {
		ArrayList liste = new ArrayList();
		liste.add(0);
		liste.add("bonjour");
		liste.add(2);
		for (Object elt : liste)
			System.out.print(elt + " ");
		System.out.println();
		liste.remove(1);
		liste.set(1, "bonsoir");
		for (Object elt : liste)
			System.out.print(elt + " ");
	}
}
