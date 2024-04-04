package am;

import java.awt.Color;

public class MyRect {
	Color color;
	
	int x, y, w, h;
	
	public MyRect() {}
	
	public MyRect(int x, int y) {
		// 지역변수 이름과 멤버변수 이름이 같을 때는 
		// 멤버변수 앞에 this를 붙여 사용해야한다.
		// this.x : 현재 객체 내의 x(멤버변수)
		this.x = x;
		this.y = y;
		
		w = (int)(Math.random()*150+50);
		h = (int)(Math.random()*150+50);
		
		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		
		color = new Color(r, g, b);
		
		
		
	}
	
	
	
	
	

}
