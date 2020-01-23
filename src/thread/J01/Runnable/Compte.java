package thread.J01.Runnable;

import java.util.Random;

public class Compte implements Runnable {
	int valeur;

	public Compte(int valeur) {
		super();
		this.valeur = valeur;
	}

	public void run() {
		try {
			while (true) {

				System.out.println(valeur + "");
				Thread.sleep(new Random().nextInt(201)+100);// entre 100 et 300ms
			}
		} catch (InterruptedException e) {
			return;
		}
	}
}
