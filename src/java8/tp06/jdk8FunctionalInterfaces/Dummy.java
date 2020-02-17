package java8.tp06.jdk8FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Dummy {

	public static void afficher(String... array) {
		for(String a : array) 
			System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		afficher();
		afficher("toto");
		afficher("toto", "titi", "tata", "tutu");
		
		// using anonyme class
		/*
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName() + "ce petite bonhomme c'est Harry ! des doutes ?? ");
			}
		});
		*/
		Thread t2 = new Thread(() -> {
				System.out.println(Thread.currentThread().getName() + " --> ce petite bonhomme c'est Harry ! des doutes ?? ");
		});
		t2.start();
		
		System.out.println();
		System.out.println("---ascending sorting----");
		System.out.println();
		List<Machine> machines1 = new ArrayList<Machine>();
		List<Machine> machines2 = Arrays.asList(new Machine(2000, "toto"), new Machine(2001, "titi"), new Machine(2002, "tata"), new Machine(2003, "tutu"));
		List<Machine> machines3 = Arrays.asList(new Machine(2000, "toto"), new Machine(2001, "titi"), new Machine(2002, "tata"), new Machine(2003, "tutu"));
		
		machines2.sort(new Comparator<Machine>() {
			@Override
			public int compare(Machine o1, Machine o2) {
				// TODO Auto-generated method stub
				return o1.getAnnee()-o2.getAnnee();
			}
		});
		
		machines2.forEach(System.out::println);

		System.out.println();
		System.out.println("---descending sorting----");
		System.out.println();

		machines2.sort((m1,m2) ->{
				return m2.getAnnee()-m1.getAnnee();
		});
		
		machines2.forEach(System.out::println);

		
		System.out.println();
		System.out.println("---both ordering ----");
		
		Comparator<Machine> cmasc = (m1,m2) ->{return m1.getAnnee()-m2.getAnnee();};
		Comparator<Machine> cmdes = (m1,m2) ->{return m2.getAnnee()-m1.getAnnee();};

		System.out.println();
		machines3.sort(cmasc);
		//Collections.sort(machines3, cmasc);
		machines3.forEach(System.out::println);
		
		System.out.println();
		//machines3.sort(cmdes);
		Collections.sort(machines3, cmdes);
		machines3.forEach(System.out::println);
	}

}
