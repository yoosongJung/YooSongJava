package com.kh.day08.oop.interfacepkg;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void receiveCall() {
		System.out.println("여보세요");
		
	}

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루");
		
	}

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
		
	}

}
