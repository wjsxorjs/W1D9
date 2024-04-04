package am;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse_Ex2_ans extends MouseAdapter {
	
	Frame_Ex2_ans frame;
	
	public Mouse_Ex2_ans(Frame_Ex2_ans f) {
		
		this.frame = f;
		
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		// 마우스를 클릭할 때마다 호출하는 곳
		int x = e.getX();
		int y = e.getY();
		
		// 클릭한 지점을 알아냈으므로 이미지 객체를 생성한다.
		ImgVO_ans vo = new ImgVO_ans(x, y);
		
		// vo를 Frame_Ex2_ans가 가지는 Canvas_Ex2_ans안에 list에 저장해야 한다.
		frame.can.list.add(vo);
		
		frame.can.repaint();
		
	}

}
