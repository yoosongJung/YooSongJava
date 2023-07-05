package com.kh.day07.oop.casino;

public class CasinoRun {
	public static void main(String[] args) {
		CasinoFunction cFunc = new CasinoFunction();
		finish :
			while(true) {
				int choice = cFunc.printMenu();
				switch(choice) {
				case 1 :
					
					break;
				case 2 :
					
					break;
				case 3 : 
					
					break;
				case 4 : 
									
					break;
				case 5 : 
					cFunc.checkMoney();
					break;
				case 6 : 
					cFunc.goodBye();
					break finish;
								default :
					System.out.println("해당 메뉴는 존재하지 않습니다.");
					break;
				}
			}
	}
}
