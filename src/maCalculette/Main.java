package maCalculette;

import java.io.IOException;
import java.io.PrintStream;
import java.util.LinkedHashSet;

import logger.Logger;
import getOpts.GetOpts;

public class Main {

	// globals
	// logger
	static Logger logger;

	// public global variables
	public static boolean logging = false;

	static String[] optionArray = {
	"##### DO NOT FORGET FOLLOWING HEADER LINE !! #####",
	"TYPE:KEY:KEYWORD:VALUENAME:VALUETYPE:DETAIL:ACTION:",
	"F:h:help:usage:-:prints this help message:true:",
	"F:L:log:logging:boolean:set logging mode (to console/terminal):true:",
	};
	public static GetOpts options = new GetOpts(optionArray);

	public static boolean setOpts(String[] pArgs) {
		// System.out.println("optionTable=\n"+options.optionTable_toString());
		// parse options pArgs
		if (!options.setOptionList(pArgs)) {
			System.out.println("Parsing error, please retry or use -h, --help to get usage ...");
			return false;
		}
		// System.out.println("optionList=\n"+options.optionList_toString());
		// set options
		if (!setOpts(options.getOptionList())) {
			options.getUsage(System.out); // use STDOUT when help is requested
			return false;
		}
		// System.out.println("options:" + optsToString());
		return true;
	}

	public static boolean setOpts(LinkedHashSet<String[]> pList) {
		// Loop on each options of pList
		for (String[] fields : pList) {
			// System.out.println("fields="+fields.toString() );
			switch (fields[2]) {
			case "logging": // System.out.println("logging to System.out");
				logging = fields[3].equals("true");
				break;
			case "usage":
				return false;
			default:
				System.err.println("Error: option > valuename unknown");
			}
		}
		return true;
	}

	public static String optsToString() {

		String buffer = "";

		buffer += "logging: " + (logging ? "ON" : "OFF");
		return buffer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// parse args :
		//initiate getOpts class and parse args according to optionArray
		if (!setOpts(args))
			return;

		// init logger
		logger = new Logger(logging ? "syso" : "");
		logger.logging(optsToString());

		Fenetre frame = new Fenetre();
	}

}
