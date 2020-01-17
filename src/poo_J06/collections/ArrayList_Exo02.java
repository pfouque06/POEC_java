package poo_J06.collections;

import java.util.ArrayList;

public class ArrayList_Exo02 {

	public static void main(String[] args) {
		ArrayList liste = new ArrayList();
		liste.add(0);
		liste.add("bonjour");
		liste.add(2);
		liste.add(1);
		liste.set(1, "bonsoir");
		// parcous avec for(element : liste)
		for (Object elt : liste)
			System.out.print(elt + " ");
		System.out.println();
		// recherche d'un element
		String token = "bonjour";
		System.out.println("token " + token +" " + (liste.contains(token) ? "" : "not ") +"found");
		token = "bonsoir";
		System.out.println("token " + token +" " + (liste.contains(token) ? "" : "not ") +"found");
	}
}
