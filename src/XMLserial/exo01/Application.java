package XMLserial.exo01;

import java.beans.IntrospectionException;
import java.io.FileNotFoundException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String fileName = "user.xml";
			System.out.println("-----encode-----");
			User badass = new User("admin", "azerty");
			XMLTools.encodeToFile(badass, fileName);
			System.out.println(badass);
			
			System.out.println("-----change user and encode-----");
			badass = new User("newAdmin", "12345");
			XMLTools.encodeToFile(badass, fileName);
			System.out.println(badass);

			System.out.println("-----change user-----");
			badass = new User("other", "toto");
			//XMLTools.encodeToFile(badass, fileName);
			System.out.println(badass);

			System.out.println("-----decode-----");
			badass = (User) XMLTools.decodeFromFile(fileName);
			System.out.println(badass);
		} catch (FileNotFoundException | IntrospectionException e) {
			e.printStackTrace();
		}

	}

}
