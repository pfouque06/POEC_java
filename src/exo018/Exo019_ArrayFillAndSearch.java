package exo018;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Exo019_ArrayFillAndSearch {

	// ArrayFillAndDisplay

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String buffer = "", search = "", found = "";
		int index = 1, indexMax;
		do {
			System.out.print("ton nbre d'index : ");
			buffer = scan.nextLine();
		} while (!buffer.matches("\\d*"));
		indexMax = Integer.valueOf(buffer);

		String[] strArray = new String[indexMax];
		do {
			System.out.print("ton élément " + index + " : ");
			buffer = scan.nextLine();
			strArray[index - 1] = buffer;
		} while (++index <= indexMax);
		System.out.println("strArray : " + Arrays.toString(strArray));

		System.out.println();
		do {

			System.out.print("ta valeur recherchée : ");
			search = scan.nextLine();

			if (!search.isEmpty()) {

				found = "inconnue";
				for (String cell : strArray) {
					if (cell.equals(search))
						found = "contenue dans la tableau";
				}

				System.out.println("la valeur recherchée \"" + search + "\" est " + found);
			}
		} while (!search.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}
}
