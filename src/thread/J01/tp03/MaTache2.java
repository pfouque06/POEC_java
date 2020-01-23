package thread.J01.tp03;

import java.util.Random;

public class MaTache2 extends Thread {

	public void run() {
		String nom = Thread.currentThread().getName();
		try {
			for (int i = 0; i <=10; i++) {
				Thread.sleep(new Random().nextInt(201)); // entre 0 et 200msec
				System.out.println(i + "- " + nom + " is running");
			}
		} catch (InterruptedException e) {
			return;
		}
		System.out.println(nom + " is OVER");
	}
	
	public static void main (String[] args) {
		//Runnable tache = new MaTache2();
		Thread a = new MaTache2();
		a.setName("Caroline");
		Thread b = new MaTache2();
		b.setName("Cedric");
		Thread c = new MaTache2();
		c.setName("Cyril");
		
		a.start();
		b.start();
		c.start();
		
		try {
			a.join();
			b.join();
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String nom = Thread.currentThread().getName();
		int prio = Thread.currentThread().getPriority();
		System.out.println(nom + " is OVER");
		System.out.println(nom + " à la priorite : " + prio );
	}
}
