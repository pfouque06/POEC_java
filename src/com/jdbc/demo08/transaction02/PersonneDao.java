package com.jdbc.demo08.transaction02;

import java.util.List;

public interface PersonneDao {
	Personne save(Personne personne);

	Personne remove(int id);

	Personne update(Personne personne);

	Personne findById(int id);

	List<Personne> getAll();
}
