package poo_J06.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSet_Exo03 {

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
		System.out.println("liste1 contains " + liste1.size() +" elements");

		Object[] tempArray = liste1.toArray();
		// parcours avec for(element : liste)
		System.out.println("tempArray:");
		for (Object elt : tempArray)
			System.out.print(elt + " ");
		System.out.println();
		List<Object> tempList = Arrays.asList(tempArray);
		// parcours avec for(element : liste)
		System.out.println("tempList:");
		for (Object elt : tempList)
			System.out.print(elt + " ");
		System.out.println();
		//ArrayList newListe1 = new ArrayList(tempList);
		//ArrayList newListe1 = new ArrayList(Arrays.asList(tempArray));
		ArrayList newListe1 = new ArrayList(Arrays.asList(liste1.toArray()));

		// parcours avec for(element : liste)
		System.out.println("Liste1:");
		for (Object elt : newListe1)
			System.out.print(elt + " ");
		System.out.println();
		System.out.println("newListe1 contains " + newListe1.size() +" elements");
		
	}
}
