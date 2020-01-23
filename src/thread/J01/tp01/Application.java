package thread.J01.tp01;

import thread.J01.Runnable.Compte;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Digit()).start();
		new Thread(new Lettre()).start();
	}
}
