package thread.J01.tp02;

import java.util.Random;

public class MaTache implements Runnable {

	public void run() {
		for (int i = 0; i < 26; i++) {
			String nom = Thread.currentThread().getName();
			System.out.println(i + "- " + nom + " is running");
		}

	}

	public static void main(String[] args) {
		Runnable tache = new MaTache();
		Thread a = new Thread(tache);
		a.setName("Caroline");
		Thread b = new Thread(tache);
		b.setName("Cedric");
		a.start();
		b.start();
	}
}
