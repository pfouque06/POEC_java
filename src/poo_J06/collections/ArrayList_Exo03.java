package poo_J06.collections;

import java.util.ArrayList;

public class ArrayList_Exo03 {

	public static void main(String[] args) {
		ArrayList liste1 = new ArrayList();
		liste1.add(0);
		liste1.add("bonjour");
		liste1.add(2);
		liste1.add(1);
		liste1.set(1, "bonsoir");
		ArrayList liste2 = new ArrayList();
		liste2.add(4);
		liste2.add(8);
		liste2.add("yooo");
		liste2.add(true);
		liste2.add("banzaiiii");
		
		// parcous avec for(element : liste)
		System.out.println("liste1:");
		for (Object elt : liste1)
			System.out.print(elt + " ");
		System.out.println();
		System.out.println("liste2:");
		for (Object elt : liste2)
			System.out.print(elt + " ");
		System.out.println();

		//add liste2 to liste1
		//liste1.addAll(2, liste2);
		liste1.addAll(liste1.size(), liste2);
		System.out.println();
		
		// parcous avec for(element : liste)
		System.out.println("liste1:");
		for (Object elt : liste1)
			System.out.print(elt + " ");
		System.out.println();
		System.out.println("liste2:");
		for (Object elt : liste2)
			System.out.print(elt + " ");
		System.out.println();
	}
}
