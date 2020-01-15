package maCalculette;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Main {

	// globals
	// logger
	static PrintStream logger;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// init logger
		logger = new PrintStream(System.out);
		//		try {
		//			//File loggerFile = new File("logger.log");
		//			//loggerFile.deleteOnExit();
		//			//logger = new PrintStream(loggerFile);
		//			logger = new PrintStream("logger.log");
		//		} catch (IOException e) {
		//			// TODO Auto-generated catch block
		//			//e.printStackTrace();
		//		} finally {
		//			// writer.close();
		//		}
		
		Fenetre frame = new Fenetre();
	}

}
