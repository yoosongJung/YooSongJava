package com.kh.day13.swing.event.exercise;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_MovingText extends JFrame{
	private final int MOVING_UNIT = 10;
	// 상, 하, 좌, 우 키로 텍스트 움직이기
	public Exercise_MovingText() {
		setTitle("상, 하, 좌, 우 키로 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel la = new JLabel("Hello");
		la.setSize(50,50);
		la.setLocation(50, 50);
		c.add(la);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP :
					la.setLocation(la.getX(), la.getY()-MOVING_UNIT);
					break;
				case KeyEvent.VK_DOWN :
					la.setLocation(la.getX(), la.getY()+MOVING_UNIT);
					break;
				case KeyEvent.VK_LEFT : 
					la.setLocation(la.getX()-MOVING_UNIT, la.getY());
					break;
				case KeyEvent.VK_RIGHT : 
					la.setLocation(la.getX()+MOVING_UNIT, la.getY());
					break;
				}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Exercise_MovingText();
	}
}
