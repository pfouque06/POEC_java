package exo023;

import java.util.Scanner;

public class Exo026_Get3NumberAndCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nbr = new int[3];
		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			for (int index=0; index < nbr.length; index++) {
				
				do {
					System.out.print("ton nombre "+ (index +1 ) +" : ");
					buffer = scan.nextLine();
				} while (! (buffer.matches("-?\\d*")));
				if (buffer.isEmpty())
					break;
				nbr[index] = Integer.valueOf(buffer);
			}

			if (buffer.isEmpty())
				break;
			
			// all equals ?
			if ((nbr[0] == nbr[1]) && (nbr[1] == nbr[2]) )
				System.out.println("Tous les nombres sont égaux");
			else {
				if ((nbr[0] != nbr[1]) && (nbr[1] != nbr[2]) && (nbr[0] != nbr[2]))
					System.out.println("Tous les nombres sont différents");
				else 
					System.out.println("Ni tous ni égaux ni différents");
			}
			
		} while (!buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}

}
