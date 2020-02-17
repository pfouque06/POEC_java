package java8.tp07.MethodReference;

import java.util.Arrays;
import java.util.List;


public class Dummy2 {

	@FunctionalInterface
	public interface ImethodReference {
		void affiche();
	}

	void affiche() {
		System.out.println("message quelconque.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> entiers1 = Arrays.asList(1, 2, 3, 4);

		entiers1.forEach((i)->{System.out.println(i);});
		System.out.println();

		entiers1.forEach(System.out::println);
		System.out.println();
		
		Dummy2 d = new Dummy2();
		
		ImethodReference imr1 = d::affiche;
		System.out.print("imr1: "); imr1.affiche();
		
		ImethodReference imr2 = ()->d.affiche();
		System.out.print("imr2: "); imr2.affiche();
		
		ImethodReference imr3 = ()->{d.affiche();};
		System.out.print("imr3: "); imr3.affiche();
		
	}

}