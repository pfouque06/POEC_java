package exo023;

import java.util.Arrays;

public class Exo027_ArrayIntAndFindSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 5, 7, -8, 5, 14, 1 };

		int sumArray = 0;
		int smallest = Integer.MAX_VALUE;
		int smallestNext= Integer.MAX_VALUE;
		// find smallest
		for (int i : intArray) {
			//smallest = Math.min(smallest, i)
			if ( smallest > i)
				smallest = i;
			if ( (smallestNext > i) && (i > smallest) )
					smallestNext = i;
		}
		
		System.out.println("intArray : " + Arrays.toString(intArray));
		System.out.println("smallest = " + smallest);
		System.out.println("smallestNext = " + smallestNext);
	}

}
