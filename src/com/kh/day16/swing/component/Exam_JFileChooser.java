package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exam_JFileChooser extends JFrame{
	private JLabel imgLabel;
	public Exam_JFileChooser() {
		imgLabel = new JLabel();
		setTitle("메뉴와 파일Chooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imgLabel);
		createMenu();
		setSize(350, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("Open");
		item.addActionListener(new ActionListener() { // open이 클릭됬을때 동작
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int chosen =
				chooser.showOpenDialog(null); // 파일선택창 띄우기
				
				// FileChooser 동작시 비정상적인 선택
				if(chosen != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "파일 선택 안했음.",
							"경고", JOptionPane.WARNING_MESSAGE);
					return; // Null일때 밑에있는 코드 실행되어서 오류 발생. 리턴으로 조치.
				}
				
				String filePath = chooser.getSelectedFile().getPath();
				imgLabel.setIcon(new ImageIcon(filePath)); // JLabel에 Image 표시하기
			}
		});
		
		menu.add(item);
		bar.add(menu);
		
		setJMenuBar(bar);
	}
	
	public static void main(String[] args) {
		new Exam_JFileChooser();
	}

}
