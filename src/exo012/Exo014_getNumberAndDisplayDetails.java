package exo012;

import java.util.Scanner;

public class Exo014_getNumberAndDisplayDetails {

	// Écrivez un programme Java qui lit un nombre à virgule et affiche "zéro" si le
	// nombre est
	// zéro. Sinon, affiche "positif" ou "négatif". Puis, affiche "petit" si la
	// valeur absolue du nombre est inférieur à 1 ou "grand" s'il dépasse 1 000 000.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			do {
				System.out.print("ton nombre décimale : ");
				buffer = scan.nextLine();
			} while (!(buffer.matches("-?\\d*[.]\\d*") || buffer.isEmpty()));
			// } while (!(buffer.matches("-+[a-zA-Z]*") || buffer.isEmpty()));

			if (!buffer.isEmpty()) {
				double nombre = Double.valueOf(buffer);
				System.out.println("ton nombre = " + nombre);
				if (nombre == 0)
					System.out.println("> zéro");
				else {
					System.out.println("> " + ((nombre < 0) ? "négatif!" : "positif !"));
					if (Math.abs(nombre) < 1) System.out.println("> petit");
					if (Math.abs(nombre) >1000000) System.out.println("> grand");
				}
			}
		} while (!buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}
}
