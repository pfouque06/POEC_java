package java8.tp08.ConstructorReference;

import java.util.Arrays;
import java.util.List;


public class Dummy {

	@FunctionalInterface
	public interface IConstructReference {
		String affiche(char[] chars);
	}

	void affiche() {
		System.out.println("message quelconque.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] chars = {'q', 'u', 'e', 'l', 'c', 'o', 'n', 'q', 'u', 'e'};
		String string;
		
		IConstructReference ci = (arraychars)-> {return new String(arraychars);};
		
		string = ci.affiche(chars);
		System.out.println("le résultat est : \"" + string + "\"");
		
		System.out.println();
		IConstructReference cs = String::new;
		System.out.println("le résultat est : \"" + cs.affiche(chars) + "\"");
	}

}