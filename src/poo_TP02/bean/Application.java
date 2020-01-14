package poo_TP02.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne directeur = new poo_TP02.bean.Personne("Saimi", "Karim", new Date("06/02/1970"), 20000, new Profil(2, "directeur"), Sport.HANDBALL);
		//System.out.println(directeur);
		//directeur.affiche();
		//System.out.println(" le nouveau salaire sera " + directeur.caclulerSalaire());
		
		Personne manager = new poo_TP02.bean.Personne("Baton", "Jean", new Date("06/02/1970"), 20000, new Profil(2, "manager"), Sport.FOOTBALL);
		//System.out.println(directeur);
		//manager.affiche();
		//System.out.println(" le nouveau salaire sera " + directeur.caclulerSalaire());

		Personne developper = new poo_TP02.bean.Personne("Magoo", "Mister", new Date("06/02/1970"), 30000, new Profil(2, "developpeur"), Sport.ROLLERHOCKEY);
		//System.out.println(developper);
		//developper.affiche();
		//System.out.println(" le nouveau salaire sera " + directeur.caclulerSalaire());

		List<Personne> employes = new ArrayList<>();
		employes.add(directeur);
		employes.add(manager);
		employes.add(developper);
		
		
		System.out.println();
		System.out.println("--- La liste des employes ---");
		System.out.println();
		employes.forEach(System.out::println);
		System.out.println();
		employes.forEach(Personne::affiche);
		System.out.println();
		System.out.println("--- calcul augmentation ---");
		for(Personne toto : employes) {
			System.out.println(" le nouveau salaire de " + toto.getId() + " sera " + String.format("%.2f", toto.caclulerSalaire()));
			toto.setSalaire(toto.caclulerSalaire());
		}
		System.out.println();
		System.out.println("--- màj des salalires des employes ---");
		System.out.println();
		employes.forEach(Personne::affiche);
		
	}

}
