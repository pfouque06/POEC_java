package poo_J05.exceptions.projet;

public class IncorrectStreetNameException extends Exception {

	public IncorrectStreetNameException(String rue) {
		System.out.println("rue : " + rue);
		System.out.println("Le nom de la rue doit contenir des lettres en majuscule uniquement");
	}
}
