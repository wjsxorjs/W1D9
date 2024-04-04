package am;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyCanvas can;
	
	public MyFrame() {
		
		can = new MyCanvas();
		
		this.setTitle("MyCanvas");
		this.setBounds(150, 300, 500, 400);
		this.setVisible(true);
		
		this.add(can);
		
		MyWin mw = new MyWin();
		MyMouse mm = new MyMouse(this);
		
		this.addWindowListener(mw);
		
		// 이벤트 감지자 등록
		//  마우스 버튼을 누를 때의 이벤트를 감지하기 위한 감지자를 MyCanvas에게 등록한다.
		//  여기서 이벤트 감지자는 MyMouse가 된다. 그리고 MyMouse를 생성할 때
		//  반드시 MyFrame의 주소를 인자로 줘야한다.
		//  MyFrame(현재 객체)의 주소는 this로 나타낼 수 있다.
		can.addMouseListener(mm);
		
		
	}

	public static void main(String[] args) {
		
		new MyFrame();

	}

}
