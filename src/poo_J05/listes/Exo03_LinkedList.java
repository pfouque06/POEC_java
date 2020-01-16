package poo_J05.listes;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exo03_LinkedList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(0);
		l.add("bonjour");
		l.addFirst("premier");
		l.addLast("dernier");
		String s = "Salut";
		l.add(s);
		int  value = 2;
		l.add(value);
		l.remove("dernier");
		l.remove(s);
		l.remove((Object)value);
		ListIterator li = l.listIterator();
		while(li.hasNext())
		System.out.print(li.next() + " ");
		}
}
