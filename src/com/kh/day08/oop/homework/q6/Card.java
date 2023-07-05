package com.kh.day08.oop.homework.q6;

public class Card {
	int cardNumber;
	static int serialNum = 10000;
	
	public Card() {
		cardNumber = serialNum;
		serialNum++;
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNumber + " 입니다.");
	}
}
