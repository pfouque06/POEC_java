package exo032_createMethods;

import java.util.Random;

public class Exo032_createMethods {

	int bigger(int pNbr1, int pNbr2) {

		if (pNbr1 >= pNbr2)
			return pNbr1;
		else
			return pNbr2;
	}

	String repeatString(String pStr, int pNbr) {
		String buffer = "";
		if (pStr.isEmpty())
			return buffer;
		if (pNbr < 1)
			return buffer;
		for (int index = 1; index <= pNbr; index++)
			buffer += pStr;
		return buffer;

	}

	int randomInt(int pMini, int pMax) {

		int result = 0;
		if (pMini < pMax)
			// int result = new Random().nextInt(pMax - pMini + 1) + pMini;
			result = (int) (Math.random() * (pMax - pMini + 1) + pMini);
		return result;
	}

	boolean contains(Object[] pArray, Object pElement) {
		boolean success = false;
		for (Object index : pArray)
			if (index == pElement)
				success = true;
		return success;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
