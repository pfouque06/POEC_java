package com.jdbc.demo07.application;

import com.jdbc.demo07.jdbc.Jdbc;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Jdbc selectDB = new Jdbc();
		selectDB.setTable("user");
		selectDB.select("*");
		//selectDB.select("nom, prenom");

		System.out.println();
		System.out.println("-- add user Cool Raoul ---");
		selectDB.insert("Cool", "Raoul", "yoyo");
		selectDB.select("*");

		System.out.println();
		System.out.println("-- update user Cool Raoul ---");
		selectDB.update("Cool", "Raoul", "Baaaannn", "Zaiiii");
		selectDB.select("*");

		System.out.println();
		System.out.println("-- update user Cool Raoul ---");
		selectDB.update("Baaaannn", "Zaiiii", "Cool", "Raoul");
		selectDB.select("*");

		System.out.println();
		System.out.println("-- delete user Cool Raoul ---");
		selectDB.delete("Cool", "Raoul");
		selectDB.select("*");
	}

}
