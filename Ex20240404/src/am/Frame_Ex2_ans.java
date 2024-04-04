package am;

import javax.swing.JFrame;

public class Frame_Ex2_ans extends JFrame {
	
	Canvas_Ex2_ans can;
	
	public Frame_Ex2_ans() {
		
		// 캔버스 생성
		can = new Canvas_Ex2_ans();
		
		// 생성한 캔버스를 현재 창 가운데에 추가
		this.add(can);
				
		
		this.setBounds(200, 100, 600, 550);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 사용자가 캔버스 위에서 클릭할 때마다 이미지객체를 생성한다.
		// 이를 위해, 캔버스에 마우스 이벤트 감지자를 등록해야한다.
		can.addMouseListener(new Mouse_Ex2_ans(this));
		
		
	}
	
	
	
	public static void main(String[] args) {
		// 프로그램 시작
		new Frame_Ex2_ans();
	}

}
