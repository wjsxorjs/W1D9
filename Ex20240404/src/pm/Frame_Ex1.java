package pm;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import am.MyWin;

public class Frame_Ex1 extends JFrame implements KeyListener{
	
	Canvas_Ex1 can;
	
	
	public Frame_Ex1() {
		can = new Canvas_Ex1();
		
		this.setBounds(100, 100, 400, 400);
		this.setVisible(true);
		
		// 현재 창의 가운데에 생성된 캔버스를 추가한다.
		this.add(can);
		
		this.addWindowListener(new MyWin());
		
		this.addKeyListener(this);	// 키 이벤트 감지자(여기서는 this[뒤에 괄호 안에 있는 this])로 가서
									// KeyEvent에 해당하는 동작을 찾고 수행한다.

		
		
	}
	
	

	public static void main(String[] args) {
		new Frame_Ex1();

	}



	// 특정 행위가 이루어졌을때 자동으로 불러지는 함수 < Callback 함수
	@Override
	public void keyPressed(KeyEvent e) {
		
		// 1) 눌려진 키의 코드값 가져오기
		int keyCode = e.getKeyCode();
//		int modCode = (keyCode%49)%5 + 49;
		String[] action = {"drawOval", "fillOval", "drawRect", "fillRect", "drawString"};
		StringBuffer codeNaction = new StringBuffer();
		codeNaction.append(keyCode);
//		codeNaction.append(modCode);
		codeNaction.append(": ");
		codeNaction.append(action[(keyCode%49)%5]);
//		codeNaction.append(action[modCode-49]);
		this.setTitle(codeNaction.toString());
		// 2) Canvas 클래스 내의 code에 해당 코드값 저장
		can.code = keyCode;
//		can.code = modCode;
		// 3) Canvas 그림 다시 그리기[Canvas.repaint()]
		can.repaint();
		
	
	}

	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
