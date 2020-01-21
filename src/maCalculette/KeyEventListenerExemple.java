/**
 * 
 */
package maCalculette;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.im.InputContext;

import javax.swing.JFrame;

/**
 * @author philou
 *
 */
class myFrame extends JFrame implements ActionListener, KeyListener {

	myFrame() {
		// keyboard listening
		System.out.println(">>myFrame()");
		//JFrame f = new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(200, 200);
		this.setLocationRelativeTo(null);
		this.addKeyListener(this);
	}

	void run() {
		System.out.println(">>myFrame.run()");
		 while (true) {
			 wait (1000);
		 }
	}

	void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

	@Override
	public void keyPressed(KeyEvent ke) {
		// TODO Auto-generated method stub
		System.out.println(">>Key pressed code=" + ke.getKeyCode() + ", extended code=" + ke.getExtendedKeyCode()
				+ ", char=" + ke.getKeyChar() + ", text=" + KeyEvent.getKeyText(ke.getKeyCode()));
		//System.out.println("\tke=" + ke);
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		// TODO Auto-generated method stub
		System.out.println("<<Key released code=" + ke.getKeyCode() + ", extended code=" + ke.getExtendedKeyCode()
				+ ", char=" + ke.getKeyChar() + ", text=" + KeyEvent.getKeyText(ke.getKeyCode()));
		//System.out.println("\tke=" + ke);
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		System.out.println("==Key typed code=" + ke.getKeyCode() + ", extended code=" + ke.getExtendedKeyCode()
				+ ", char=" + ke.getKeyChar() + ", text=" + KeyEvent.getKeyText(ke.getKeyCode()));
		//System.out.println("\tke=" + ke);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String buttonTitle = ae.getActionCommand();
		System.out.println(">> buttonTitle= " + buttonTitle);
	}
}
	
public class KeyEventListenerExemple {
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println();
		// get keyboard layout : en_US for instance
		InputContext context = InputContext.getInstance();
		System.out.println(context.getLocale().toString());

		myFrame frame = new myFrame();
		frame.run();
	}


}


