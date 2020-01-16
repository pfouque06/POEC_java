package poo_J05.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  Exo01 {

	public static int scanInt(String pLabel) throws InputMismatchException {
		
		Scanner scan = new Scanner(System.in);
		//Scanner scan = new Scanner(System.in);
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
			//System.out.println("\tvaleur invalide, veuillez entrer un entier");
			throw new InputMismatchException();
		} while (buffer.isEmpty());

		//scan.close();
		return result;
	}

	public static void main(String[] args) {
		
		int nb = 0;
		boolean success = true;
		do {
			success = true;
			try {
				nb = (Integer) scanInt("Donnez un entier : ");
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				success = false;
				System.out.println("Erreur de saisie");
			} finally {
				System.out.println("Fin");
			}
		} while ( ! success);
		System.out.println("L'entier saisi est : " + nb);
		System.out.println("Fin");
		System.out.println();
	}
}
