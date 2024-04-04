package pm;

import java.awt.Color;

public class Oval_Ex3 {

	Color c;
	
	int x, y, w, h;
	
	public Oval_Ex3(int x, int y) {
		// 위치(x좌표, y좌표)
		this.x = x;
		this.y = y;
		
		// w: 너비 | h: 높이
		w = (int)(Math.random()*150+50);
		h = (int)(Math.random()*150+50);
		
		
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		c = new Color(r, g, b);
	}
	
	
}
