package com.kh.day08.oop.interfacepkg;

public class Exam_Interface {
	public static void main(String[] args) {
		// 1. Cannot instantiate the type PhoneInterface
		// => 인터페이스로 객체 생성 안됌.
		PhoneInterface phone = new SamsungPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
	}
}
