package ma.projet.bean;

import ma.projet.Personne;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne manager = new Manager("Baton", "Jean", "jbaton@novadigital.com", "1234", 3000, "Informatique");
		Personne developper = new Developpeur("Magoo", "Mister", "mmmagoo@novadigital.com", "1235", 2900, "PHP");
		System.out.println(manager);
		System.out.println(developper);

		System.out.println("--- calcul augmentation ---");
		manager.calculSalaire();
		developper.calculSalaire();
		System.out.println(manager);
		System.out.println(developper);

		Personne tonton = new Personne(null, null, null, null, 0) {

			@Override
			public void calculSalaire() {
				// TODO Auto-generated method stub

			}
		};
		System.out.println(tonton);
	}

}
