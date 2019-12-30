package exo001;

public class Exo004_DisplayBigJAVA {

	// display following text :
	
	//	   J    a    V     V    a   
	//	   J   a a    V   V    a a  
	//	J  J  aaaaa    V V    aaaaa 
	//	 JJ  a     a    V    a     a

	static String[] bigJ = {"   J","   J","J  J"," JJ "};
	static String[] biga = {"   a   ","  a a  "," aaaaa ","a     a"};
	static String[] bigV = {"V     V"," V   V ","  V V  ","   V   "};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ecrire JAVA en grand
		for (int line =0; line < 4; line++) {
			System.out.println(bigJ[line] + " " + biga[line] + " " + bigV[line] + " " + biga[line]);
		}
		
	}

}
