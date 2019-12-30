package exo007;

import java.util.Scanner;

public class Exo007_getIntAndDisplayOddorEVen {

	//nombre pair ou impair
	
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
				System.out.println("ton nombre " + nombre + " est " + ((nombre % 2 == 0) ? "pair" : "impair"));
				
			}
		} while (! buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}
}
