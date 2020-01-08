package exo018;

import java.util.Scanner;

import scanTools.ScanTools;

// mini calculette
public class Exo022_EZCalculette_optimized {

	static int[] scanIntArray(String[] pNames) {

		int[] values = new int[2];
		String valueName = "";
		for (int index = 0; index < pNames.length; index++) {
			valueName = ( pNames[index].isEmpty() ? String.valueOf(index) : pNames[index]);
			values[index] = ScanTools.scanInt("Entrez le nombre " + valueName + " : ");
			// System.out.println("values["+index+"]="+values[index]+" \""+valueName+"\"");
		}
		return values;
	}

	static void displayMenu() {

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
	}

	static void processAction(String pAction) {

		String[] valueNames = {"a","b"};
		int[] values = new int[2];
		System.out.println();

		System.out.println();
		switch (pAction) {
		case "1":
			values = scanIntArray(valueNames);
			int sum = values[0] + values[1];
			System.out.println("\t" + values[0] + " + " + values[1] + " = " + sum);
			break;
		case "2":
			values = scanIntArray(valueNames);
			int diff = values[0] - values[1];
			System.out.println("\t" + values[0] + " - " + values[1] + " = " + diff);
			break;
		case "3":
			values = scanIntArray(valueNames);
			int mult = values[0] * values[1];
			System.out.println("\t" + values[0] + " x " + values[1] + " = " + mult);
			break;
		case "4":
			values = scanIntArray(valueNames);
			if (values[1] == 0) {
				System.out.println("\tERROR : le nombre b est nul, division par 0 est impossible");
				break;
			}
			float div = (float) values[0] / values[1];
			System.out.println("\t" + values[0] + " / " + values[1] + " = " + String.format("%.2f", div));
			break;
		case "5":
			values = scanIntArray(valueNames);
			if (values[1] == 0) {
				System.out.println("\tERROR : le nombre b est nul, division par 0 est impossible");
				break;
			}
			int modulo = values[0] % values[1];
			System.out.println("\t" + values[0] + " % " + values[1] + " = " + modulo);
			break;
		case "6":
			values = scanIntArray(valueNames);
			float average = (float) (values[0] + values[1]) / 2;
			System.out.println("\t( " + values[0] + " + " + values[1] + " ) / 2 = " + String.format("%.2f", average));
			break;
		default:
			System.out.println("choix invalide");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String buffer = "";
		int[] nb = { 0, 0 };
		do {
			displayMenu();
			buffer = ScanTools.scanMatchedBuffer("\tFaites votre choix : ", "[0-6]");
			// System.out.println("buffer="+buffer);

			if (!buffer.equals("0")) {

				processAction(buffer);

			}
		} while (!buffer.equals("0"));

		System.out.println("\texiting...");
	}

}
