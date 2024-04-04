package amBfClass;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public class BfClassCanvas extends Canvas {

	ArrayList<BfClassShape> bcsList;
	
	public BfClassCanvas() {
		this.bcsList = new ArrayList<BfClassShape>();
	}
	
	@Override
	public void paint(Graphics g) {
		
		
		Iterator<BfClassShape> bcsIt = this.bcsList.iterator();
		
		
		while(bcsIt.hasNext()) {
			BfClassShape nxtShp = bcsIt.next();
			Color c = nxtShp.getC();
			int x = nxtShp.getX();
			int y = nxtShp.getY();
			int w = nxtShp.getW();
			int h = nxtShp.getH();
			if(nxtShp.getType() == 0) {
				g.setColor(c);
				g.fillOval(x-(w/2), y-(h/2), w, h);
			} else {
				g.setColor(c);
				g.fillRect(x-(w/2), y-(h/2), w, h);
			}
		}
		
	}
	
	

}
