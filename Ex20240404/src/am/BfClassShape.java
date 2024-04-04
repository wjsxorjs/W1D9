package am;

import java.awt.Color;

public class BfClassShape {
	
	int x, y, w, h, type;
	
	Color c;

	public BfClassShape() {}
	
	
	public BfClassShape(int x, int y) {
		this.x = x;
		this.y = y;
		
		this.w = (int)(Math.random()*150+50);
		this.h = (int)(Math.random()*150+50);
		
		this.type = (int)(Math.random()*2);
		
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		this.c = new Color(r, g, b);
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public int getW() {
		return w;
	}


	public int getH() {
		return h;
	}


	public int getType() {
		return type;
	}


	public Color getC() {
		return c;
	}
	

	
	
	
	

}
