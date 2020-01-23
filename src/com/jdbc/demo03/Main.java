package com.jdbc.demo03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("insert request with PreparedStatement: add wick john");
		
		String url = "jdbc:mysql://localhost:3306/jdbc?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		String user = "root";
		String password = "root";
		try {
			// Driver mySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connexion = DriverManager.getConnection(url, user, password);
			// creation de la requete (statement)
			Statement statement = connexion.createStatement();

			
			// insert request and get generated keys
			// prepare request (request) with prepared statement
			String request = "INSERT INTO personne (nom, prenom) values (?,?)";
			PreparedStatement ps = connexion.prepareStatement(request, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, "Wick");
			ps.setString(2, "John");
			// statement.executeUpdate() -> insert, update, delete, create
			if ( ps.executeUpdate() != 0)
				System.out.println(">> insert successfull");
			
			// get generated keys
			ResultSet result = ps.getGeneratedKeys();
			while (result.next())
				System.out.println(">>\tnumero généré pour cette personne : [" + result.getInt(1) + "]");
			
			System.out.println();
			// statement.executeQuery() -> select
			// select request
			request = "SELECT * FROM Personne";
			result = statement.executeQuery(request);
			// ResultSet is iterator type
			if (result.first())
				System.out.println(">> SELECT successfull");
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
