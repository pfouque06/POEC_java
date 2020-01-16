package poo_J05.exceptions.projet02;

public class AdresseException extends Exception {

	public AdresseException(String alert, String value) {
		switch (alert) {
		case "codepostal":
			System.out.println("code postal : " + value);
			System.out.println("Le code postal doit contenir exactement 5 chiffres");
			break;
		case "streetName":
			System.out.println("rue : " + value);
			System.out.println("Le nom de la rue doit contenir des lettres en majuscule uniquement");
			break;
		}
	}
}
