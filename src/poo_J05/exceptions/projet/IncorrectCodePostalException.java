package poo_J05.exceptions.projet;

public class IncorrectCodePostalException extends Exception {

	public IncorrectCodePostalException(String CP) {
		System.out.println("code postal : " + CP);
		System.out.println("Le code postal doit contenir exactement 5 chiffres");

	}
}
