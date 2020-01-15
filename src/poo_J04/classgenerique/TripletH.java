package poo_J04.classgenerique;

import java.util.ArrayList;
import java.util.List;

public class TripletH<T1, T2, T3> {

	private T1 premier;
	private T2 second;
	private T3 troisieme;

	public TripletH(T1 premier, T2 second, T3 troisieme) {
		super();
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
	}

	public T1 getPremier() {
		return premier;
	}

	public T2 getSecond() {
		return second;
	}

	public T3 getTroisieme() {
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

		List<TripletH> triplets = new ArrayList<>();
		triplets.add(new TripletH<String, Integer, Boolean>("premier", 2, true));
		triplets.add(new TripletH<Integer, Boolean, String>(1, false, "troisieme"));
		triplets.add(new TripletH<Boolean, String, Integer>(true, "second", 3));
		triplets.forEach(TripletH::affiche);
		triplets.forEach(System.out::println);

	}
}
