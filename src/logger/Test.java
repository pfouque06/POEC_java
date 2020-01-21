package logger;

public class Test {

	static Logger logger = new Logger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		logger.logging("test1");

		logger.setHandler("syso");
		logger.logging("test2");

		logger.setHandler("System.out");
		logger.logging("test3");

		logger.setHandler("logger.log");
		logger.logging("test4");
		
		logger.close();
	}

}
