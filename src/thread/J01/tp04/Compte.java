package thread.J01.tp04;

public class Compte {
	private int solde = 100;

	public int getSolde() {
		return solde;
	}

	public void retraitArgent(int montant) {
		solde = solde - montant;
	}
}