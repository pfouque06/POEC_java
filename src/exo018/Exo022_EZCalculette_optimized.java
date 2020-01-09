package exo018;

import java.util.Scanner;

import scanTools.ScanTools;

// mini calculette
public class Exo022_EZCalculette_optimized {

	static int[] scanIntArray(String[] pNames) {

		int[] values = new int[2];
		String valueName = "";
		for (int index = 0; index < pNames.length; index++) {
			valueName = (pNames[index].isEmpty() ? String.valueOf(index) : pNames[index]);
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
		System.out.println("\t7. Calculer la racine carré de deux nombres :");
		System.out.println("\t8. Calculer le demi gap de deux nombre");
		System.out.println("\t9. Quelle est la théorie des graphes ?");
		System.out.println("\t0. quitter");
		System.out.println();
	}

	static void processAction(String pAction) {

		String[] valueNames = { "a", "b" };
		int[] values = new int[2];

		System.out.println();
		switch (pAction) {
		case "1":
			values = scanIntArray(valueNames);
			int sum = values[0] + values[1];
			System.out.println("\n\t" + values[0] + " + " + values[1] + " = " + sum);
			break;
		case "2":
			values = scanIntArray(valueNames);
			int diff = values[0] - values[1];
			System.out.println("\n\t" + values[0] + " - " + values[1] + " = " + diff);
			break;
		case "3":
			values = scanIntArray(valueNames);
			int mult = values[0] * values[1];
			System.out.println("\n\t" + values[0] + " x " + values[1] + " = " + mult);
			break;
		case "4":
			values = scanIntArray(valueNames);
			if (values[1] == 0) {
				System.out.println("\n\tERROR : le nombre b est nul, division par 0 est impossible");
				break;
			}
			float div = (float) values[0] / values[1];
			System.out.println("\n\t" + values[0] + " / " + values[1] + " = " + String.format("%.2f", div));
			break;
		case "5":
			values = scanIntArray(valueNames);
			if (values[1] == 0) {
				System.out.println("\n\tERROR : le nombre b est nul, division par 0 est impossible");
				break;
			}
			int modulo = values[0] % values[1];
			System.out.println("\n\t" + values[0] + " % " + values[1] + " = " + modulo);
			break;
		case "6":
			values = scanIntArray(valueNames);
			float average = (float) (values[0] + values[1]) / 2;
			System.out.println("\n\t( " + values[0] + " + " + values[1] + " ) / 2 = " + String.format("%.2f", average));
			break;
		case "7":
			values[0] = ScanTools.scanInt("Entrez le nombre " + valueNames[0] + " : ");
			int x = values[0] * values[0];
			System.out.println(" la racine carré de " + values[0] + " = " + x);
			break;
		case "8":
			values = scanIntArray(valueNames);
			float halfgap = (float) (values[0] - values[1]) / 2;
			System.out.println("\t( " + values[0] + " - " + values[1] + " ) / 2 = " + String.format("%.2f", halfgap));
			break;
		case "9":
			System.out.println(
					"La théorie des graphes est la discipline mathématique et informatique qui étudie les graphes, \n"
							+ "lesquels sont des modèles abstraits de dessins de réseaux reliant des objets1. Ces modèles sont \n"
							+ "constitués par la donnée de sommets (aussi appelés nœuds ou points, en référence aux polyèdres), \n"
							+ "ùet d'arêtes (aussi appelées liens ou lignes) entre ces sommet; ces arêtes sont parfois \n"
							+ "non-symétriques (les graphes sont alors dits orientés) et sont appelés des flèches.\r\n"
							+ "\r\n"
							+ "Les algorithmes élaborés pour résoudre des problèmes concernant les objets de cette théorie \n"
							+ "ont de nombreuses applications dans tous les domaines liés à la notion de réseau (réseau social, \n"
							+ "réseau informatique, télécommunications, etc.) et dans bien d'autres domaines (par exemple \n"
							+ "génétique) tant le concept de graphe, à peu près équivalent à celui de relation binaire \n"
							+ "(à ne pas confondre donc avec graphe d'une fonction), est général. De grands théorèmes difficiles, \n"
							+ "comme le théorème des quatre couleurs, le théorème des graphes parfaits, ou encore le théorème \n"
							+ "de Robertson-Seymour, ont contribué à asseoir cette matière auprès des mathématiciens, \n"
							+ "et les questions qu'elle laisse ouvertes, comme la conjecture de Hadwiger, en font une branche \n"
							+ "vivace des mathématiques discrètes. \n");
			ScanTools.scanMatchedBuffer("\t(...)", ".*");
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
			buffer = ScanTools.scanMatchedBuffer("\tFaites votre choix : ", "[0-9]");
			// System.out.println("buffer="+buffer);

			if (!buffer.equals("0")) {

				processAction(buffer);

			}
		} while (!buffer.equals("0"));

		System.out.println("\texiting...");
	}

}
