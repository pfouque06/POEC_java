package com.jdbc.demo08.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class transaction02 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		String user = "root";
		String passwd = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, passwd);
			conn.setAutoCommit(false);
			String sql = "delete from Personne where nom = ? and prenom = ?";
			PreparedStatement state = conn.prepareStatement(sql);
			state.setString(1, "Wick");
			state.setString(2, "John");
			if (state.executeUpdate() > 0) {
				System.out.println("A new class was inserted successfully!");
			}
			ResultSet result = state.executeQuery("SELECT * FROM Personne");
			result.first();
			while (result.next()) {
				System.out.println("Nom : " + result.getString("nom") + " - Prenom : " + result.getString("prenom"));
			}
			conn.commit();
			result.close();
			state.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
