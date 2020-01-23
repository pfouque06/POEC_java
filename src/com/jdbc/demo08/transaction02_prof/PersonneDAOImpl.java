package com.jdbc.demo08.transaction02_prof;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonneDAOImpl implements DAO<Personne> {
	
	@Override
	public void show() {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				c.setAutoCommit(false);
				List<Personne> listPersonnes = new ArrayList<Personne>();
				String sql = "select * from personne";
				PreparedStatement pst = c.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					Personne personne;
					personne = new Personne();
					personne.setNum(rs.getInt(1));
					personne.setNom(rs.getString(2));
					personne.setPrenom(rs.getString(3));
					listPersonnes.add(personne);
				}
				listPersonnes.forEach(System.out::println);
				c.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void saveAndShow(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				c.setAutoCommit(false);
				PreparedStatement ps = c.prepareStatement("insert into personne (nom,prenom) values (?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, personne.getNom());
				ps.setString(2, personne.getPrenom());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					personne.setNum(resultat.getInt(1));
				}
				List<Personne> listPersonnes = new ArrayList<Personne>();
				String sql = "select * from personne";
				PreparedStatement pst = c.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					personne = new Personne();
					personne.setNum(rs.getInt(1));
					personne.setNom(rs.getString(2));
					personne.setPrenom(rs.getString(3));
					listPersonnes.add(personne);
				}
				listPersonnes.forEach(System.out::println);
				c.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void removeAndShow(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				c.setAutoCommit(false);
				PreparedStatement ps = c.prepareStatement("delete from personne where num = ? ");
				ps.setInt(1, personne.getNum());
				int rows = ps.executeUpdate();
				if (rows == 1) {
					System.out.println("Le tuple a bien été supprimé!");
				}
				List<Personne> listPersonnes = new ArrayList<Personne>();
				String sql = "select * from personne";
				PreparedStatement pst = c.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					personne = new Personne();
					personne.setNum(rs.getInt(1));
					personne.setNom(rs.getString(2));
					personne.setPrenom(rs.getString(3));
					listPersonnes.add(personne);
				}
				listPersonnes.forEach(System.out::println);
				c.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateAndShow(Personne personne) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				c.setAutoCommit(false);
				PreparedStatement ps = c.prepareStatement("update personne set nom = ?, prenom = ? where num = ? ");
				ps.setString(1, personne.getNom());
				ps.setString(2, personne.getPrenom());
				ps.setInt(3, personne.getNum());
				ps.executeUpdate();
				System.out.println(
						"L'utilisateur avec id " + personne.getNum() + " a bien été modifié: " + personne.toString());
				List<Personne> listPersonnes = new ArrayList<Personne>();
				String sql = "select * from personne";
				PreparedStatement pst = c.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					personne = new Personne();
					personne.setNum(rs.getInt(1));
					personne.setNom(rs.getString(2));
					personne.setPrenom(rs.getString(3));
					listPersonnes.add(personne);
				}
				listPersonnes.forEach(System.out::println);
				c.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}