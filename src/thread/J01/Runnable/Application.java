package thread.J01.Runnable;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable compte1 = new Compte(1);
		new Thread(compte1).start();
		
		new Thread(new Compte(2000)).start();

	}
}
