package com.jdbc.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("select request : * from personne");
		
		//String url = "jdbc:mysql://localhost:3306/jdbc";  -> KO
		//String url = "jdbc:mysql://localhost:3306/jdbc?zeroDateTimeBehavior=CONVERT_TO_NULL";  -> KO
		//String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=UTC";  -> OK !!
		String url = "jdbc:mysql://localhost:3306/jdbc?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		String user = "root";
		String password = "root";
		try {
			// Driver mySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connexion = DriverManager.getConnection(url, user, password);
			// creation de la requete (statement)
			Statement statement = connexion.createStatement();
			// prepare request (request)
			String request = "SELECT * FROM personne";
			// excecution de la requete :
			// statement.executeQuery() -> select
			// statement.executeUpdate() -> insert, update, delete, create
			
			// select request
			ResultSet result = statement.executeQuery(request);
			// ResultSet is iterator type
			if (result.first())
				System.out.println(">> insert successfull");
			while (result.next()) {
				int idPersonne = result.getInt("num");
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				System.out.println("[" + idPersonne + "] " + nom + " " + prenom);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
