package amBfClass;

import javax.swing.JFrame;

public class BfClassMain extends JFrame {
	
	BfClassEventListener cel;
	BfClassCanvas can;
	
	public BfClassMain() {
		
		can = new BfClassCanvas();
		
		this.add(can);
		
		this.setTitle("Before Class Canvas");
		this.setBounds(150, 300, 500, 400);
		this.setVisible(true);
		
		
		cel = new BfClassEventListener(this); 	// 해당 객체의 주소를 건네주어서
												// BfClassEventListener에서 멤버변수 can을 사용할 수 있도록 한다.
		this.addWindowListener(cel);
		can.addMouseListener(cel);
		
	}

	public static void main(String[] args) {
		
		new BfClassMain();

	}

}
