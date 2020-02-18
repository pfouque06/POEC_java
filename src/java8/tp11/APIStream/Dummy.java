package java8.tp11.APIStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();

		List<String> genre = new ArrayList<String>(Arrays.asList("mario","luigi", "peach", "toad", "bowser"));
		Stream<String> stream = genre.stream();
		
		long a = stream
					.filter(s->s.startsWith("r"))
					.count();
		System.out.println(a);

		stream = genre.stream();
		stream
			.filter(s->s.startsWith("r"))
			.forEach(System.out::println);
		
		stream = genre.stream();
		stream
			.filter((s)->s.contains("o"))
			.forEach(System.out::println);
		
		stream = genre.stream();
		stream
		.filter((s)->s.contains("o"))
		.map((s)->s.length())
		.forEach(System.out::println);
		
		stream = genre.stream();
		stream
			.filter((s)->s.contains("o")) // filter in items
			.map((s)->s.length()) // get lenght of each filtered items
			.map((e)->e*e) // au carré
			.forEach(System.out::println);
		
		long stopTime = System.currentTimeMillis();
		
		System.out.println("execution time is : " + (stopTime - startTime)/1000f + "s");
	}

}
