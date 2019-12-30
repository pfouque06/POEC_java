package exo018;

import java.util.Arrays;
import java.util.Scanner;

public class Exo018_ArrayFillAndDisplay {

	// ArrayFillAndDisplay

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String buffer = "";
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
		System.out.println("exiting...");
		scan.close();
	}
}
