package exo018;

import java.util.Arrays;

public class Exo018_ArraySort {

	// ArraySort

	public static void main(String[] args) {

		int[] intArray = { 45, 654, 87, 5454, 21, 654, 986547, 55 };
		String[] strArray = { "nmlkj", "lkjlkjlk", "lkjhlkjgtfuhy", "012kjhgk", "45;,hb", "ioupp" };

		System.out.println("intArray : " + Arrays.toString(intArray));
		System.out.println("strArray : " + Arrays.toString(strArray));
		Arrays.sort(intArray);
		Arrays.sort(strArray);
		System.out.println("sorted intArray : " + Arrays.toString(intArray));
		System.out.println("sorted strArray : " + Arrays.toString(strArray));
	}
}
