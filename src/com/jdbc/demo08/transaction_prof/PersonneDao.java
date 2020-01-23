package com.jdbc.demo08.transaction_prof;

import java.util.List;

public interface PersonneDao {
	Personne save(Personne personne);

	Personne remove(int id);

	Personne update(Personne personne);

	Personne findById(int id);

	List<Personne> getAll();
}
