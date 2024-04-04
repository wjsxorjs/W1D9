package am;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Canvas_Ex2_ans extends Canvas {
	
	// 이미지 객체들을 저장하는 저장소
	ArrayList<ImgVO_ans> list;
	
	Toolkit tk; // 이미지를 생성하기 위해 필요함
	
	public Canvas_Ex2_ans() {
		list = new ArrayList<ImgVO_ans>();
		tk = Toolkit.getDefaultToolkit();
	}
	
	@Override
	public void paint(Graphics g) {
		for(int i=0; i<list.size();i++) {
			// Toolkit으로 이미지 생성
			ImgVO_ans vo = list.get(i);
			Image img = tk.getImage(vo.img_path);
			g.drawImage(img, vo.x, vo.y, vo.wh, vo.wh, this);
		}
	}

}
