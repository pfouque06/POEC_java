package java8.tp09.scopeofvariables;

import java.util.Arrays;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> entiers1 = Arrays.asList(1, 2, 3, 4);

		entiers1.forEach((i) -> {
			Integer maVariable = 1;
			System.out.println(i);
		});

		Integer maVariable = 10;
		maVariable += 11;
		System.out.println(maVariable);
	}
}