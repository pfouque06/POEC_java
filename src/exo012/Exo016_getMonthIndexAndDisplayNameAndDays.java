package exo012;

import java.util.Scanner;

public class Exo016_getMonthIndexAndDisplayNameAndDays {

	// Écrivez un programme Java qui trouve le nombre de jours dans un mois.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			do {
				System.out.print("ton mois: ");
				buffer = scan.nextLine();
			} while (!(buffer.matches("\\d*") || buffer.isEmpty()));
			// } while (!(buffer.matches("[a-zA-Z]*") || buffer.isEmpty()));

			if (!buffer.isEmpty()) {
				int mois = Integer.valueOf(buffer);
				if (mois < 1 || mois > 12) {
					System.out.println("mois invalide !!");
				} else {
					int year = 0;
					int jours = (mois % 2 == 0) ? 30 : 31;
					if (mois > 7)
						jours = (mois % 2 == 0) ? 31 : 30;
					if (mois == 2) {
						do {
							System.out.print("ton année: ");
							buffer = scan.nextLine();
						} while (!(buffer.matches("\\d+")));

						year = Integer.valueOf(buffer);
						jours = ( year % 4 == 0 ? 29:28);
						
					}
						
					
					String mois_ = "";
					switch (mois) {
					case 1: mois_="janvier"; break;
					case 2: mois_="février " + year; break;
					case 3: mois_="mars"; break;
					case 4: mois_="avril"; break;
					case 5: mois_="mai"; break;
					case 6: mois_="juin"; break;
					case 7: mois_="juilet"; break;
					case 8: mois_="aout"; break;
					case 9: mois_="septembre"; break;
					case 10: mois_="octobre"; break;
					case 11: mois_="novembre"; break;
					case 12: mois_="décembre"; break;
					}
					System.out.println("le mois de "+ mois_ +" a " + jours + " jours");
				}
			}
		} while (!buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}
}
