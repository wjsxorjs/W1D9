package amBfClass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BfClassEventListener implements MouseListener, WindowListener {

	BfClassMain classMain;
	
	public BfClassEventListener(BfClassMain cm) {
		// 생성자에서 Canvas를 가리키는 객체의 주소값을 가진
		// 멤버 변수를 가진 객체인 BfClassMain의 주소값을 받고
		// 해당 멤버 변수에 저장해주어서 사용한다.
		classMain = cm;
	}
	
	
	// 사용 함수
	
	@Override
	public void mousePressed(MouseEvent e) {
				
		int x = e.getX();
		int y = e.getY();
		
		BfClassShape shp = new BfClassShape(x,y);
		classMain.can.bcsList.add(shp);
		
		classMain.can.repaint();
		
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
	
	
	// 미사용 함수
	
	// MouseListener
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	// WindowListener

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
