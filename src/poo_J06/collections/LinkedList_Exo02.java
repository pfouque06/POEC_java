package poo_J06.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Exo02 {

	public static void main(String[] args) {
		LinkedList liste1 = new LinkedList();
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

		// parcours avec for(element : liste)
		System.out.println("liste1:");
		for (Object elt : liste1)
			System.out.print(elt + " ");
		System.out.println();
		System.out.println("liste2:");
		for (Object elt : liste2)
			System.out.print(elt + " ");
		System.out.println();
		
		// add before and after
		liste1.addFirst("zoobiii");
		liste1.addLast("la mok");
		System.out.println();

		// parcours avec for(element : liste)
		System.out.println("liste1:");
		for (Object elt : liste1)
			System.out.print(elt + " ");
		System.out.println();
	}
}
