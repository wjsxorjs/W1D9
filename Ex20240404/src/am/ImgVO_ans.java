package am;

public class ImgVO_ans {
	
	int x, y, wh;
	
	String img_path; // 이미지 경로
	
	public ImgVO_ans(int x, int y) {
		// 사용자가 클릭한 x, y 좌표는 인자로 받아야한다.
		
		wh = (int)(Math.random()*150+50);
		
		this.x = x - (wh/2);
		this.y = y - (wh/2);
		
		int num = (int)(Math.random()*45+1);
		
		img_path = "src/images/"+num+".gif";
		
	}
	
}
