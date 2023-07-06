package com.kh.day09.objectpkg;

public class Point {
	private int x, y;
	public Point( ) {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x : " + this.x + ", y : " + this.y;
	}
}
