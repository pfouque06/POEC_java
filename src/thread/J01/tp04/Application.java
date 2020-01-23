package thread.J01.tp04;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable Sylvie = new JobSylvieEtBruno();
		Runnable Bruno = new JobSylvieEtBruno();
		Thread S = new Thread(Sylvie);
		S.setName("Sylvie");
		Thread B = new Thread(Bruno);
		B.setName("Bruno");

		S.start();
		B.start();
		

	}

	

}
