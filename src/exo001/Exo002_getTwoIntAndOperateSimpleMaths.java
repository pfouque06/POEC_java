package exo001;

import java.util.Scanner;

public class Exo002_getTwoIntAndOperateSimpleMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("premier int : ");
		int a = scan.nextInt();
		scan.nextLine();
		System.out.println("premier int = " + a);
		System.out.print("second int : ");
		int b = scan.nextInt();
		scan.nextLine();
		System.out.println("second int = " + b);
		int sum = a + b;
		System.out.println("somme : "+ a + " + " + b + " = " + sum);
		int diff = a - b;
		System.out.println("soustraction : "+ a + " - " + b + " = " + diff);
		int mult = a * b;
		System.out.println("multiplication : "+ a + " x " + b + " = " + mult);
		float div = ( float ) a / b;
		System.out.println("division : "+ a + " / " + b + " = " + div);
		int modulo = a % b;
		System.out.println("modulo : "+ a + " % " + b + " = " + modulo);
		float average = (float) sum / 2;
		System.out.println("moyenne : ( "+ a + " + " + b + " ) / 2 = " + average);

		scan.close();

	}

}
