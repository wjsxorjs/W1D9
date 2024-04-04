package am;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse_Ex2 extends MouseAdapter {
	Frame_Ex2 fe;
	
	public Mouse_Ex2(Frame_Ex2 fe) {
		this.fe = fe;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		Images_Ex2 img = new Images_Ex2(e.getX(),e.getY());
		
		fe.can.imgList.add(img);
		
		fe.can.repaint();
		
	}

}
