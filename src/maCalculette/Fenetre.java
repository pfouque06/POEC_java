package maCalculette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import observer.Observer;

 

public class Fenetre extends JFrame implements ActionListener, KeyListener {

	// logger
	PrintStream logger = Main.logger;
	
	// locales
	private JPanel container = new JPanel();
	private JPanel labelPan = new JPanel();
	private JLabel label = new JLabel("0");
	private JPanel keyboardPan = new JPanel();
	private String[] kNames = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "<"} ;
	private ArrayList<String> kLabels = new ArrayList<String>(Arrays.asList(kNames));
	//private int[] kKeys = { KeyEvent.VK_7, KeyEvent.VK_8, KeyEvent.VK_9, KeyEvent.VK_4, KeyEvent.VK_5, KeyEvent.VK_6, KeyEvent.VK_1, KeyEvent.VK_2, KeyEvent.VK_3, KeyEvent.VK_0, KeyEvent.VK_PERIOD, KeyEvent.VK_BACK_SPACE} ;
	private int[] kKeys = { 16777448, KeyEvent.VK_UNDERSCORE, 16777415, KeyEvent.VK_QUOTE, KeyEvent.VK_LEFT_PARENTHESIS, KeyEvent.VK_MINUS, KeyEvent.VK_AMPERSAND, 16777449, KeyEvent.VK_QUOTEDBL, 16777440, KeyEvent.VK_SEMICOLON, KeyEvent.VK_BACK_SPACE} ;
	private JButton[] kButtons = new JButton[12];
	private JPanel ActionPan = new JPanel();
	private String[] aNames = { "/", "C", "x", "MC", "-", "MS", "+", "="};
	private ArrayList<String> aLabels = new ArrayList<String>(Arrays.asList(aNames));
	//private int[] aKeys = { KeyEvent.VK_DOWN, 127, KeyEvent.VK_UP , KeyEvent.VK_PAGE_UP, KeyEvent.VK_LEFT, KeyEvent.VK_PAGE_DOWN, KeyEvent.VK_RIGHT, 10};
	private int[] aKeys = { -1, 127, -1, -1, -1, -1, -1, 10};
	private JButton[] aButtons = new JButton[8];
	int indexMS = 0;

	private Calculette calculette;

	void processKeyPanBinding(String keyPressed) {
		if (kLabels.contains(keyPressed))
			kButtons[kLabels.indexOf(keyPressed)].doClick();
	}

	void processActionPanBinding(String keyPressed) {
		if (aLabels.contains(keyPressed))
			aButtons[aLabels.indexOf(keyPressed)].doClick();
	}
	
	void processKeytoButtonBinding(String keyPressed) {
		System.out.println(">> keybindAction.processKeytoButtonBinding(" + keyPressed + ")");
		switch (keyPressed) {
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
			processKeyPanBinding(keyPressed);
			break;
		case "+":
		case "-":
		case "x":
		case "/":
		case "=":
		case "C":
			processActionPanBinding(keyPressed);
			break;
		default:
			break;
		}
	}
	
	public Fenetre() {
		// TODO Auto-generated constructor stub
		
//		AbstractAction keybindAction = new AbstractAction() {
//			@Override
//			public void actionPerformed(ActionEvent ae) {
//				//String buttonTitle = "";
//				String buttonTitle =  ae.getActionCommand();
//				// special keys decoding
//				switch((int)buttonTitle.charAt(0)) {
//				case 8 :			// case backspace -> <
//					buttonTitle = "<";
//					break;
//				case 10 :			// case entrée -> =
//					buttonTitle = "=";
//					break;
//				case 127 :			// case suppr -> C
//					buttonTitle = "C";
//					break;
//				}
//				// keycode multiplexing
//				switch(buttonTitle) {
//				case ";":	// case .
//					buttonTitle = ".";
//					break;
//				// KeyboardPan
//				case "à":	// case à = 0
//					buttonTitle = "0";
//					break;
//				case "&":	// case 1
//					buttonTitle = "1";
//					break;
//				case "é" : 	// case é = 2
//					buttonTitle = "2";
//					break;
//				case "\"":	// case 3
//					buttonTitle = "3";
//					break;
//				case "'":	// case 4
//					buttonTitle = "4";
//					break;
//				case "(":	// case 5
//					buttonTitle = "5";
//					break;
//				case "-":	// case 6
//					buttonTitle = "6";
//					break;
//				case "è" :	// case è = 7
//					buttonTitle = "7";
//					break;
//				case "_": 	// case 8
//					buttonTitle = "8";
//					break;
//				case "ç":	// case ç = 9
//					buttonTitle = "9";
//					break;
//				// ActionPan
//				case "=":	// case +
//					buttonTitle = "+";
//					break;
//				case ")":	// case -
//					buttonTitle = "-";
//					break;
//				case "*":	// case x
//					buttonTitle = "x";
//					break;
//				case "ù":	// case /
//					buttonTitle = "/";
//					break;
//				//case "=":	// case = -> CR for default button
//				//	buttonTitle = "=";
//				//	break;
//				}
//				System.out.println(">> keybindAction.actionPerformed(" + buttonTitle + ")");
//				processKeytoButtonBinding(buttonTitle);
//				//core.processAction(buttonTitle);
//			}
//		};
		
		
		// On initialise la JFrame
		this.setTitle("Calculette");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 220);
		//this.setSize(290, 210); // Home setting
		this.setLocationRelativeTo(null);
		//this.setResizable(true);
		this.setResizable(false);
		this.setAlwaysOnTop(true);

		// init Digit Keyboard Buttons
		keyboardPan.setPreferredSize(new Dimension(165, 225));
		Dimension dim = new Dimension(50, 30);
		Font kFont = new Font("DS-digital", Font.TYPE1_FONT, 15);
		//Font kFont = new Font("Goudy Bookletter 1911", Font.TYPE1_FONT, 15);
		// Goudy Bookletter 1911
		for (int indexCell = 0; indexCell < kNames.length ; indexCell++) {
			kButtons[indexCell] = new JButton(kNames[indexCell])  {
				@Override
				protected boolean processKeyBinding(KeyStroke ks, KeyEvent ke, int i, boolean bln) {
					boolean b = super.processKeyBinding(ks, ke, i, bln);
					//if (b && ks.getKeyCode() == kKeys[indexCell])
					if (b)
						requestFocusInWindow();
					return b;
				}
			};
			kButtons[indexCell].setPreferredSize(dim);
			kButtons[indexCell].setFont(kFont);
			kButtons[indexCell].addActionListener(this); // l'observer est notre fenetre
			keyboardPan.add(kButtons[indexCell]);
			// key assocation
			//kButtons[indexCell].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(kKeys[indexCell], 0), kNames[indexCell]);
			//kButtons[indexCell].getActionMap().put(kNames[indexCell], keybindAction);
		}
		
		ActionPan.setPreferredSize(new Dimension(125, 225));
		Dimension aDim = new Dimension(55, 30);
		//Font aFont = new Font("Dialog", Font.BOLD, 12); //PLAIN , ITALIC, 
		for (int indexCell = 0; indexCell < aNames.length ; indexCell++) {
			if (aNames[indexCell].equals("MS"))
				indexMS = indexCell;
			aButtons[indexCell] = new JButton(aNames[indexCell])  {
				@Override
				protected boolean processKeyBinding(KeyStroke ks, KeyEvent ke, int i, boolean bln) {
					boolean b = super.processKeyBinding(ks, ke, i, bln);
					//if (b && ks.getKeyCode() == kKeys[indexCell])
					if (b)
						requestFocusInWindow();
					return b;
				}
			};
			aButtons[indexCell].setPreferredSize(aDim);
			//aButtons[indexCell].setFont(kFont);
			aButtons[indexCell].addActionListener(this); // l'observer est notre fenetre
			ActionPan.add(aButtons[indexCell]);
			// key assocation
			//aButtons[indexCell].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(aKeys[indexCell], 0), aNames[indexCell]);
			//aButtons[indexCell].getActionMap().put(aNames[indexCell], keybindAction);
		}

		// On initialise le JLabel
		//Font police = new Font("DS-digital", Font.TYPE1_FONT, 20);
		//Font police = new Font("Segment14", Font.PLAIN, 25);
		//Font police = new Font("ledfont-sharp", Font.BOLD , 20);
		Font police = null;
		File fileFont;
		try {
			//BufferedWriter writer;
			String workingDir = new File("").getAbsolutePath();
			logger.println("workingDir: "+workingDir);
			//URL resource = Fenetre.class.getResource("/");
			//logger.println("resource: "+resource);
			//logger.println("resource.getPath(): "+resource.getPath());
			String resourceDir = this.getClass().getResource("/").getPath();
			String classPath = resourceDir.substring(0, resourceDir.lastIndexOf("/bin"));
			logger.println("classPath: "+classPath);
			
			//fileFont = new File("font/ledfont-sharp-Regular.otf");
			//fileFont = new File("font/PixelOperator-Bold.ttf");
			//fileFont = new File("font/PixelOperatorHB.ttf");
			//fileFont = new File("font/PixelOperatorHBSC.ttf");
			//fileFont = new File("font/PixelOperator.ttf");
			fileFont = new File(classPath + "/" + "font/PixelOperator.ttf");
			logger.println("fileFont: " + fileFont.getAbsolutePath());
			police = Font.createFont(Font.TRUETYPE_FONT, fileFont);
			//police = police.deriveFont((float)20);
			//police = police.deriveFont(Font.BOLD, (float)25);
			police = police.deriveFont(Font.PLAIN, (float)35);
		} catch(Exception ex) {
		    System.err.println(ex.getMessage());
		};

		label.setFont(police);
		//label.setBorder(new LineBorder(Color.black, 1));
		label.setBorder(new EmptyBorder(4, 4, 4, 4));
		label.setHorizontalAlignment(JLabel.RIGHT);
		//label.setBackground(Color.white);
		labelPan.setLayout(new BorderLayout());
		labelPan.setBorder(new LineBorder(Color.darkGray, 1));
		//labelPan.setBorder(new EmptyBorder(2, 2, 2, 2));
		labelPan.setBackground(Color.white);
		labelPan.add(label);

		// On initialise le container panel de la JFrame
		container.setLayout(new BorderLayout());
		//container.setBorder(new EmptyBorder(2, 2, 2, 2));
		container.add(labelPan, BorderLayout.NORTH);
		container.add(keyboardPan, BorderLayout.WEST);
		container.add(ActionPan, BorderLayout.EAST);
		container.addKeyListener(this);
		this.setContentPane(container);
		this.setVisible(true);
		this.setAlwaysOnTop(true);
		//this.getRootPane().setDefaultButton(aButtons[7]); // CR is "=" as default button

		// On initialise la calculette
		this.calculette = new Calculette();
		// On place un écouteur sur la calculettte
		this.calculette.addObserver(new Observer() {
			
			public void update(String pString) {
				// logger.println("-> Observer is informed by Observed to run an update !");
				label.setText( (pString.isEmpty()? "0" : pString));
			}
			
			public void update(boolean pBoolean) {
				// TODO Auto-generated method stub
				aButtons[indexMS].setForeground((pBoolean ? Color.blue : Color.black));
			}
		});
		
		// run Horloge
		this.calculette.run();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		logger.println(">> actionPerformed");
		//JButton buttonHit= (JButton) arg0.getSource();
		//String buttonTitle = buttonHit.getName();
		String buttonTitle = arg0.getActionCommand();
		logger.println(">> buttonTitle= " + buttonTitle);
		calculette.processAction(buttonTitle);
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		// TODO Auto-generated method stub
		System.out.println("Key pressed code=" + ke.getKeyCode() + ", extended code=" + ke.getExtendedKeyCode()
				+ ", char=" + ke.getKeyChar() + ", text=" + KeyEvent.getKeyText(ke.getKeyCode()));
		System.out.println("\tke=" + ke);
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		// TODO Auto-generated method stub
		System.out.println("Key released code=" + ke.getKeyCode() + ", extended code=" + ke.getExtendedKeyCode()
		+ ", char=" + ke.getKeyChar() + ", text=" + KeyEvent.getKeyText(ke.getKeyCode()));
		System.out.println("\tke=" + ke);
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		System.out.println("Key typed code=" + ke.getKeyCode() + ", extended code=" + ke.getExtendedKeyCode()
				+ ", char=" + ke.getKeyChar() + ", text=" + KeyEvent.getKeyText(ke.getKeyCode()));
		System.out.println("\tke=" + ke);
	}

//    @Override
//    public void keyTyped(KeyEvent ke) {
//    }
//    @Override
//    public void keyReleased(KeyEvent ke) {
//    }
//    @Override
//    public void keyPressed(KeyEvent ke) {
//        //System.out.println("Key pressed code=" + ke.getKeyCode() + ", extended code=" + ke.getExtendedKeyCode() + 
//        //		", char=" + ke.getKeyChar() + ", text=" + KeyEvent.getKeyText(ke.getKeyCode()));
//        //System.out.println("\tke=" + ke);
//        String buttonTitle = KeyEvent.getKeyText(ke.getKeyCode());
//        System.out.println(">> KeyListener.keyPressed(" + buttonTitle + ")");
//        switch(buttonTitle) {
//        case "Page Up" :	// case page up -> MC
//			buttonTitle = "MC";
//			break;
//		case "Page Down" :	// case page down -> MR
//			buttonTitle = "MS";
//			break;
//		case "Left" :		// case left -> -
//			buttonTitle = "-";
//			break;
//		case "Up" :			// case up -> x
//			buttonTitle = "x";
//			break;
//		case "Right" :		// case right -> +
//			buttonTitle = "+";
//			break;
//		case "Down" :		// case down -> /
//			buttonTitle = "/";
//			break;
//        default:
//        	break;
//        }
//        System.out.println(">> buttonTitle replace by : " + buttonTitle + "");
//		processKeytoButtonBinding(buttonTitle);
//    }
}
