package com.kh.day10.collection.music;

public class Music {
	private String title;
	private String singer;
	
	public Music() {}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "곡명 : " + this.title + ", 가수명 : " + this.singer;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getSinger() {
		return this.singer;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
}
