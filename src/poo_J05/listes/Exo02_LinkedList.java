package poo_J05.listes;

import java.util.LinkedList;

public class Exo02_LinkedList {

	public static void main(String[] args) {
		LinkedList liste = new LinkedList();
		liste.add(5);
		liste.add("Bonjour ");
		liste.add(7.5f);
		for(int i = 0; i < liste.size(); i++)
		System.out.println("element d’indice " + i + " = " + liste.get(i));
		}
}
