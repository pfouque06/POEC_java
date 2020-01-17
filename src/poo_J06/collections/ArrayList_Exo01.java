package poo_J06.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_Exo01 {

	public static void main(String[] args) {
		ArrayList liste = new ArrayList();
		liste.add(0);
		liste.add("bonjour");
		liste.add(2);
		// parcous avec liste.forEach(syso)
		liste.forEach(System.out::println);
		System.out.println();
		liste.remove(1);
		liste.set(1, "bonsoir");
		// parcous avec for(element : liste)
		for (Object elt : liste)
			System.out.print(elt + " ");
		System.out.println();
		// parcours avec iterator
		ListIterator li = liste.listIterator();
		while(li.hasNext())
		System.out.print(li.next() + " ");
		System.out.println();
	}
}
