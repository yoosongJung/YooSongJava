package com.kh.day13.swing.motel.model.vo;

public class Motel {
	private String possible;
	private int no;
	
	public Motel() {}
	public Motel(int no, String possible) {
		this.no = no;
		this.possible = possible;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setPossible(String possible) {
		this.possible = possible;
	}
	public int getNo() {
		return no;
	}
	public String getPossible() {
		return possible;
	}
	
	
	@Override
	public String toString() {
		return this.possible;
	}
}
