package exo018;

import java.util.Scanner;

// mini calculette
public class Exo022_EZCalculette_optimized {

	static int scanInt(String pLabel) {
		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			System.out.print(pLabel);
			buffer = scan.nextLine();
			if (!buffer.matches("-?\\d+")) {
				System.out.println("\tvaleur invalide, veuillez entrer un entier");
				buffer = "";
			}
		} while ( buffer.isEmpty() );
		return Integer.valueOf(buffer);
	}

	static String scanMatchedBuffer(String pLabel, String pMatch) {
		
		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			System.out.print(pLabel);
			buffer = scan.nextLine();
			if (!buffer.matches(pMatch)) {
				System.out.println("\tvaleur invalide");
				buffer = "";
			}
		} while (buffer.isEmpty());
		return buffer;
	}


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
			buffer = scanMatchedBuffer("\tFaites votre choix : ", "[0-6]");
			//System.out.println("buffer="+buffer);

			if (!buffer.equals("0")) {

				String nb_ = "";
				System.out.println();
//				do {
//					System.out.print("Entrez le nombre a : ");
//					nb_ = scan.nextLine();
//					if (!nb_.matches("-?\\d+")) {
//						System.out.println("\tvaleur invalide");
//						nb_ = "";
//					}
//				} while ( nb_.isEmpty() );
//				nb[0] = Integer.valueOf(nb_);
				nb[0] = scanInt("Entrez le nombre a : ");
				//System.out.println("nb 1="+nb[0]);

				//System.out.println();
//				do {
//					System.out.print("Entrez le nombre b : ");
//					nb_ = scan.nextLine();
//					if (!nb_.matches("-?\\d+")) {
//						System.out.println("\tvaleur invalide");
//						nb_ = "";
//					}
//				} while ( nb_.isEmpty() );
//				// } while (!(buffer.matches("-+[a-zA-Z]*") || buffer.isEmpty()));
//				nb[1] = Integer.valueOf(nb_);
				nb[1] = scanInt("Entrez le nombre b : ");
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
					if (nb[1]== 0 ) {
						System.out.println("\tERROR : le nombre 2 est nul, division par 0 est impossible");
						break;
					}
					float div = (float) nb[0] / nb[1];
					System.out.println("\t" + nb[0] + " / " + nb[1] + " = " + String.format("%.2f",div));
					break;
				case "5":
					if (nb[1]== 0 ) {
						System.out.println("\tERROR : le nombre 2 est nul, division par 0 est impossible");
						break;
					}
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
