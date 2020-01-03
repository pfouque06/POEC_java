package exo029;

import java.util.Scanner;

public class Exo030_getSeason {

	static String getSeason(int pSeason) {
		switch (pSeason) {
		case 1:
			return "le printemps";
		case 2:
			return "l'été";
		case 3:
			return "l'automne";
		case 4:
			return "l'hiver";
		default:
			return "inconnue";
		}
	}

	static String getSeasonByMonth(int pMonth) {
		switch (pMonth) {
		case 4:
		case 5:
		case 6:
			return "le printemps";
		case 7:
		case 8:
		case 9:
			return "l'été";
		case 10:
		case 11:
		case 12:
			return "l'automne";
		case 1:
		case 2:
		case 3:
			return "l'hiver";
		default:
			return "inconnue";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbr;
		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			do {
				System.out.print("your month: ");
				buffer = scan.nextLine();
			} while (!(buffer.matches("(^0?[1-9]$)|(^1[0-2]$)|^$"))); // wait int from 1 to 12 or empty
			// } while (!(buffer.matches("-?\\d*"))); // wait int
			// } while (! (buffer.matches("-?\\d*[.]?\\d*"))); // wait double
			if (buffer.isEmpty())
				break;
			nbr = Integer.valueOf(buffer);

			System.out.println("la saison du mois " + nbr + " est " + getSeasonByMonth(nbr));

			System.out.println();

		} while (!buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();

	}

}
