package java8.tp11.APIStream;

import java.time.Duration;
import java.util.*;

public class Gagnants {
	private int annnee;
	private String nationalite;
	private String nom;
	private String equipe;
	private int kilometres;
	private Duration temps;
	private int joursenjaune;

	public Gagnants(int annee, String nationalite, String nom, String equipe, int kilometres, Duration temps,
			int joursenjaune) {
		this.annnee = annee;
		this.nationalite = nationalite;
		this.nom = nom;
		this.equipe = equipe;
		this.kilometres = kilometres;
		this.temps = temps;
		this.joursenjaune = joursenjaune;
	}

	public static final List<Gagnants> gagnantsTDF = Arrays.asList(
			new Gagnants(2006, "Spain", "Óscar Pereiro", "Caisse d'Epargne–Illes Balears", 3657,
					Duration.parse("PT89H40M27S"), 8),

			new Gagnants(2007, "Spain", "Alberto Contador", "Discovery Channel", 3570, Duration.parse("PT91H00M26S"),
					4),
			new Gagnants(2008, "Spain", "Carlos Sastre", "Team CSC", 3559, Duration.parse("PT87H52M52S"), 5),
			new Gagnants(2009, "Spain", "Alberto Contador", "Astana", 3459, Duration.parse("PT85H48M35S"), 7),
			new Gagnants(2010, "Luxembourg", "Andy Schleck", "Team Saxo Bank", 3642, Duration.parse("PT91H59M27S"), 12),
			new Gagnants(2011, "Australia", "Cadel Evans", "BMC Racing Team", 3430, Duration.parse("PT86H12M22S"), 2),
			new Gagnants(2012, "Great Britain", "Bradley Wiggins", "Team Sky", 3496, Duration.parse("PT87H34M47S"), 14),
			new Gagnants(2013, "Great Britain", "Chris Froome", "Team Sky", 3404, Duration.parse("PT83H56M20S"), 14),
			new Gagnants(2014, "Italy", "Vincenzo Nibali", "Astana", 3661, Duration.parse("PT89H59M06S"), 19),
			new Gagnants(2015, "Great Britain", "Chris Froome", "Team Sky", 3360, Duration.parse("PT84H46M14S"), 16),
			new Gagnants(2016, "Great Britain", "Chris Froome", "Team Sky", 3529, Duration.parse("PT89H04M48S"), 14));

	public double getVitesseMoyenne() {
		return (getKilometres() / (getTemps().getSeconds() / 3600));
	}

	public int getAnnee() {
		return annnee;
	}

	public void setAnnee(int year) {
		this.annnee = year;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationality) {
		this.nationalite = nationality;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String name) {
		this.nom = name;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String team) {
		this.equipe = team;
	}

	public int getKilometres() {
		return kilometres;
	}

	public void setKilometres(int lengthKm) {
		this.kilometres = lengthKm;

	}

	public Duration getTemps() {
		return temps;
	}

	public void setTemps(Duration winningTime) {
		this.temps = winningTime;
	}

	public int getJoursenjaune() {
		return joursenjaune;
	}

	public void setJoursenjaune(int daysInYellow) {
		this.joursenjaune = daysInYellow;
	}

	@Override
	public String toString() {
		return nom;
	}
}