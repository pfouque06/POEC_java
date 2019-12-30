package myFirstPackage;

import java.util.Scanner;

public class MySandboxClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world from console");
		System.out.println("Hello world from console");
		System.out.println("Hello world from console");
		System.out.println("Hello world from console");

		String str = new String("bonjour");
		System.out.println(str);

		int x = 5;
		byte z = (byte) x;
		System.out.println("x=" + x);
		System.out.println("z=" + z);
		System.out.println();
		byte w = Byte.parseByte(String.valueOf(x));
		System.out.println("w=" + w);
		System.out.println("t=" + Integer.toString(x));

		StringBuilder sb = new StringBuilder();
		String s1 = "Salut", s2 = "tout le monde", s3 = s1 + " " + s2;
		System.out.println(s3);
		sb.append(s1).append(" ").append(s2);
		String s4 = sb.toString();
		System.out.println(s4);

		Class<? extends String> c = str.getClass();
		System.out.println("class type for str = " + c.getName());

		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("ton entier : ");
			if (scan.hasNextInt()) {
				int i = scan.nextInt();
				System.out.println("ton entier = " + i);
				break;
			}
			scan.nextLine();
//		} while (! scan.hasNextInt());
		} while (true);
		scan.nextLine();
		System.out.print("ton String : ");
		String iStr = scan.nextLine();
		System.out.println("ton String = " + iStr);
		System.out.println("ton premier char = " + iStr.charAt(0));

		// exo
		System.out.println("premier int : ");
		int a = scan.nextInt();
		scan.nextLine();
		System.out.println("premier int = " + a);
		System.out.println("second int : ");
		int b = scan.nextInt();
		scan.nextLine();
		System.out.println("second int = " + b);
		int sum = a + b;
		System.out.println("somme = " + sum);
		int diff = a-b;
		System.out.println("soustraction = " + diff);
		int mult = a * b;
		System.out.println("multiplication = " + mult);
		int div = a / b;
		System.out.println("division = " + div);
		int modulo = a % b;
		System.out.println("modulo = " + modulo);
		int average = sum / 2;
		System.out.println("moyenne = " + average);

		scan.close();

	}

}
