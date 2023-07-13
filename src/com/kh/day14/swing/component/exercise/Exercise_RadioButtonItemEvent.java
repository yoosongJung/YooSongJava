package com.kh.day14.swing.component.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Exercise_RadioButtonItemEvent extends JFrame {
	
	private JRadioButton [] fruits; // 라디오버튼 객체 배열
	private String [] names = {"사과", "배", "체리"}; // 라디오버튼 이름 배열
	private ImageIcon [] images = { // 이미지라벨에 들어갈 이미지아이콘 배열
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")
	};
	private JLabel imageLabel; // 이미지 라벨 선언
	public Exercise_RadioButtonItemEvent() {
		setTitle("RadioButtonItemEvent 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel radioPanel = new JPanel(); // 라이도 버튼을 추가할 팬을 만듬
		radioPanel.setBackground(Color.LIGHT_GRAY); // 새로만든 팬의 배경색 바꿈
		fruits = new JRadioButton[3]; // 라디오 버튼 객체 배열 생성
		imageLabel = new JLabel(); // 라벨 객체 생성
		ButtonGroup btnG = new ButtonGroup();
		
		for(int i = 0; i < fruits.length; i++) { 
			fruits[i] = new JRadioButton(names[i]); // 반복문으로 라디오 버튼 객체 생성해서 배열에 넣고
			btnG.add(fruits[i]);	  				// 라디오 버튼 중 1개만 선택되도록 그룹화
			radioPanel.add(fruits[i]);   			// 새로 만든 라디오 팬에 추가함
			fruits[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
//					if(e.getStateChange() == ItemEvent.DESELECTED) {
//						return;
//					}
					if(fruits[0].isSelected()) {
						imageLabel.setIcon(images[0]);
					} else if(fruits[1].isSelected()) {
						imageLabel.setIcon(images[1]);
					} else if(fruits[2].isSelected()) {
						imageLabel.setIcon(images[2]);
					}
				}
			});
		}

		c.add(radioPanel, BorderLayout.NORTH); // 라디오팬을 컨텐트팬에 추가함
		c.add(imageLabel, BorderLayout.CENTER); // 이미지 라벨은 센터에 위치
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER); // 이미지 라벨안에 이미지 센터에 위치
		
		
		setSize(250, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_RadioButtonItemEvent();
	}
}
