package exo023;

import java.util.Arrays;

public class Exo023_ArrayFindDoublon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { 45, 654, 87, 55, 5454, 21, 654, 45, 986547, 55 };

		System.out.println("tableau : " + Arrays.toString(intArray));
		System.out.println();
		String found_ = "";
		for (int index = 0; index < intArray.length; index++) {
			int cell = intArray[index];
			boolean found = false;
			for (int indexNext = index + 1; indexNext < intArray.length; indexNext++) {
				if (index != indexNext) {
					int next = intArray[indexNext];
					if (cell == next) {
						if (!found) {
							found_ += (found_.isEmpty() ? "" : "\n") + cell + "\tindex = " + index + "+" + indexNext;
						}
						found = true;
					}

				}
			}
		}
		System.out.println("cellule trouvé : " + (found_.isEmpty() ? "aucunes" : "\n" + found_));
	}

}
