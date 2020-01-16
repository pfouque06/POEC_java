package poo_J05.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  Exo2 {

	public static int scanInt(String pLabel) throws IllegalArgumentException {
		
		Scanner scan = new Scanner(System.in);
		String buffer = "";
		int result = 0;
		do {
			System.out.print(pLabel);
			buffer = scan.nextLine();
			if (buffer.matches("-?\\d+")) { // wait int
				result = Integer.valueOf(buffer);
				break;
			}
			buffer = "";
			throw new InputMismatchException();
		} while (buffer.isEmpty());

		if (result <= 10) 
			throw new IllegalArgumentException();

		//scan.close();
		return result;
	}

	public static void main(String[] args) {
		
		int nb = 0;
		boolean success = true;
		do {
			do {
				success = true;
				try {
					nb = (Integer) scanInt("Donnez un entier : ");
				} catch (InputMismatchException e) {
					// TODO Auto-generated catch block
					success = false;
					System.out.println("Erreur de saisie");
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					success = false;
					System.out.println("valeur < 10");
				}
			} while ( ! success);
			
			System.out.println("L'entier saisi est : " + nb);
			System.out.println();
			
		} while (true);
	}
}
