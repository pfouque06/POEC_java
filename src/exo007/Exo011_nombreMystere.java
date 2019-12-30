package exo007;

import java.util.Scanner;

public class Exo011_nombreMystere {

	// Nombre Mystere

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		// int mystere = new Random().nextInt(101);
		int mystere = (int) (Math.random() * 101);
		int nombre = 0;
		do {
			do {
				System.out.print("ton nombre de 0 à 100 : ");
				buffer = scan.nextLine();
			} while (!(buffer.matches("\\d*") || buffer.isEmpty()));
			// } while (!(buffer.matches("[a-zA-Z]*") || buffer.isEmpty()));

			if (!buffer.isEmpty()) {
				nombre = Integer.valueOf(buffer);
				// System.out.println("ton nombre = " + nombre);
				if (nombre == mystere) {
					System.out.println("Bravo !!");
					// System.out.println("exiting...");
					// return;
				} else
					System.out.println("> ton nombre est " + ((nombre < mystere) ? " trop petit!" : " trop grand!"));

			}
		} while (!(buffer.isEmpty() || (nombre == mystere)));
		System.out.println("exiting...");
		scan.close();
	}
}
