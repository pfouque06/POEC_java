package files.writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println();
			System.out.println("-----filereader----");
//			File file = new File("monfichier.txt");
//			FileReader fileW = new FileReader(file);
			FileReader fileR = new FileReader(new File("monfichier.txt"));
			
			int car;
			while ((car = fileR.read())!= -1 ) {
				System.out.print((char) car);
				car = fileR.read();
			}
			System.out.println();
			fileR.close();
			
			System.out.println();
			System.out.println("-----bufferedreader----");
			BufferedReader br = new BufferedReader(new FileReader(new File("monautrefichier.txt")));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
			}
			br.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
