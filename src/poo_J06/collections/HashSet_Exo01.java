package poo_J06.collections;

import java.util.HashSet;
import java.util.Hashtable;

public class HashSet_Exo01 {

	public static void main(String[] args) {
		HashSet liste1 = new HashSet();
		liste1.add(0);
		liste1.add("bonjour");
		liste1.add(2);
		liste1.add(1);
		liste1.remove("bonjour");
		liste1.add("bonsoir");
		HashSet liste2 = new HashSet();
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
		System.out.println();
		
		System.out.println("liste contains " + liste1.size() +" elements");
		
	}
}
