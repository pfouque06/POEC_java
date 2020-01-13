package poo_J01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Enseignant extends Person {
	
	private long salaire;
	private Date hiredDate;
	
	public Enseignant(String nom, String prenom, Date birthdate, long salaire,Date hireDate) {
		super(nom, prenom, birthdate);
		this.salaire = salaire;
		this.hiredDate = hireDate;
	}

	public long getSalaire() {
		return salaire;
	}

	public void setSalaire(long salaire) {
		this.salaire = salaire;
	}

	public Date getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	@Override
	public String toString() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return "Enseignant [ " + super.toString() + ", salaire=" + salaire + ", hiredDate=" + dateFormat.format(hiredDate) + "]";
	}
	
}
