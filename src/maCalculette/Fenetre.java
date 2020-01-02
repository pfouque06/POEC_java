package maCalculette;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import observer.Observer;

public class Fenetre extends JFrame implements ActionListener {

	private JPanel container = new JPanel();
	private JPanel labelPan = new JPanel();
	private JLabel label = new JLabel("0");
	private JPanel keyboardPan = new JPanel();
	//private String[] kNames = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "C"};
	private String[] kNames = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "<"};
	private JButton[] kButtons = new JButton[12];
	private JPanel ActionPan = new JPanel();
	//private String[] aNames = { "/", "%", "x", "MS", "-", "MC", "+", "="};
	private String[] aNames = { "/", "C", "x", "MC", "-", "MS", "+", "="};
	private JButton[] aButtons = new JButton[8];
	int indexMS = 0;

	private Calculette calculette;

	public Fenetre() {
		// TODO Auto-generated constructor stub

		// On initialise la JFrame
		this.setTitle("Calculette");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		//this.setSize(290, 210); // Home setting
		this.setSize(310, 220);
		this.setAlwaysOnTop(true);

		// init Digit Keyboard Buttons
		keyboardPan.setPreferredSize(new Dimension(165, 225));
		Dimension dim = new Dimension(50, 30);
		Font kFont = new Font("DS-digital", Font.TYPE1_FONT, 15);
		//Font kFont = new Font("Goudy Bookletter 1911", Font.TYPE1_FONT, 15);
		// Goudy Bookletter 1911
		for (int indexCell = 0; indexCell < kNames.length ; indexCell++) {
			kButtons[indexCell] = new JButton(kNames[indexCell]);
			kButtons[indexCell].setPreferredSize(dim);
			kButtons[indexCell].setFont(kFont);
			kButtons[indexCell].addActionListener(this); // l'observer est notre fenetre
			keyboardPan.add(kButtons[indexCell]);
		}
		
		ActionPan.setPreferredSize(new Dimension(125, 225));
		Dimension aDim = new Dimension(55, 30);
		//Font aFont = new Font("Dialog", Font.BOLD, 12); //PLAIN , ITALIC, 
		for (int indexCell = 0; indexCell < aNames.length ; indexCell++) {
			if (aNames[indexCell].equals("MS"))
				indexMS = indexCell;
			aButtons[indexCell] = new JButton(aNames[indexCell]);
			aButtons[indexCell].setPreferredSize(aDim);
			//aButtons[indexCell].setFont(kFont);
			aButtons[indexCell].addActionListener(this); // l'observer est notre fenetre
			ActionPan.add(aButtons[indexCell]);
		}
		
		////Dimension dim = new Dimension(55, 40);
		//Box[] kHBox = new Box[4];
		//Box kBox = Box.createVerticalBox();
		//for (int indexCell = 0, indexBox = -1; indexCell < kNames.length ; indexCell++) {
		//	kButtons[indexCell] = new JButton(kNames[indexCell]);
		//	//kButtons[indexCell].setPreferredSize(dim);
		//	kButtons[indexCell].addActionListener(this); // l'observer est notre fenetre
		//	if ( (indexCell % 3) == 0)
		//		kHBox[++indexBox] = Box.createHorizontalBox();
		//	kHBox[indexBox].add(kButtons[indexCell]);
		//}
		//kBox.add(kHBox[0]);
		//kBox.add(kHBox[1]);
		//kBox.add(kHBox[2]);
		//kBox.add(kHBox[3]);
		//keyboardPan.add(kBox);

		//Dimension dim2 = new Dimension(50, 40);
		//Box[] aHBox = new Box[4];
		//Box aBox = Box.createVerticalBox();
		//for (int indexCell = 0, indexBox = -1; indexCell < aNames.length ; indexCell++) {
		//	aButtons[indexCell] = new JButton(aNames[indexCell]);
		//	//aButtons[indexCell].setPreferredSize(dim2);
		//	aButtons[indexCell].addActionListener(this); // l'observer est notre fenetre
		//	if ( (indexCell % 2) == 0)
		//		aHBox[++indexBox] = Box.createHorizontalBox();
		//	aHBox[indexBox].add(aButtons[indexCell]);
		//}
		//aBox.add(aHBox[0]);
		//aBox.add(aHBox[1]);
		//aBox.add(aHBox[2]);
		//aBox.add(aHBox[3]);
		//ActionPan.add(aBox);

		//debug syso
		//System.out.println("kButtons[0].getSize() = " + kButtons[0].getSize());
		System.out.println("aButtons[0].getSize() = " + aButtons[0].getFont() );
		System.out.println("aButtons[10.getSize() = " + aButtons[0].getSize());
		
		// On initialise le JLabel
		//Font police = new Font("DS-digital", Font.TYPE1_FONT, 20);
		//Font police = new Font("Segment14", Font.PLAIN, 25);
		//Font police = new Font("ledfont-sharp", Font.BOLD , 20);
		Font police = null;
		File fileFont;
		try {
			fileFont = new File("font/ledfont-sharp-Regular.otf");
			System.out.println(fileFont.getAbsolutePath());
			police = Font.createFont(Font.TRUETYPE_FONT, fileFont);
			//police = police.deriveFont((float)20);
			police = police.deriveFont(Font.BOLD, (float)20);
		} catch(Exception ex) {
		    System.err.println(ex.getMessage());
		};

		label.setFont(police);
		label.setBorder(new LineBorder(Color.black, 1));
		label.setHorizontalAlignment(JLabel.RIGHT);
		//label.setBackground(Color.white);
		labelPan.setLayout(new BorderLayout());
		labelPan.setBorder(new EmptyBorder(2, 2, 2, 2));
		labelPan.setBackground(Color.white);
		labelPan.add(label);

		// On initialise le container panel de la JFrame
		container.setLayout(new BorderLayout());
		//container.setBorder(new EmptyBorder(2, 2, 2, 2));
		container.add(labelPan, BorderLayout.NORTH);
		container.add(keyboardPan, BorderLayout.WEST);
		container.add(ActionPan, BorderLayout.EAST);
		this.setContentPane(container);
		this.setVisible(true);
		this.setAlwaysOnTop(true);

		// On initialise la calculette
		this.calculette = new Calculette();
		// On place un écouteur sur la calculettte
		this.calculette.addObserver(new Observer() {
			
			public void update(String pString) {
				// System.out.println("-> Observer is informed by Observed to run an update !");
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
		System.out.println(">> actionPerformed");
		//JButton buttonHit= (JButton) arg0.getSource();
		//String buttonTitle = buttonHit.getName();
		String buttonTitle = arg0.getActionCommand();
		System.out.println(">> buttonTitle= " + buttonTitle);
		calculette.processAction(buttonTitle);
	}

}
