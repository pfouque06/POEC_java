package exo007;

import java.util.Scanner;

public class Exo010_GetDestinationAsStringAndDisplay {

	// switch sur string
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			String buffer = "";
			do {
				do {
					System.out.print("ta destination : ");
					buffer = scan.nextLine();
				//} while (!(buffer.matches("\\d*") || buffer.isEmpty()));
				} while (!(buffer.matches("[a-zA-Z]*") || buffer.isEmpty()));
				
				if (!buffer.isEmpty()) {
					//String dest = buffer.toLowerCase();
					//System.out.println("ta dest = " + dest);
					//switch (dest) {
					switch (buffer.toLowerCase()) {
					case "corse" :
						System.out.println("tu vas en Corse");
						break;
					case "crete" :
						System.out.println("tu vas en Crete");
						break;
					case "mikonos" :
						System.out.println("tu vas en Mikonos");
						break;
					case "ibiza" :
						System.out.println("tu vas en Ibiza");
						break;
					default:
						System.out.println("destination impossible");
					}
				}
			} while (! buffer.isEmpty());
			System.out.println("exiting...");
			scan.close();
		}
}
