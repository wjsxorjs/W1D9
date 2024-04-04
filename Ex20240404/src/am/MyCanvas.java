package am;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;

public class MyCanvas extends Canvas {
	
	// 사각형 객체들이 저장되는 곳
	ArrayList<MyRect> list = new ArrayList<MyRect>();
	
	
	@Override
	public void paint(Graphics g) {
		
		for(int i=0;i<list.size();i++) {
			MyRect mr = list.get(i);
			
			g.setColor(mr.color);
			g.fillRect(mr.x-(mr.w/2), mr.y-(mr.h/2), mr.w, mr.h);
		}
		
	}
	

}
