package com.jdbc.demo02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("insert request: add wick john");
		
		String url = "jdbc:mysql://localhost:3306/jdbc?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		String user = "root";
		String password = "root";
		try {
			// Driver mySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connexion = DriverManager.getConnection(url, user, password);
			// creation de la requete (statement)
			Statement statement = connexion.createStatement();

			// excecution de la requete :
			// statement.executeQuery() -> select
			// statement.executeUpdate() -> insert, update, delete, create
			
			// insert request and get generated keys
			// prepare request (request)
			String request = "INSERT INTO personne (nom, prenom) values ('Wick','John')";
			if ( statement.executeUpdate(request, statement.RETURN_GENERATED_KEYS) != 0)
				System.out.println(">> insert successfull");
			
			// get generated keys
			ResultSet result = statement.getGeneratedKeys();
			while (result.next()) {
				System.out.println(">>\tnumero généré pour cette personne : [" + result.getInt(1) + "]");
			}
			
			System.out.println();
			// select request
			request = "SELECT * FROM Personne";
			result = statement.executeQuery(request);
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
