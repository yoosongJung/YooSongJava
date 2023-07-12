package com.kh.day13.swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_KeyListener extends JFrame {

	public Exam_KeyListener() {
		setTitle("KeyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel [] laArrs = new JLabel[3];
		laArrs[0] = new JLabel("getKeyCode()");
		laArrs[1] = new JLabel("getKeyChar()");
		laArrs[2] = new JLabel("getKeyText()");
//		JLabel la1 = new JLabel("getKeyCode()");
//		JLabel la2 = new JLabel("getKeyChar()");
//		JLabel la3 = new JLabel("getKeyText()");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				int keyCode = e.getKeyCode();
				laArrs[0].setText(Integer.toString(keyCode));
				laArrs[1].setText(Character.toString(keyChar));
				laArrs[2].setText(e.getKeyText(keyCode));
			}
		});
		for(JLabel la : laArrs) {
			la.setOpaque(true);
			la.setBackground(Color.yellow);
			c.add(la);
		}
//		la1.setOpaque(true); // 바탕색이 보이게 하기 위해서 컴포넌트를 불투명하게 함.
//		la2.setOpaque(true);
//		la3.setOpaque(true);
//		la1.setBackground(Color.yellow);
//		la2.setBackground(Color.yellow);
//		la3.setBackground(Color.yellow);
//		
//		c.add(la1);
//		c.add(la2);
//		c.add(la3);
		
		setSize(300, 150);
		setVisible(true);
		// 스윙 프레임이 만들어질때 포커스를 주고자 하는 경우 setVisible 이후에
		// 포커스를 주어야 함.
		// 키 입력을 받을 수 있도록 포커스를 주는 것임.
		c.setFocusable(true); // component가 포커스를 받을 수 있도록 설정
		c.requestFocus(); 	  // component에 포커스 강제 지정
	}
	
	public static void main(String[] args) {
		new Exam_KeyListener();
	}

}
