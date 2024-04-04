package am;

import java.awt.Image;
import java.awt.Toolkit;

public class Images_Ex2 {
	int x, y;
	Image img;

	
	public Images_Ex2(int x, int y) {
		this.x = x;
		this.y = y;
		

		// 1) ToolKit 생성
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		StringBuffer filename = new StringBuffer("src/images/");
		filename.append((int)(Math.random()*45+1));
		filename.append(".gif");
		
		// 2) 준비된 TollKit을 통해 Image객체 준비
		img = tool.getImage(filename.toString());
		
		
	}

}
