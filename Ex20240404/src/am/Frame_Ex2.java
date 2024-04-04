package am;

import javax.swing.JFrame;

public class Frame_Ex2 extends JFrame {
	
	Canvas_Ex2 can;
	
	public Frame_Ex2() {
		
		can = new Canvas_Ex2();
		
		this.add(can);
		
		
		this.setTitle("Canvas_Ex2");
		this.setBounds(300, 100, 600, 500);
		this.setVisible(true);
		
		this.addWindowListener(new MyWin());
		can.addMouseListener(new Mouse_Ex2(this));
		
		
	}
	
	

	public static void main(String[] args) {
		new Frame_Ex2();

	}

}
