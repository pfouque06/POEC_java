package poo_TP07.evaluation;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

abstract class Employe {

	private int id;
	private static int count;
	private String nom;
	private String prenom;
	private int age;
	private Date hiringDate;
	private double salaireCoef = 0;

	public Employe(String nom, String prenom, int age, Date hiringDate) {
		super();
		this.id = count++;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.hiringDate = hiringDate;
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return prenom + " " + nom;
	}
	
	public String getNom() {
		return "L'employé " + getFullName();
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	public Date getHiringDate() {
		return hiringDate;
	}

	public double getSalaireCoef() {
		return salaireCoef;
	}

	public void setSalaireCoef(double salaireCoef) {
		this.salaireCoef = salaireCoef;
	}

	abstract double calculerSalaire();
}

class SalaireVariable extends Employe {

	protected int salaireFixe;
	protected int salaireVariable;

	public SalaireVariable(String nom, String prenom, int age, Date hiringDate) {
		super(nom, prenom, age, hiringDate);
		// TODO Auto-generated constructor stub
	}

	public int getSalaireFixe() {
		return salaireFixe;
	}

	public int getSalaireVariable() {
		return salaireVariable;
	}

	@Override
	double calculerSalaire() {
		// TODO Auto-generated method stub
		return (double) salaireFixe + getSalaireCoef() * salaireVariable / 100;
	}

}

class Vendeur extends SalaireVariable {

	public Vendeur(String nom, String prenom, int age, Date hiringDate) {
		super(nom, prenom, age, hiringDate);
		// TODO Auto-generated constructor stub
		salaireFixe = 400;
		salaireVariable = 20;
	}

	public String getNom() {
		return "Le vendeur " + getFullName();
	}
}

class Representant extends SalaireVariable {

	public Representant(String nom, String prenom, int age, Date hiringDate) {
		super(nom, prenom, age, hiringDate);
		// TODO Auto-generated constructor stub
		salaireFixe = 800;
		salaireVariable = 20;
	}

	public String getNom() {
		return "Le représentant " + getFullName();
	}
}

class Ouvrier extends Employe {

	private double salaireUnitaire = 5;

	public Ouvrier(String nom, String prenom, int age, Date hiringDate) {
		super(nom, prenom, age, hiringDate);
		// TODO Auto-generated constructor stub
	}

	public double getSalaireUnitaire() {
		return salaireUnitaire;
	}

	@Override
	double calculerSalaire() {
		// TODO Auto-generated method stub
		return getSalaireCoef() * salaireUnitaire;
	}

	public String getNom() {
		return "L'ouvrier " + getFullName();
	}
}

class Manutentionnaire extends Employe {

	private double salaireHoraire = 65;

	public Manutentionnaire(String nom, String prenom, int age, Date hiringDate) {
		super(nom, prenom, age, hiringDate);
		// TODO Auto-generated constructor stub
	}

	public double getSsalaireHoraire() {
		return salaireHoraire;
	}

	@Override
	double calculerSalaire() {
		// TODO Auto-generated method stub
		return getSalaireCoef() * salaireHoraire;
	}

	public String getNom() {
		return "Le manut " + getFullName();
	}
}

interface MetierARisque {

	int primeMAR = 200;

	int getPrimeMensuelle();
}

class OuvrierMAR extends Ouvrier implements MetierARisque {

	public OuvrierMAR(String nom, String prenom, int age, Date hiringDate) {
		super(nom, prenom, age, hiringDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrimeMensuelle() {
		// TODO Auto-generated method stub
		return primeMAR;
	}

	@Override
	double calculerSalaire() {
		// TODO Auto-generated method stub
		return getPrimeMensuelle() + super.calculerSalaire();
	}

	public String getNom() {
		return "L'ouvrier à Métier à Risque " + getFullName();
	}

}

class ManutentionnaireMAR extends Manutentionnaire implements MetierARisque {

	public ManutentionnaireMAR(String nom, String prenom, int age, Date hiringDate) {
		super(nom, prenom, age, hiringDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrimeMensuelle() {
		// TODO Auto-generated method stub
		return primeMAR;
	}

	@Override
	double calculerSalaire() {
		// TODO Auto-generated method stub
		return getPrimeMensuelle() + super.calculerSalaire();
	}

	public String getNom() {
		return "Le manut à Métier à Risque " + getFullName();
	}

}

class Personnel {
	
	protected LinkedList<Employe> employes = new LinkedList<Employe>();

	public LinkedList<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(LinkedList<Employe> employes) {
		this.employes = employes;
	}
	
	public double salaireMoyen() {
		double result = 0;
		for(Employe employe : employes) {
			result += employe.calculerSalaire();
		}
		result = result / employes.size();
		return result;
	}
	
}

public class Salaires {

	public static void main(String[] args) {

		Employe vendeur = new Vendeur("Mando", "Damien", 33, new Date("01/01/2010"));
		Employe representant = new Representant("Relax", "Max", 69, new Date("01/01/2011"));
		Employe ouvrier = new Ouvrier("Roule", "Saoule", 25, new Date("01/01/2012"));
		Employe manut = new Manutentionnaire("Luyah", "Alle", 45, new Date("01/01/2013"));
		Employe ouvrierMAR = new OuvrierMAR("Dude", "Wassup", 35, new Date("01/01/2014"));
		Employe manutMAR = new ManutentionnaireMAR("Loubicou", "Marcha", 29, new Date("01/01/2015"));
		
		vendeur.setSalaireCoef(10000);
		System.out.println(vendeur.getNom() +", salaire: " + vendeur.calculerSalaire());
	
		representant.setSalaireCoef(10000);
		System.out.println(representant.getNom() +", salaire: " + representant.calculerSalaire());

		ouvrier.setSalaireCoef(400);
		System.out.println(ouvrier.getNom() +", salaire: " + ouvrier.calculerSalaire());
		ouvrierMAR.setSalaireCoef(400);
		System.out.println(ouvrierMAR.getNom() +", salaire: " + ouvrierMAR.calculerSalaire());
		
		manut.setSalaireCoef(7 * 20);
		System.out.println(manut.getNom() +", salaire: " + manut.calculerSalaire());
		manutMAR.setSalaireCoef(7 * 20);
		System.out.println(manutMAR.getNom() +", salaire: " + manutMAR.calculerSalaire());
		
		System.out.println();
		Personnel employes =new Personnel();
		employes.getEmployes().add(vendeur);
		employes.getEmployes().add(representant);
		employes.getEmployes().add(ouvrier);
		employes.getEmployes().add(ouvrierMAR);
		employes.getEmployes().add(manut);
		employes.getEmployes().add(manutMAR);
		System.out.println("salaire moyen : " + String.format("%.2f", employes.salaireMoyen()));
		
	}

}
