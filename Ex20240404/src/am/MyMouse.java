package am;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouse extends MouseAdapter {
	
	MyFrame mf;	// MyFrame의 멤버 중 can을 통해
				// can 안에 있는 list를 접근하기 위해 필요함.
				// 이런 ff와 같은 멤버변수는 보통 생성자에서 인자로 받아서 저장한다.
	
	public MyMouse() {}
	
	public MyMouse(MyFrame mf) {
		this.mf = mf;
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		int x = e.getX();
		int y = e.getY();
		
		MyRect mr = new MyRect(x,y);
		
		// mf. = MyFrame 안의
		// can. = MyCanvas 안의
		// list. = ArrayList<MyRect>에
		// add() = 추가해준다.
		// mr = 생성한 MyRect 객체를
		mf.can.list.add(mr);
		
		mf.can.repaint();
		
	}

}
