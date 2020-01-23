package thread.J01.tp01;

public class Digit implements Runnable {

	public Digit() {
		super();
	}

	public void run() {

		while (true) {

			try {
				for (int index = 1; index <= 26; index++) {
					System.out.println(index);
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				return;
			}
		}

	}
}
