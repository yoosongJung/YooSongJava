package com.kh.day14.swing.component.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_CheckBoxItemEvent extends JFrame {
	
	private JCheckBox [] fruits; // 체크박스 객체 배열
	private String [] names = {"사과", "배", "체리"}; // 체크박스 이름 배열
	private JLabel sumLabel; // 합계 레이블
	private int sum;
	
	public Exercise_CheckBoxItemEvent() {
		setTitle("CheckBoxItemEvent 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		sum = 0;
		sumLabel = new JLabel("사과 100원, 배 500원, 체리 2000원"); // 처음 텍스트
		fruits = new JCheckBox[3];
//		fruits[0] = new JCheckBox("사과");
//		fruits[1] = new JCheckBox("배");
//		fruits[2] = new JCheckBox("체리");
//		JCheckBox apple = new JCheckBox("사과");
//		JCheckBox pear = new JCheckBox("배");
//		JCheckBox cherry = new JCheckBox("체리");
		c.add(sumLabel);
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]); // 배열에 체크박스 생성
			fruits[i].setBorderPainted(true); // 테두리 나오게 함
			c.add(fruits[i]);
			fruits[i].addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getItem().equals(fruits[0])) {
						sum += 100;
					} else if(e.getItem().equals(fruits[1])) {
						sum += 500;
					} else if(e.getItem().equals(fruits[2])) {
						sum += 2000;
					}
				}
				else {
					if(e.getItem().equals(fruits[0])) {
						sum -= 100;
					} else if(e.getItem().equals(fruits[1])) {
						sum -= 500;
					} else if(e.getItem().equals(fruits[2])) {
						sum -= 2000;
					}
				}
				sumLabel.setText("현재 " + sum + "원 입니다");
			}
		});
		}
//		c.add(apple);
//		c.add(pear);
//		c.add(cherry);
//		apple.addItemListener(new ItemListener() {
//			
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) sum += 100;
//				else sum -= 100;
//				sumLabel.setText("현재 " + sum + "원 입니다");
//			}
//		});
//		pear.addItemListener(new ItemListener() {
//			
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) sum += 500;
//				else sum -= 500;
//				sumLabel.setText("현재 " + sum + "원 입니다");
//			}
//		});
//		cherry.addItemListener(new ItemListener() {
//			
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) sum += 2000;
//				else sum -= 2000;
//				sumLabel.setText("현재 " + sum + "원 입니다");
//			}
//		});	
		sumLabel = new JLabel("현재 0원 입니다");
		c.add(sumLabel);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_CheckBoxItemEvent();
	}
}
