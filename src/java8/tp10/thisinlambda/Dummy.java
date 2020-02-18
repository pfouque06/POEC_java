package java8.tp10.thisinlambda;

import java.util.Arrays;
import java.util.List;


public class Dummy {

	Integer valeur = 1;

	@FunctionalInterface
	public interface ImethodReference {
		void affiche();
	}

	static void affiche() {
		System.out.println("message quelconque.");
	}
	
	public void maMethodeAnonyme() {
		ImethodReference imr = new ImethodReference() {
			Integer valeur = 2;
			
			@Override
			public void affiche() {
				// TODO Auto-generated method stub
				System.out.println(valeur + " & " + this.valeur);
			}
		};
		imr.affiche();
	}
	
	public void maMethodeLambda() {
		ImethodReference imr =() -> {
			Integer valeur = 2;
			System.out.println(valeur + " & " + this.valeur);
		};
		imr.affiche();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Dummy().valeur); // affiche 1
		new Dummy().maMethodeAnonyme(); // affiche "2 & 2" : this is local scope of instance of anonyme class
		new Dummy().maMethodeLambda();  // affiche "2 & 1" : this is global scope
		
	}

}