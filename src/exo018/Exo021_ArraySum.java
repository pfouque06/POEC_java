package exo018;

import java.util.Arrays;

public class Exo021_ArraySum {

	// ArraySum

	public static void main(String[] args) {

		int[] intArray = { 45, 654, 87, 5454, 21, 654, 986547, 55 };

		int sumArray = 0;
		for (int i : intArray)
			sumArray += i;
		
		System.out.println("intArray : " + Arrays.toString(intArray));
		System.out.println("sumArray = " + sumArray);
	}
}
