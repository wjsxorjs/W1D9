package am;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Frame_Ex3 extends JFrame implements KeyListener {
	
	public Frame_Ex3() {
		
		this.setBounds(300, 100, 500, 500);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addKeyListener(this);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame_Ex3();
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// 키보드의 키를 누를 때마다 수행하는 곳
		
		int code = e.getKeyCode();
//		char ch = e.getKeyChar();
		String str = e.getKeyText(code);
		
		this.setTitle(code+": "+ch+str);
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
