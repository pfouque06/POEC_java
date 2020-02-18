package java8.tp11.Stream;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
			new Gagnants(2006, "Spain", "Óscar Pereiro", "Caisse d'Epargne–Illes Balears", 3657,Duration.parse("PT89H40M27S"), 8),
			new Gagnants(2007, "Spain", "Alberto Contador", "Discovery Channel", 3570, Duration.parse("PT91H00M26S"),4),
			new Gagnants(2008, "Spain", "Carlos Sastre", "Team CSC", 3559, Duration.parse("PT87H52M52S"), 5),
			new Gagnants(2009, "Spain", "Alberto Contador", "Astana", 3459, Duration.parse("PT85H48M35S"), 7),
			new Gagnants(2010, "Luxembourg", "Andy Schleck", "Team Saxo Bank", 3642, Duration.parse("PT91H59M27S"), 12),
			new Gagnants(2011, "Australia", "Cadel Evans", "BMC Racing Team", 3430, Duration.parse("PT86H12M22S"), 2),
			new Gagnants(2012, "Great Britain", "Bradley Wiggins", "Team Sky", 3496, Duration.parse("PT87H34M47S"), 14),
			new Gagnants(2013, "Great Britain", "Chris Froome", "Team Sky", 3404, Duration.parse("PT83H56M20S"), 14),
			new Gagnants(2014, "Italy", "Vincenzo Nibali", "Astana", 3661, Duration.parse("PT89H59M06S"), 19),
			new Gagnants(2015, "Great Britain", "Chris Froome", "Team Sky", 3360, Duration.parse("PT84H46M14S"), 16),
			new Gagnants(2016, "Great Britain", "Chris Froome", "Team Sky", 3529, Duration.parse("PT89H04M48S"), 14));

	public static void main(String args[]) {
		
		Stream<Gagnants> stream = gagnantsTDF.stream();
		stream.filter((d)->(d.getKilometres()<3500)).forEach(System.out::println);
		
		Set<Gagnants> set;
		
		System.out.println();
		System.out.println("------------<3500km---------------");
		set = gagnantsTDF.stream()
				.filter((d)->(d.getKilometres()<3500))
				.collect(Collectors.toSet());
		set.forEach(System.out::println);

		System.out.println();
		gagnantsTDF.stream()
			.filter((g)->(g.getKilometres()<3500))
			.map(Gagnants::getNom) // same as .map(g->g.getNom())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println();
		System.out.println("------------>=3500km---------------");
		gagnantsTDF.stream()
				.filter((d)->(d.getKilometres()>=3500))
				.collect(Collectors.toList())
				.forEach(System.out::println);
		
		System.out.println();
		System.out.println("------------<3500km limited to 2 first---------------");
		set = gagnantsTDF.stream()
				.filter((d)->(d.getKilometres()<3500))
				.limit(2)
				.collect(Collectors.toSet());
		set.forEach(System.out::println);
		
		System.out.println();
		System.out.println("------------all unique winner---------------");
		gagnantsTDF.stream()
				.map(Gagnants::getNom)
				.distinct()
				.collect(Collectors.toList())
				.forEach(System.out::println);

	
		System.out.println();
		System.out.println("------------count all unique winner---------------");
		Long count = gagnantsTDF.stream()
				.map(Gagnants::getNom)
				.distinct()
				.count();
		System.out.println(count);

		
		System.out.println();
		System.out.println("------------all winner except 2 firsts---------------");
		gagnantsTDF.stream()
				.skip(2)
				.collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println();
		System.out.println("------------display year and winnner name---------------");
		gagnantsTDF.stream()
				.map((w)-> w.getAnnee() + " " +  w.getNom())
				.collect(Collectors.toList())
				.forEach(System.out::println);
		
		System.out.println();
		System.out.println("------------char count of all winner name ---------------");
		gagnantsTDF.stream()
				// like map(g->g.getNom().length())
				.map(Gagnants::getNom) // like map(g->g.getNom()))
				.map(String::length) // like map(s->s.length())
				.collect(Collectors.toList())
				.forEach(System.out::println);


		System.out.println();
		System.out.println("------------all winner containing \"Wiggins\"---------------");
		gagnantsTDF.stream()
				.map(Gagnants::getNom) // like map(g->g.getNom()))
				.filter(s->s.contains("Wiggins"))
				.findAny()
				.ifPresent(System.out::println);

		System.out.println();
		System.out.println("------------winner of 2014---------------");
		System.out.println(
				gagnantsTDF.stream()
				.filter((w)->(w.getAnnee()==2014))
				.map(Gagnants::getAnnee) //like .map(g->g.getAnnee())
				.findFirst()
				.isPresent());
		
		System.out.println();
		System.out.println("------------total distance---------------");
		System.out.println(
				gagnantsTDF.stream()
				.map(Gagnants::getKilometres) //like .map(g->g.getKilometres())
				.reduce((w1,w2)->w1+w2) //reduce(0,Integer::sum)
				.get()); 

}

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