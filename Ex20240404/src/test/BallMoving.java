package test;

import java.awt.Canvas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class BallMoving extends JFrame {
	
	Canvas can;
	
	int x, y;
	
	
	public BallMoving() {
		
		

		
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				e.getKeyCode();
			}
		});
		
	}
	
	

	public static void main(String[] args) {
		
		new BallMoving();

	}

}
