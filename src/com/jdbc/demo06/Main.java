package com.jdbc.demo06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("delete request with PreparedStatement : Dae Jean");
		
		String url = "jdbc:mysql://localhost:3306/jdbc?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		String user = "root";
		String password = "root";
		try {
			// Driver mySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connexion = DriverManager.getConnection(url, user, password);
			// creation de la requete (statement)
			Statement statement = connexion.createStatement();
			String request;
			ResultSet result;
			
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
			
			System.out.println();
			// statement.executeQuery() -> select
			// select request
			request = "SELECT * FROM Personne WHERE nom = 'Dae' and prenom = 'Jean'";
			result = statement.executeQuery(request);
			// ResultSet is iterator type
			if (result.first())
				System.out.println(">> SELECT successfull");
			else {
				System.out.println(">> SELECT error - ");
				return;
			}
			int requestID = result.getInt("num");
			System.out.println(">> id : " + requestID);
			
			// insert request and get generated keys
			// prepare request (request) with prepared statement
			//request = "update personne set nom = 'Dae', prenom = 'Jean' where num = " + requestID;
			PreparedStatement ps = connexion.prepareStatement("DELETE FROM personne WHERE num = ?");
			ps.setInt(1, requestID);
			if ( ps.executeUpdate() != 0)
				System.out.println(">> delete successfull");
			System.out.println("User with id " + requestID + " was deleted in DB with following details: nom = 'Dae', prenom = 'Jean'");
			
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
