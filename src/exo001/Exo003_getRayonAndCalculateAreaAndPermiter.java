package exo001;

import java.util.Scanner;

public class Exo003_getRayonAndCalculateAreaAndPermiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			System.out.print("ton rayon : ");
			buffer = scan.nextLine();
		} while (buffer.matches("\\d"));
		double rayon = Double.valueOf(buffer);
		System.out.println("ton rayon = " + rayon);

		double perimetre = 2 * Math.PI * rayon;
		System.out.println("ton perimetre = " + perimetre);

		double aire = Math.PI * Math.pow(rayon, 2);
		System.out.println("ton aire = " + aire);

		scan.close();
	}

}
