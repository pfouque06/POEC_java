package exo012;

import java.util.Scanner;

public class Exo017_minuteConverterInYearsDays {

	// Écrire un programme Java pour convertir des minutes en un certain nombre
	// d'années et de jours

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			do {
				System.out.print("tes minutes : ");
				buffer = scan.nextLine();
			} while (!(buffer.matches("\\d*") || buffer.isEmpty()));
			// } while (!(buffer.matches("[a-zA-Z]*") || buffer.isEmpty()));

			if (!buffer.isEmpty()) {
				int minutes = Integer.valueOf(buffer);
				int jours = minutes / (60 * 24);
				int year = jours / 365;
				int moduloYear = jours - year * 365;
				int moduloJours = minutes - jours * 24 * 60;
				System.out.print(minutes + " minutes = " + (year == 0 ? "" : year + " années, "));
				System.out.print( (moduloYear == 0 ? "" : moduloYear + " jours, "));
				System.out.println( (moduloJours == 0 ? "" : moduloJours + " minutes"));
			}
		} while (!buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}
}
