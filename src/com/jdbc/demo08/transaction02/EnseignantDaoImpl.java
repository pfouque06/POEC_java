package com.jdbc.demo08.transaction02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnseignantDaoImpl implements EnseignantDao {
	@Override
	public Enseignant save(Enseignant enseignant) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("insert into enseignant (nom,prenom,salaire) values (?,?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, enseignant.getNom());
				ps.setString(2, enseignant.getPrenom());
				ps.setDouble(3, enseignant.getSalaire());
				ps.executeUpdate();
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					enseignant.setNum(resultat.getInt(1));
					return enseignant;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Enseignant update(Enseignant enseignant) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("update enseignant set nom = ?, prenom = ?, salaire = ? where id = ? ");
				ps.setString(1, enseignant.getNom());
				ps.setString(2, enseignant.getPrenom());
				ps.setDouble(3, enseignant.getSalaire());
				ps.setInt(4, enseignant.getNum());
				ps.executeUpdate();
				System.out.println(
						"L'utilisateur avec id " + enseignant.getNum() + " a bien été modifié: " + enseignant.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Enseignant findById(int num) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select * from enseignant where id = ? ");
				ps.setInt(1, num);
				ResultSet r = ps.executeQuery();
				if (r.next())
					return new Enseignant(r.getInt("id"), r.getString("nom"), r.getString("prenom"), r.getDouble("salaire"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public List<Enseignant> getAll() {
		Connection c = MyConnection.getConnection();
		List<Enseignant> listPersonnes = new ArrayList<Enseignant>();
		String sql = "select * from enseignant";
		try {
			PreparedStatement pst = c.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			Enseignant enseignant = null;
			while (rs.next()) {
				enseignant = new Enseignant();
				enseignant.setNum(rs.getInt(1));
				enseignant.setNom(rs.getString(2));
				enseignant.setPrenom(rs.getString(3));
				enseignant.setSalaire(rs.getDouble(4));
				listPersonnes.add(enseignant);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listPersonnes;
	}

	@Override
	public Enseignant remove(int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("delete from enseignant where id = ? ");
				ps.setInt(1, id);
				int rows = ps.executeUpdate();
				if (rows == 1) {
					System.out.println("Le tuple a bien été supprimé!");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
