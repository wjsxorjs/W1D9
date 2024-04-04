package pm;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Canvas_Ex1 extends Canvas {
	
	int code; // 1(code: 49) ~ 5(code: 53)
	int x=10, y=10;
	
	
	@Override
	public void paint(Graphics g) {
		// code라는 변수의 값이 KeyEvent.VK_1 ~ 5값들과 비교하여
		// 해당하는 도형을 그린다.
		
		switch(code) {
		case KeyEvent.VK_1:
			g.drawOval(x, y, 100, 100);
			break;
		case KeyEvent.VK_2:
			g.fillOval(x, y, 100, 100);
			break;
		case KeyEvent.VK_3:
			g.drawRect(x, y, 100, 100);
			break;
		case KeyEvent.VK_4:
			g.fillRect(x, y, 100, 100);
			break;
		case KeyEvent.VK_5:
			g.drawString("쌍용교육센터", x, y);
			break;
		}
		
		
		
	}
	
	
}
