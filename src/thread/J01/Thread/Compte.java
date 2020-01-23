package thread.J01.Thread;

public class Compte extends Thread {
	int valeur;

	public Compte(int valeur) {
		super();
		this.valeur = valeur;
	}

	public void run() {
		try {
			while (true) {

				System.out.println(valeur + "");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			return;
		}
	}
}
