package poo_J05.exceptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5, y = 0;
		try {
			System.out.println(x/y);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Exception: Div by zero - " + e);
			e.printStackTrace();
		}
		System.out.println("Fin");
	}

}
