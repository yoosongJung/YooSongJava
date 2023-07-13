package com.kh.day14.swing.component.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Exercise_ListChange extends JFrame {
	
	private JLabel guide;
	private JTextField input;
	private Vector<String> vector;
	private JList<String> nameList;
	
	public Exercise_ListChange() {
		setTitle("JList 변경 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		guide = new JLabel("이름 입력 후 <Enter> 키");
		input = new JTextField(10);
		vector = new Vector<String>();
		nameList = new JList<String>();
		c.add(guide);
		c.add(input);
		nameList.setVisibleRowCount(5);
		nameList.setFixedCellWidth(100);
		c.add(new JScrollPane(nameList));
		input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField)e.getSource();
				// 벡터에 입력한 값 추가
				vector.add(jt.getText());
				// 입력했던 값 지워주기
				jt.setText("");
				// JList에 넣어주기
				nameList.setListData(vector);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_ListChange();
	}
}
