package exo018;

import java.util.Scanner;

public class Exo018_EZCalculette {

	// mini calculette

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		int[] nb = {0,0};
		do {
			System.out.println();
			System.out.println("\t\tMENU PRINCIPAL");
			System.out.println();
			System.out.println("\t1. Additionner deux nombres");
			System.out.println("\t2. Soustraire deux nombres");
			System.out.println("\t3. Multiplier deux nombres");
			System.out.println("\t4. Diviser deux nombres");
			System.out.println("\t5. \"Moduler\" deux nombres ;-)");
			System.out.println("\t6. Calculer la moyenne de deux nombres, so what ??");
			System.out.println("\t0. quitter");
			System.out.println();
			do {
				System.out.print("\tFaites votre choix : ");
				buffer = scan.nextLine();
				if (!buffer.matches("[0-6]")) {
					System.out.println("\tchoix invalide");
					buffer = "";
				}
			} while (buffer.isEmpty());
			//System.out.println("buffer="+buffer);

			if (!buffer.equals("0")) {

				String nb_ = "";
				System.out.println();
				do {
					System.out.print("Entrez le nombre a : ");
					nb_ = scan.nextLine();
					if (!nb_.matches("-?\\d+")) {
						System.out.println("\tvaleur invalide");
						nb_ = "";
					}
				} while ( nb_.isEmpty() );
				nb[0] = Integer.valueOf(nb_);
				//System.out.println("nb 1="+nb[0]);

				//System.out.println();
				do {
					System.out.print("Entrez le nombre b : ");
					nb_ = scan.nextLine();
					if (!nb_.matches("-?\\d+")) {
						System.out.println("\tvaleur invalide");
						nb_ = "";
					}
				} while ( nb_.isEmpty() );
				// } while (!(buffer.matches("-+[a-zA-Z]*") || buffer.isEmpty()));
				nb[1] = Integer.valueOf(nb_);
				//System.out.println("nb 2="+nb[1]);

				System.out.println();
				switch (buffer) {
				case "1":
					int sum = nb[0] + nb[1];
					System.out.println("\t" + nb[0] + " + " + nb[1] + " = " + sum);
					break;
				case "2":
					int diff = nb[0] - nb[1];
					System.out.println("\t" + nb[0] + " - " + nb[1] + " = " + diff);
					break;
				case "3":
					int mult = nb[0] * nb[1];
					System.out.println("\t" + nb[0] + " x " + nb[1] + " = " + mult);
					break;
				case "4":
					float div = (float) nb[0] / nb[1];
					System.out.println("\t" + nb[0] + " / " + nb[1] + " = " + div);
					break;
				case "5":
					int modulo = nb[0] % nb[1];
					System.out.println("\t" + nb[0] + " % " + nb[1] + " = " + modulo);
					break;
				case "6":
					float average = (float) (nb[0] + nb[1]) / 2;
					System.out.println("\t( " + nb[0] + " + " + nb[1] + " ) / 2 = " + average);
					break;
				default:
					System.out.println("choix invalide");
				}
			}
		} while (!buffer.equals("0"));

		System.out.println("\texiting...");
		scan.close();
	}
}
