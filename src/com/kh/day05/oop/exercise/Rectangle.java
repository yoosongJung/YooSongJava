package com.kh.day05.oop.exercise;

public class Rectangle {
//	너비와 높이를 입력 받아 사각형의 넓이를 출력하는 프로그램을 작성하라. 
//	너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 
//	Rectangle 클래스를 만들어라.
	public int width;
	public int height;
	
	public Rectangle() {
		// 초기화
		width = 5;
		height = 15;
	}
	
	public int getArea() {
		return width * height;
	}
}
