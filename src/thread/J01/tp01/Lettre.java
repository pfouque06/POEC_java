package thread.J01.tp01;

public class Lettre implements Runnable {

	public Lettre() {
		super();
	}

	public void run() {
		while (true) {

			try {
				for (char car = 'A'; car <= 'Z'; car++) {
					System.out.println(car + "");
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				return;
			}
		}

	}
}
