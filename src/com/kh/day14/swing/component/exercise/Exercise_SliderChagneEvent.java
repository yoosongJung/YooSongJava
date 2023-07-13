package com.kh.day14.swing.component.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Exercise_SliderChagneEvent extends JFrame {
	private JLabel colorLabel;
	private JSlider [] sliders;
	
	public Exercise_SliderChagneEvent() {
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		colorLabel = new JLabel("SLIDER EXAMPLE");
		sliders = new JSlider[3];
		for(int i = 0; i < sliders.length; i++) {
			sliders[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sliders[i].setPaintLabels(true);  // 숫자
			sliders[i].setPaintTicks(true);	  // 눈금
			sliders[i].setMajorTickSpacing(50);
			sliders[i].setMinorTickSpacing(10);
			sliders[i].addChangeListener(new ChangeListener() {
				// 슬라이더가 Change할때 발생하는 이벤트 감지
				@Override
				public void stateChanged(ChangeEvent e) {
					int r = sliders[0].getValue(); // 슬라이더의 해당 값(숫자)
					int g = sliders[1].getValue();
					int b = sliders[2].getValue();
					colorLabel.setOpaque(true);
					colorLabel.setBackground(new Color(r, g, b));
				}
			});
			c.add(sliders[i]);
		}
		sliders[0].setForeground(Color.red);
		sliders[1].setForeground(Color.green);
		sliders[2].setForeground(Color.blue);
		c.add(colorLabel);
		
		setSize(300, 230);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_SliderChagneEvent();
	}
}
