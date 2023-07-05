package com.kh.day07.oop.casino;

import java.util.Scanner;

public class CasinoFunction {
	Casino casino = new Casino();
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= Genting Casino =========");
		System.out.println("1. 룰렛");
		System.out.println("2. 주사위");
		System.out.println("3. 블랙잭");
		System.out.println("4. 자본 충전");
		System.out.println("5. 자본 확인");
		System.out.println("6. 집으로");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void goodBye() {
		System.out.println("집으로 돌아갔습니다.");
	}
	
	public void checkMoney() {
		System.out.println("===============================");
		System.out.println("자본 : " + casino.getMoney() + " 원");
		
	}
}
