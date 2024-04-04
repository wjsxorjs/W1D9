package am;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Canvas_Ex2 extends Canvas {
	
	ArrayList<Images_Ex2> imgList;
	
	public Canvas_Ex2() {
		
		imgList = new ArrayList<Images_Ex2>();
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		for(int i=0; i<imgList.size();i++) {
			Images_Ex2 currImg = imgList.get(i);
			int w = currImg.img.getWidth(this);
			int h = currImg.img.getHeight(this);
			
			g.drawImage(currImg.img, currImg.x-(w/2), currImg.y-(h/2), this); // 이미지 그리기 (이미지, x좌표, y좌표, Observer)
		}
		
		
	}

}
