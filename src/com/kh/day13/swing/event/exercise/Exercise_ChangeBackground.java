package com.kh.day13.swing.event.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ChangeBackground extends JFrame{
	// <F1> 키를 입력받으면 컨텐트팬의 배경을 초록색으로,
	// % 키를 입력받으면 노란색으로 변경
	public Exercise_ChangeBackground() {
		setTitle("Key Code 예제, F1키 : 초록색, %키 : 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		JLabel la = new JLabel();
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				la.setText(e.getKeyText(keyCode) + "키가 입력되었음");
				if(keyCode == KeyEvent.VK_F1) {
					c.setBackground(Color.green);
				} else if(keyChar == '%') {
					c.setBackground(Color.yellow);
				} else {
					c.setBackground(Color.lightGray);
				}
			}
		});
		la.setSize(150, 20);
		la.setLocation(0, 50);
		c.add(la);
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Exercise_ChangeBackground();
	}
}
