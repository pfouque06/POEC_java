package poo_J05.exceptions.projet;

public class Adresse {

	private String rue;
	private String ville;
	private String codePostal;
	public Adresse(String rue, String ville, String codePostal) throws IncorrectCodePostalException, IncorrectStreetNameException {
		super();
		//if (! rue.matches("[A-Z]*"))
		///if (! rue.matches("([A-Z]|\\s)*"))
		if ( ! rue.equals(rue.toUpperCase()))
			throw new IncorrectStreetNameException(rue);
		this.rue = rue;
		this.ville = ville;
		if (! codePostal.matches("^\\d{5}$"))
			throw new IncorrectCodePostalException(codePostal);
		this.codePostal = codePostal;
	}
	
	public static void main(String[] args) {
		try {
			Adresse toto = new Adresse("RUE", "ville", "0000000000");
			System.out.println(toto);
		} catch (IncorrectCodePostalException | IncorrectStreetNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Adresse titi = new Adresse("rue", "ville", "00000");
			System.out.println(titi);
		} catch (IncorrectCodePostalException | IncorrectStreetNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Adresse tata = new Adresse("RUE", "ville", "00000");
			System.out.println(tata);
		} catch (IncorrectCodePostalException | IncorrectStreetNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Adresse tutu = new Adresse("RUE MAGOO", "ville", "00000");
			System.out.println(tutu);
		} catch (IncorrectCodePostalException | IncorrectStreetNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) throws IncorrectStreetNameException {
		if ( ! rue.equals(rue.toUpperCase()))
			throw new IncorrectStreetNameException(rue);
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) throws IncorrectCodePostalException {
		if (! codePostal.matches("^\\d{5}$"))
			throw new IncorrectCodePostalException(codePostal);
		this.codePostal = codePostal;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + "]";
	}
	
	
}
