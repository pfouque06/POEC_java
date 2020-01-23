package thread.J01.tp04;

public class JobSylvieEtBruno implements Runnable {

	static Compte compte = new Compte();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int loop= 1; loop <=10; loop++ ) {
			effectuerRetrait(10);
		}
	}
	
	void effectuerRetrait(int montant) {
		
		String nom = Thread.currentThread().getName();
		int solde = compte.getSolde();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (solde>=montant ) {
			compte.retraitArgent(montant);
			System.out.println(nom + " a retiré "+ montant +"€ - solde = " + compte.getSolde());
		} else
			System.out.println("le solde ("+solde+"€)du compte ne permet pas de retirer le montant "  + montant +"€ par " + nom);		
	}

}
