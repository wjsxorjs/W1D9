package pm;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Frame_Ex3 extends JFrame{
	
	ArrayList<Oval_Ex3> list = new ArrayList<Oval_Ex3>();
	
	Canvas can = new Canvas() {
		@Override
		public void paint(Graphics g) {
			// 클릭할 때마다 타원 객체가 list에 저장되므로
			// list의 크기만큼 반복하여 그림을 그리면 된다.
			for(int i=0; i<list.size();i++) {
				Oval_Ex3 oe = list.get(i);
				// 붓 객체에 oe가 가지는 색상으로 변경
				g.setColor(oe.c);
				g.fillOval(oe.x-(oe.w/2), oe.y-(oe.h/2), oe.w, oe.h);
			}
		}
	};
	
	
	
	
	public Frame_Ex3() {
		
		this.add(can);
		
		this.setBounds(200, 100, 500, 500);
		this.setVisible(true);
		
		// 종료 이벤트
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 마우스 이벤트 : Canvas에서 클릭했을 때 Oval_Ex3
		can.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				Oval_Ex3 oe = new Oval_Ex3(x,y);
				
				list.add(oe);
				
				can.repaint(); // 캔버스 다시 그리기
				
			}
			
		});
		
	}
	
	
	

	public static void main(String[] args) {
		new Frame_Ex3();

	}

}
