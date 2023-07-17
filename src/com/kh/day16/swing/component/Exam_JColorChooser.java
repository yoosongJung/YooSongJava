package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class Exam_JColorChooser extends JFrame {
	private JLabel label;
	public Exam_JColorChooser() {
		
		setTitle("JColorChoose 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label = new JLabel("Hello");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(label, BorderLayout.CENTER);
		createMenu();
		
		
		setSize(250, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Text");
		JMenuItem item = new JMenuItem("Color");
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color chosenColor = 
				JColorChooser.showDialog(null, "ColorPicker", Color.yellow);
				if(chosenColor != null) {
					label.setForeground(chosenColor); // 선택한 색으로 글씨색 변경
				}
			}
		});
		menu.add(item);
		menuBar.add(menu);
		
		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		new Exam_JColorChooser();
	}

}
