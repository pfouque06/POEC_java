package com.jdbc.demo08.transaction02;

import java.util.List;

public interface EnseignantDao {
	Enseignant save(Enseignant enseignant);

	Enseignant remove(int id);

	Enseignant update(Enseignant enseignant);

	Enseignant findById(int id);

	List<Enseignant> getAll();
}
