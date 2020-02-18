package java8.tp11.APIStream;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		// exo1
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter, les références de méthode avec ::, et enfin collect.
			sg.filter(g -> g.getKilometres() < 3500).map(Gagnants::getNom) // .map(g -> g.getNom())
					.collect(Collectors.toList()).forEach(System.out::println);
		}

		// exo2
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter, les références de méthode avec ::, et enfin collect.
			sg.filter(g -> g.getKilometres() > 3500).map(Gagnants::getNom) // .map(g -> g.getNom())
					.collect(Collectors.toList()).forEach(System.out::println);
		}

		// exo3
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter, les références de méthode avec ::, et enfin collect.
			sg.filter(g -> g.getKilometres() > 3500).map(Gagnants::getNom) // .map(g -> g.getNom())
					.limit(2).collect(Collectors.toList()).forEach(System.out::println);
		}

		// exo4
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter, les références de méthode avec ::, et enfin collect.
			sg.map(Gagnants::getNom) // .map(g -> g.getNom())
					.distinct().collect(Collectors.toList()).forEach(System.out::println);
		}

		// exo5
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter, les références de méthode avec ::, et enfin collect.
			System.out.println(sg.map(Gagnants::getNom) // .map(g -> g.getNom())
					.distinct().collect(Collectors.toList()).size());

			System.out.println(sg.map(Gagnants::getNom) // .map(g -> g.getNom())
					.distinct().count());
		}

		// exo6
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter, les références de méthode avec ::, et enfin collect.
			sg.map(Gagnants::getNom) // .map(g -> g.getNom())
					.skip(2).collect(Collectors.toList()).forEach(System.out::println);
		}

		// exo7
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter, les références de méthode avec ::, et enfin collect.
			sg.map(g -> g.getAnnee() + " - " + g.getNom()).collect(Collectors.toList()).forEach(System.out::println);
		}

		// exo8
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter, les références de méthode avec ::, et enfin collect.
			sg.map(Gagnants::getNom) // .map(g -> g.getNom())
					.map(String::length) // .map(s -> s.length())
					.collect(Collectors.toList()).forEach(System.out::println);
		}

		// exo9
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter contenant une expression lambda, contains, findAny, et
			// vous récupérerez le résultat dans un type Optional<Gagnants>
			sg.filter(g -> g.getNom().contains("Wiggins")).findAny().ifPresent(System.out::println);
		}

		// exo10
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter contenant une expression lambda, contains, findAny, et
			// vous récupérerez le résultat dans un type Optional<Gagnants>
			System.out.println(sg.filter(g -> g.getAnnee() == 2014).map(Gagnants::getAnnee).findFirst().isPresent());

		}

		// exo11
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter contenant une expression lambda, contains, findAny, et
			// vous récupérerez le résultat dans un type Optional<Gagnants>
			System.out.println(sg.map(Gagnants::getKilometres).reduce(0, Integer::sum) // .reduce(0, (a,b) -> a+b)
			);
		}

		// exo12
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter contenant une expression lambda, contains, findAny, et
			// vous récupérerez le résultat dans un type Optional<Gagnants>
			System.out.println(sg.map(Gagnants::getKilometres).reduce(Integer.MAX_VALUE, Integer::min) // .reduce(Integer.MAX_VALUE,
																										// (a,b) -> a <
																										// b ? a : b)
			);
		}

		// exo13
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter contenant une expression lambda, contains, findAny, et
			// vous récupérerez le résultat dans un type Optional<Gagnants>
			System.out.println(sg.max(Comparator.comparingDouble(Gagnants::getVitesseMoyenne)));
		}

		// exo15
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter contenant une expression lambda, contains, findAny, et
			// vous récupérerez le résultat dans un type Optional<Gagnants>
			System.out.println(sg.mapToDouble(Gagnants::getVitesseMoyenne).max());
		}

		// exo16
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter contenant une expression lambda, contains, findAny, et
			// vous récupérerez le résultat dans un type Optional<Gagnants>
			sg.collect(Collectors.groupingBy(Gagnants::getNom)) // Map<String, List<Gagnants>>
					.forEach((k, v) -> System.out.println(k + " : " + v));
		}

		// exo17
		{
			Stream<Gagnants> sg = Gagnants.gagnantsTDF.stream();

			// stream, filter contenant une expression lambda, contains, findAny, et
			// vous récupérerez le résultat dans un type Optional<Gagnants>
			sg.collect(Collectors.groupingBy(Gagnants::getNationalite)) // Map<String, List<Gagnants>>
					.forEach((k, v) -> System.out.println(k + " : " + v));
		}

	}

}
