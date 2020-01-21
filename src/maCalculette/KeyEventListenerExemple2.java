/**
 * 
 */
package maCalculette;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.im.InputContext;

import javax.swing.JFrame;

/**
 * @author philou
 *
 */
public class KeyEventListenerExemple2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println();
		// get keyboard layout : en_US for instance
		InputContext context = InputContext.getInstance();  
		System.out.println(context.getLocale().toString());
		
		
		// keyboard listening
		JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(100, 100);
        f.setLocationRelativeTo(null);
		f.addKeyListener(new KeyListener() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	        }

	        @Override
	        public void keyPressed(KeyEvent e) {
	            System.out.println("Key pressed code=" + e.getKeyCode() + ", extended code=" + e.getExtendedKeyCode() + 
	            		", char=" + e.getKeyChar() + ", text=" + KeyEvent.getKeyText(e.getKeyCode()));
	            System.out.println("\te=" + e);
	        }

	        @Override
	        public void keyReleased(KeyEvent e) {
	        }
	    });

	}

}
