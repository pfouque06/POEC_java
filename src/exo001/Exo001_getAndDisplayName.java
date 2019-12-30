package exo001;

import java.util.Scanner;

public class Exo001_getAndDisplayName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("your name : ");
		String userName = scan.nextLine();
		System.out.print("Hello " + userName + " !!");
		
		scan.close();
	}

}
