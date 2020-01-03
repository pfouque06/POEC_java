package exo033_TP1_InternetAccessCost;

import java.util.Scanner;
import scanTools.ScanTools;

public class Exo033_TP_InternetAccessCost {

	static int calculateCost(int pStart, int pEnd) {
		int newStart = 0;
		int cost = 0;
		int delay = 0;
		// 0h - 7h
		if (pStart < 7) {
			delay = (pEnd < 7 ? pEnd : 7);
			cost += (delay - pStart) * 2;
			newStart = (pEnd > 7 ? 7 : 0);
		}
		// 7h - 17h
		if ((newStart == 7 || pStart >= 7) && pStart < 17) {
			newStart = (pStart >= 7 ? pStart : newStart);
			delay = (pEnd < 17 ? pEnd : 17);
			cost += (delay - newStart) * 1;
			newStart = (pEnd > 17 ? 17 : 0);
		}
		// 17h - 0h
		if (newStart == 17 || pStart >= 17) {
			newStart = (pStart >= 17 ? pStart : newStart);
			cost += (pEnd - newStart) * 2;
		}
		return cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buffer = "";
		do {

			int startTime, endTime;
			do {
				// get start time (hour : 0 à 24)
				startTime = ScanTools.scanIntRange("Début de la connexion : ", 0, 24);
				// get end time (hour : 0 à 24)
				endTime = ScanTools.scanIntRange("Fin de la connexion : ", 0, 24);
				// validate end time > start time
				if (startTime > endTime)
					System.out.println("\tBizarre, le début est après la fin ...");
				if (startTime == endTime)
					System.out.println("\tBizarre, vous n'avez pas été connecté du tout ...");
			} while (startTime >= endTime);
			// caculate Internet access cost
			// tarif 1 : 7h-17h 1€/h
			// tarif 2 : 0- 7h, 17h-24h 2€/h
			int last = endTime - startTime;
			int cost = calculateCost(startTime, endTime);
			System.out.println("Vous avez été connecté " + last + " heures pour " + cost + " Euros");
			System.out.println();
			//buffer = ScanTools.scanMatchedBuffer("Replay (Oui/Non) ?", "[ON]|^$"); // O, N ou empty
			buffer = ScanTools.scanMatchedBuffer("Replay (O/N) ?", ".*"); // O, N ou empty
			System.out.println();
		} while ( buffer.equals("O") || buffer.isEmpty());

		//
	}

}
