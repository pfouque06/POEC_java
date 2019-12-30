package exo007;

import java.util.Scanner;

public class Exo009_GetNumberAndSwithOn {

	// switch sur nombre
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			do {
				System.out.print("ton nombre : ");
				buffer = scan.nextLine();
			} while (!(buffer.matches("\\d*") || buffer.isEmpty()));
			
			if (!buffer.isEmpty()) {
				int nombre = Integer.valueOf(buffer);
				//System.out.println("ton nombre = " + nombre);
				
				switch (nombre) {
				case 1 :
					System.out.println("un");
					break;
				case 2 :
					System.out.println("deux");
					break;
				case 3 :
					System.out.println("trois");
					break;
				case 4 :
					System.out.println("quatre");
					break;
				default:
					System.out.println("autre");
				}
			}
		} while (! buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}
}
