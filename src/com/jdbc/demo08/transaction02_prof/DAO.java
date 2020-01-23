package com.jdbc.demo08.transaction02_prof;

public interface DAO<T> {
	void show();

	void saveAndShow(T o);

	void removeAndShow(T o);

	void updateAndShow(T o);
}