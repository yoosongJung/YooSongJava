package com.kh.day07.oop.point;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		super(); // 생략되있음
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		super.showPoint();
	}
}
