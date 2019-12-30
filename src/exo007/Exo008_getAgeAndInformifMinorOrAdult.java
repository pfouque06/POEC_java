package exo007;

import java.util.Scanner;

public class Exo008_getAgeAndInformifMinorOrAdult {

	// majeur ou mineur
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			do {
				System.out.print("ton age : ");
				buffer = scan.nextLine();
			} while (!(buffer.matches("\\d*") || buffer.isEmpty()));
			
			if (!buffer.isEmpty()) {
				int age = Integer.valueOf(buffer);
				//System.out.println("ton age = " + age);
				
				if ((age < 18))
					System.out.println("tu es mineur");
				else
					System.out.println("tu es majeur");
			}
		} while (! buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}

}
