package exo012;

import java.util.Scanner;

public class Exo012_GetNumberAndDisplayIfPositiveOrNegative {

	// Nombre négatif ou positif ?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			do {
				System.out.print("ton nombre : ");
				buffer = scan.nextLine();
			} while (!(buffer.matches("-?\\d*") || buffer.isEmpty()));
			// } while (!(buffer.matches("-+[a-zA-Z]*") || buffer.isEmpty()));

			if (!buffer.isEmpty()) {
				int nombre = Integer.valueOf(buffer);
				// System.out.println("ton nombre = " + nombre);
				System.out.println("> ton nombre est " + ((nombre < 0 ) ? "négatif!" : "positi !"));
			}
		} while (! buffer.isEmpty() );
		System.out.println("exiting...");
		scan.close();
	}
}

