package exo012;

import java.util.Scanner;

public class Exo015_getWeekDayNumberAndDisplayText {

	// Écrivez un programme Java qui donne le jour de la semaine.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			do {
				System.out.print("ton jour de semaine : ");
				buffer = scan.nextLine();
			} while (!(buffer.matches("[1-7]") || buffer.isEmpty()));
			//} while (!(buffer.matches("\\d*") || buffer.isEmpty()));
			//} while (!(buffer.matches("[a-zA-Z]*") || buffer.isEmpty()));

			if (!buffer.isEmpty()) {
				// String dest = buffer.toLowerCase();
				// System.out.println("ta dest = " + dest);
				// switch (dest) {
				switch (buffer.toLowerCase()) {
				case "1":
					System.out.println("lundi");
					break;
				case "2":
					System.out.println("mardi");
					break;
				case "3":
					System.out.println("mercredi");
					break;
				case "4":
					System.out.println("jeudi");
					break;
				case "5":
					System.out.println("vendredi");
					break;
				case "6":
					System.out.println("samedi");
					break;
				case "7":
					System.out.println("dimanche");
					break;
				default:
					System.out.println("erreur");
				}
			}
		} while (!buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}
}
