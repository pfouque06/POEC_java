package XMLserial.exo02;

import java.beans.IntrospectionException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			List<Personne> personnes = new ArrayList<Personne>();
			Personne tata = new Personne("tata", "tata", new Adresse("rue tata", "CP tata", "Ville tata"));
			tata.addAdresse(new Adresse("rue zboub", "CP zboub", "Ville Zboub"));
			personnes.add(tata);
			personnes.add(new Personne("titi", "titi", new Adresse("rue titi", "CP titi", "Ville titi")));
			personnes.add(new Personne("toto", "toto", new Adresse("rue toto", "CP toto", "Ville TOTO")));
			personnes.add(new Personne("tutu", "tutu", new Adresse("rue tutu", "CP tutu", "Ville tutu")));
			String fileName = "personnes.xml";
			
			System.out.println();
			System.out.println("-----encode-----");
			XMLTools.encodeToFile(personnes, fileName);
			personnes.forEach(System.out::println);
			
			System.out.println();
			System.out.println("-----add Personne-----");
			personnes.add(new Personne("ROOO", "ROOO", new Adresse("rue ROOO", "CP ROOO", "Ville ROOO")));
			//XMLTools.encodeToFile(badass, fileName);
			personnes.forEach(System.out::println);

			System.out.println();
			System.out.println("-----decode-----");
			personnes = (List<Personne>) XMLTools.decodeFromFile(fileName);
			personnes.forEach(System.out::println);
			
		} catch (FileNotFoundException | IntrospectionException e) {
			e.printStackTrace();
		}

	}

}
