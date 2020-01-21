package maCalculette;

import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.KeyStroke;

class JKeyButton extends JButton {

	public JKeyButton() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JKeyButton(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean processKeyBinding(KeyStroke ks, KeyEvent ke, int i, boolean bln) {
		boolean b = super.processKeyBinding(ks, ke, i, bln);
		// if (b && ks.getKeyCode() == KeyEvent.VK_A)
		if (b)
			requestFocusInWindow();
		return b;
	};
}
