package maCalculette;

import java.io.PrintStream;
import java.util.ArrayList;

import observer.Observed;
import observer.Observer;

public class Calculette implements Observed {

	// logger
	PrintStream logger = Main.logger;
	
	// Nos variables d'environnement locales
	private String input = "", display = "", action = "", memory = "";
	private double value = 0;
	private boolean memSet = false;
	// Notre collection d'observateurs
	private ArrayList<Observer> listObserver = new ArrayList<Observer>();

	public Calculette() {

	}

	public void init() {
		this.input = "";
		this.display = "";
		this.action = "";
		this.value = 0;
		this.updateObserver();
	}

	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void processAction(String buttonTitle) {
		// TODO Auto-generated method stub
		logger.println(">> processAction : " + buttonTitle);
		switch (buttonTitle) {
		case ".":
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "<":
			keyboardClic(buttonTitle);
			break;
		case "+":
		case "-":
		case "x":
		case "/":
		case "%":
		case "=":
			actionClic(buttonTitle);
			break;
		case "MS":
		case "MC":
			memoryClic(buttonTitle);
			break;
		case "C":
			resetClic();
			break;
		}
		// this.updateObserver();
	}

	private void keyboardClic(String buttonTitle) {
		// TODO Auto-generated method stub
		logger.println(">> keyboardClic : " + buttonTitle);
		switch (buttonTitle) {
		case ".":
			if (input.isEmpty())
				input = "0."; // start decimal value
			if (!input.contains("."))
				input += "."; // add "." once
			break;
		case "0":
			if (input.isEmpty())
				input = "0";
			else {
				if (!input.equals("0"))
					input += "0"; // ad "0" only if input not empty
			}
			break;
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			if (input.equals("0"))
				input = ""; // emptying input buffer if only zero char is found
			input += buttonTitle;
			break;
		case "<":
			if ( input.isEmpty()) {
				if (display.isEmpty())
					break;
				input = display;
			}
			input = input.substring(0, input.length() - 1 );
			break;
		}
		display = input; // update Frame
		this.updateObserver();
		logger.println(">> display= " + display + " value= " + value + " action= " + action + " input=" + input);

	}

	private void actionClic(String buttonTitle) {
		// TODO Auto-generated method stub
		logger.println(">> actionClic");

		if (input.isEmpty())
			input = display; // set input to display if empty is null
		if (action.isEmpty()) { // no action previously selected
			if (buttonTitle == "=") { // not operande selected
				display = input; // update display
				value = 0;
				input = "";
			} else {
				if (!input.isEmpty()) { // store value and operande
					value = Double.valueOf(input);
					action = buttonTitle;
					input = "";
					display = input; // update display
				} // nothing stored is no numeric input provided
			}
		} else { // operande has been previously set
			if (!input.isEmpty()) { // process calculation is numeric input is provided
				double newValue = Double.valueOf(input);
				logger.print(">> process : " + value + " " + action + " " + newValue);
				switch (action) {
				case "+":
					value += newValue;
					break;
				case "-":
					value -= newValue;
					break;
				case "x":
					value *= newValue;
					break;
				case "/":
					if (input.matches("^0+\\.*0*")) {
						logger.println(">> actionClic : ERROR : Div/0");
						display = "Error"; // update Frame
						break;
					}
					value /= newValue;
					break;
				case "%":
					if (input.matches("^0+\\.*0*")) {
						logger.println(">> actionClic : ERROR : Div/0");
						display = "Error"; // update Frame
						break;
					}
					value %= newValue;
					break;
				}
				logger.println(" = " + value);
				if (!display.equals("Error"))
					display = String.valueOf(value); // update Frame
			}
			action = buttonTitle;
			input = "";
			if (buttonTitle == "=") {
				value = 0;
				action = "";
			}
		}
		this.updateObserver();
		logger.println(">> display= " + display + " value= " + value + " action= " + action + " input=" + input);

	}

	private void memoryClic(String buttonTitle) {
		// TODO Auto-generated method stub
		logger.println(">> memoryClic : memory= " + memory + " memSet= " + memSet);
		switch (buttonTitle) {
		case "MC": // Reset memory
			memory = "";
			memSet = false; // update Frame
			break;
		case "MS": // set or provide memory if already set
			if (memSet) {
				input = memory;
				display = input;
			} else {
				if (input.isEmpty())
					input = display; // set input to display if empty is null
				if (! input.isEmpty()) {
					memory = input; // memory updated if empty not null
					memSet = true; // update Frame
				}
			}
			break;
		}
		this.updateObserver();
		logger.println(">> memory= " + memory + " memSet= " + memSet);
		logger.println(">> display= " + display + " value= " + value + " action= " + action + " input=" + input);
	}

	private void resetClic() {
		// TODO Auto-generated method stub
		logger.println(">> resetClic");
		this.init();
		logger.println(">> display= " + display + " value= " + value + " action= " + action + " input=" + input);
	}

	// Ajoute un observateur à la liste
	public void addObserver(Observer obs) {
		this.listObserver.add(obs);
	}

	// Retire tous les observateurs de la liste
	public void delObserver() {
		this.listObserver = new ArrayList<Observer>();
	}

	// Avertit les observateurs que l'objet observable a changé
	// et invoque la méthode update() de chaque observateur
	public void updateObserver() {
		// logger.println("observed inform observer to run an update!! ->");
		for (Observer obs : this.listObserver) {
			obs.update(display);
			obs.update(memSet);

		}
	}

}
