package com.jdbc.demo07.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	private String url = "jdbc:mysql://localhost:3306/db_wed?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	private String user = "root";
	private String password = "root";
	private String table;
	private String myDriver = "com.mysql.cj.jdbc.Driver";
	private Connection connexion;

	public Jdbc() {
		try {
			// Driver mySQL
			Class.forName(myDriver);
			this.connexion = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getTable() {
		return table;
	}

	public boolean select(String columns) throws ClassNotFoundException {
		return select(columns, "");
	}

	public boolean select(String columns, String filter) throws ClassNotFoundException {

		try {
			if (this.table.isEmpty()) {
				System.out.println(">> SELECT Error : provided table is empty");
				return false;
			}
			columns = columns.isEmpty() ? "*" : columns;
			filter = filter.isEmpty() ? "" : " WHERE " + filter;

			// Driver mySQL
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// connecction, statement and request
			// Connection connexion = DriverManager.getConnection(url, user, password);
			Statement statement = this.connexion.createStatement();
			String request = "SELECT " + columns + " FROM " + this.table + filter;
			System.out.println(request);
			// Execute request
			ResultSet result = statement.executeQuery(request);
			// ResultSet is iterator type
			if (result == null)
				System.out.println(">> SELECT empty");

			// display result
			while (result.next()) {
				int id = result.getInt("id");
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				String sexe = result.getString("sexe");
				String rue = result.getString("rue");
				String codepostal = result.getString("codepostal");
				String ville = result.getString("ville");
				// display
				System.out.println(
						"[" + id + "] " + nom + " " + prenom + " " + sexe + " " + rue + " " + codepostal + " " + ville);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

	public boolean insert(String nom, String prenom, String rue) throws ClassNotFoundException {
		System.out.println("insert request: add user (nom, prenom, rue)");

		try {
			if (this.table.isEmpty()) {
				System.out.println(">> SELECT Error : provided table is empty");
				return false;
			}

			// Driver mySQL
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection connexion = DriverManager.getConnection(url, user, password);
			// creation de la requete (statement)
			Statement statement = this.connexion.createStatement();

			// excecution de la requete :
			// statement.executeQuery() -> select
			// statement.executeUpdate() -> insert, update, delete, create

			// insert request and get generated keys
			// prepare request (request)
			String request = "INSERT INTO " + this.table + " (nom, prenom, rue) VALUES ('" + nom + "','" + prenom + "','" + rue + "')";
			if (statement.executeUpdate(request, statement.RETURN_GENERATED_KEYS) != 0)
				System.out.println(">> INSERT successfull");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true; 		
	}

	public boolean delete(String nom, String prenom) throws ClassNotFoundException {
		System.out.println("delete request: delete user (nom, prenom)");
		
		try {
			if (this.table.isEmpty()) {
				System.out.println(">> SELECT Error : provided table is empty");
				return false;
			}
			
			// Driver mySQL
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection connexion = DriverManager.getConnection(url, user, password);
			// creation de la requete (statement)
			Statement statement = this.connexion.createStatement();
			
			// excecution de la requete :
			// statement.executeQuery() -> select
			// statement.executeUpdate() -> insert, update, delete, create
			
			// insert request and get generated keys
			// prepare request (request)
			// DELETE FROM personne WHERE num = ?
			String request = "DELETE FROM " + this.table + " WHERE nom = '" + nom + "' AND prenom = '" + prenom + "'";
			if (statement.executeUpdate(request, statement.RETURN_GENERATED_KEYS) != 0)
				System.out.println(">> DELETE successfull");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true; 		
	}
	
	public boolean update(String nom, String prenom, String newNom, String newPrenom) throws ClassNotFoundException {
		System.out.println("update request: delete user (nom, prenom)");

		try {
			if (this.table.isEmpty()) {
				System.out.println(">> SELECT Error : provided table is empty");
				return false;
			}

			// Driver mySQL
			// Class.forName("com.mysql.cj.jdbc.Driver");
			// Connection connexion = DriverManager.getConnection(url, user, password);
			// creation de la requete (statement)
			Statement statement = this.connexion.createStatement();

			// excecution de la requete :
			// statement.executeQuery() -> select
			// statement.executeUpdate() -> insert, update, delete, create

			// insert request and get generated keys
			// prepare request (request)
			// DELETE FROM personne WHERE num = ?
			String request = "UPDATE " + this.table + " set nom = '" + newNom + "', prenom = '" + newPrenom + "' WHERE nom = '" + nom + "' AND prenom = '" + prenom + "'";
			if (statement.executeUpdate(request, statement.RETURN_GENERATED_KEYS) != 0)
				System.out.println(">> UPDATE successfull");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true; 		
	}
	
	
}
