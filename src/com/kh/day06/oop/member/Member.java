package com.kh.day06.oop.member;

public class Member {
	private String name;
	private String id;
	private int point;
	
	public Member() {
		name = "";
		id = "";
		point = 0;
	}
	
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public int getPoint() {
		return this.point;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public char getGrade() {
		char grade = 'C';
		if(point < 100) grade = 'C';
		else if(point < 1000) grade = 'B';
		else grade = 'A';
		return grade;
	}
	
}
