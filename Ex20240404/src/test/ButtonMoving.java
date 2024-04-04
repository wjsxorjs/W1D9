package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonMoving extends JFrame {
	
	JButton btnL, btnC, btnR;
	JPanel panel;
	int align = 1;
	

	public void buttonAdding() {
		panel.add(btnL);
		panel.add(btnC);
		panel.add(btnR);
	}
	
	public void panelAdding() {
		
		panel = new JPanel(new FlowLayout(align));
		panel.setBackground(Color.LIGHT_GRAY);
		this.buttonAdding();
		this.add(panel,BorderLayout.NORTH);
	}
	
	public ButtonMoving() {
		
		btnL = new JButton("L");
		btnC = new JButton("C");
		btnR = new JButton("R");
		
		this.panelAdding();
		
		this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
		
		
		
		btnL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				align = FlowLayout.LEFT;
				panelAdding();
				revalidate();
			}
		});
		
		btnC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				align = FlowLayout.CENTER;
				panelAdding();
				revalidate();
				
			}
		});
		
		btnR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				align = FlowLayout.RIGHT;
				panelAdding();
				revalidate();
				
			}
		});
			
		
		
	}
	
	
	public static void main(String[] args) {
		/*
		  BorderLayout.NORTH에 버튼 3개
		  L : flowlayout.left
		  C : flowlayout.center
		  R : flowlayout.right
		 */
		
		new ButtonMoving();
		
	}



}
