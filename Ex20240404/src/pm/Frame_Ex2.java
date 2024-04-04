package pm;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Frame_Ex2 extends JFrame {
	
	int x = 10;
	
	Canvas can;
	
	/*
	Canvas can = new Canvas() {
		
		@Override
		public void paint(Graphics g) {
//			System.out.println(x);
			g.setColor(Color.BLUE);
			g.fillOval(10, 10, 100, 100);
		}
		
	};
	*/
	public Frame_Ex2() {
		
		
//		this.add(can);
		this.add(can = new Canvas() {
			@Override
			public void paint(Graphics g) {
			g.setColor(Color.BLUE);
			g.fillOval(10, 10, 100, 100);
			}
		});
		
		this.setBounds(300, 100, 400, 400);
		this.setVisible(true);
		
		
		// 이벤트감지자 등록
		// 윈도우 이벤트
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		this.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			
		});
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// Start of the Program
		new Frame_Ex2();

	}

}
