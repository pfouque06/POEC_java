package poo_TP08.gestionDeSalles;

import java.util.ArrayList;
import java.util.List;

public class SalleService implements IDao<Salle> {

	List<Salle> salles = new ArrayList<Salle>();
	
	@Override
	public boolean create(Salle o) {
		// TODO Auto-generated method stub
		return salles.add(o);
		
	}

	@Override
	public boolean delete(Salle o) {
		// TODO Auto-generated method stub
		return salles.remove(o);
	}

	@Override
	public boolean update(Salle o) {
		// TODO Auto-generated method stub
		Salle s = salles.get(o.getId());
		if ( s == null)
			return false;
		s.setCode(o.getCode());
		s.setLibelle(o.getLibelle());
		return true;
	}

	@Override
	public Salle findById(int id) {
		// TODO Auto-generated method stub
		return salles.get(id);
	}

	@Override
	public List<Salle> getAll() {
		// TODO Auto-generated method stub
		return salles;
	}

}
