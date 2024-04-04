package pm;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import am.MyWin;

public class BfClass extends JFrame implements KeyListener {

	public BfClass() {
		
		
		this.setBounds(150, 300, 500, 500);
		this.setVisible(true);
		
		this.addWindowListener(new MyWin());
		
		this.addKeyListener(this);
	}
	
	
	public static void main(String[] args) {
		new BfClass();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();
		String text = e.getKeyText(code);
		this.setTitle(String.valueOf(code)+": "+text);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
