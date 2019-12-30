package exo012;

import java.util.Scanner;

public class Exo013_Get3NumbersAndDisplayBiggest {

	// Nombre plus grand sur 3 input ?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			do {
				System.out.print("ton nombre 1 : ");
				buffer = scan.nextLine();
			} while (!buffer.matches("-?\\d*"));
			// } while (!(buffer.matches("-+[a-zA-Z]*") || buffer.isEmpty()));
			int nbr1 = Integer.valueOf(buffer);

			do {
				System.out.print("ton nombre 2 : ");
				buffer = scan.nextLine();
			} while (!buffer.matches("-?\\d*"));
			// } while (!(buffer.matches("-+[a-zA-Z]*") || buffer.isEmpty()));
			int nbr2 = Integer.valueOf(buffer);

			do {
				System.out.print("ton nombre 3 : ");
				buffer = scan.nextLine();
			} while (!buffer.matches("-?\\d*"));
			// } while (!(buffer.matches("-+[a-zA-Z]*") || buffer.isEmpty()));
			int nbr3 = Integer.valueOf(buffer);
			
			// Simple method
			if ((nbr1 > nbr2) && (nbr1 > nbr3))
				System.out.println("nombre 1 est le plus grand : " + nbr1);
			if ((nbr2 > nbr1) && (nbr2 > nbr3))
				System.out.println("nombre 2 est le plus grand : " + nbr2);
			if ((nbr3 > nbr1) && (nbr3 > nbr2))
				System.out.println("nombre 3 est le plus grand : " + nbr3);
			
			// optimized method
			if (nbr1 > nbr2) {
				if (nbr1 > nbr3)
					System.out.println("nombre 1 est le plus grand : " + nbr1);
				else
					System.out.println("nombre 3 est le plus grand : " + nbr3);
			} else {
				if (nbr2 > nbr3)
					System.out.println("nombre 2 est le plus grand : " + nbr2);
				else
					System.out.println("nombre 3 est le plus grand : " + nbr3);
			}
			
		} while (!buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}
}
