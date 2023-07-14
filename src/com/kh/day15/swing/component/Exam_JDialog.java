package com.kh.day15.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog {
	private JButton btn;
	public MyDialog() {}
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout()); // 레이아웃 설정
		add(new JTextField(10)); // 텍스트필드 추가
		btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		add(btn); // 버튼 추가
		setSize(200, 100); // 다이얼로그 크기 세팅
	}
	
}

public class Exam_JDialog extends JFrame{
	private MyDialog dialog;
	public Exam_JDialog() {
		
		setTitle("Dialog 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Dialog"); // 버튼 생성(누를시 다이얼로그 보임)
		dialog = new MyDialog(this, "Test Dialog"); // 다이얼로그 생성
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); // 이미 생성된 다이얼로그 보이게 해줌
			}
		});
		Container c = getContentPane();
		c.add(btn);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JDialog();
	}

}
