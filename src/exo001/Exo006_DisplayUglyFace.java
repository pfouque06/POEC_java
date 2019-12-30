package exo001;

public class Exo006_DisplayUglyFace {

	// dislay ugly face
	static String[] uglyFace = {
			" +\"\"\"\"\"+ ",
			"[| o o |]",
			" |  ^  |",
			" | '-' |",
			" +-----+"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ecrire JAVA en grand
		for (int line =0; line < 5; line++) {
			System.out.println(uglyFace[line]);
		}
		
	}

}
