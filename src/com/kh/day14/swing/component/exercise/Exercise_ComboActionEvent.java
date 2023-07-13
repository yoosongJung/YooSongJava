package com.kh.day14.swing.component.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ComboActionEvent extends JFrame {
	
	private String [] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon [] images = {
		new ImageIcon("images/apple.jpg"),	
		new ImageIcon("images/banana.jpg"),	
		new ImageIcon("images/kiwi.jpg"),	
		new ImageIcon("images/mango.jpg")	
	};
	private JLabel imgLabel;
	private JComboBox<String> strCombo;
	
	public Exercise_ComboActionEvent() {
		setTitle("JCombokBox 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		imgLabel = new JLabel(images[0]); // 첫 이미지 셋팅
		strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		c.add(imgLabel);
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> strCb = (JComboBox<String>)e.getSource();
				int index = strCb.getSelectedIndex(); // 선택된 인덱스 값 가져옴.
				imgLabel.setIcon(images[index]);
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_ComboActionEvent();
	}
}
