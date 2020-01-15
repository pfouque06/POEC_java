package poo_J04.classgenerique;

import java.util.ArrayList;
import java.util.List;

public class Triplet<T> {

	private T premier;
	private T second;
	private T troisieme;

	public Triplet(T premier, T second, T troisieme) {
		super();
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
	}

	public T getPremier() {
		return premier;
	}

	public T getSecond() {
		return second;
	}

	public T getTroisieme() {
		return troisieme;
	}

	@Override
	public String toString() {
		return "Triplet [premier=" + premier + ", second=" + second + ", troisieme=" + troisieme + "]";
	}

	public void affiche() {
		System.out.println("premier: " + premier.toString() + ", second: " + second.toString() + ", troisieme: "
				+ troisieme.toString());
	}

	public static void main(String[] args) {

		System.out.println("--- La liste des Triplets ---");
		System.out.println();

		List<Triplet> triplets = new ArrayList<>();
		triplets.add(new Triplet<String>("premier", "second", "troisieme"));
		triplets.add(new Triplet<Integer>(1, 2, 3));
		triplets.add(new Triplet<Boolean>(true, false, true));
		triplets.forEach(Triplet::affiche);
		triplets.forEach(System.out::println);

	}
}
