package files.reader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//			File file = new File("monfichier.txt");
//			FileWriter fileW = new FileWriter(file);
//			FileWriter fileW = new FileWriter(new File("monfichier.txt"));
			FileWriter fileW = new FileWriter(new File("monfichier.txt"), true); // to append to file if exists (default is to recreate file)
			
			fileW.write("Hello World\n");
			fileW.write(86);  //ASCEE code
			fileW.write("\n");
			fileW.write('a');
			fileW.close();
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("monautrefichier.txt")));
			bw.write("Hello World");
			bw.newLine();
			bw.write(86);  //ASCEE code
			bw.newLine();
			bw.write('a');
			bw.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
