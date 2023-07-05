package com.kh.day07.oop.casino;

import java.util.Scanner;

public class CasinoFunction {
	Casino casino = new Casino();
	static int sellCar = 0;
	static int sellHome = 0;
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
		System.exit(0); 
	}
	
	public void checkMoney() {
		System.out.println("===============================");
		System.out.println("자본 : " + casino.getMoney() + " 원");
	}
	
	public void putMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("1. 차 팔기");
		System.out.println("2. 집 팔기");
		System.out.println("3. 로비로 가기");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 :
			if(sellCar == 0) {
				System.out.println("===============================");
				System.out.println("차를 팔았습니다. + 200000 원");
				casino.addMoney(200000);
				sellCar++;
			} else {
				System.out.println("===============================");
				System.out.println("더 이상 팔 차가 없습니다.");
			}
			break;
		case 2 :
			if(sellHome == 0) {
				System.out.println("===============================");
				System.out.println("집을 팔았습니다. + 300000 원");
				casino.addMoney(300000);
				sellHome++;
			} else {
				System.out.println("===============================");
				System.out.println("더 이상 팔 집이 없습니다.");
			}
			break;
		case 3 :
			break;
		default :
			System.out.println("해당 메뉴는 존재하지 않습니다.");
			break;
		}
	}
	
	public void roulette() {
		finish :
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("===============================");
			System.out.println("1 ~ 36 룰렛의 번호 맞추기");
			System.out.println();
			System.out.println("1. 홀짝(2배)");
			System.out.println("2. 숫자 하나에 배팅(36배)");
			System.out.println("3. 3섹션중 고르기(3배)");
			System.out.println("4. 로비로 가기");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				roulette_evenOdd();
				break;
			case 2 :
				roulette_onePick();
				break;
			case 3 :
				roulette_threeSection();
				break;
			case 4 :
				break finish;
			default :
				System.out.println("해당 메뉴는 존재하지 않습니다.");
				break;
			}
		}
	}
	
	public void roulette_evenOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("1. 홀");
		System.out.println("2. 짝");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
//		Scanner sc2 = new Scanner(System.in);
		System.out.println("===============================");
		System.out.print("배팅 금액 : ");
		int betMoney = sc.nextInt();
		if(betMoney > casino.getMoney()) {
			System.out.println("돈 더 들고 오세요.");
		} else {
			System.out.println("룰렛 돌아가는중");
			delayOneSec();
			System.out.println("...");
			delayOneSec();
			int rouletteNum = (int)(Math.random() * 35) + 1;
			System.out.println("당첨 번호 : " + rouletteNum);
			delayOneSec();
			if(rouletteNum % 2 == 0) { // 짝수 일때
				if(choice == 1) {
					System.out.println("틀렸습니다. - " + betMoney + " 원");
					casino.minusMoney(betMoney);
					if(casino.getMoney() == 0) {
						System.out.println("파산하셨습니다.");
						goodBye();
					}
				} else {
					System.out.println("맞추셨습니다. + " + betMoney + " 원");
					casino.addMoney(betMoney);
				}
			} else { // 홀수 일때
				if(choice == 1) {
					System.out.println("맞추셨습니다. + " + betMoney + " 원");
					casino.addMoney(betMoney);
				} else {
					System.out.println("틀렸습니다. - " + betMoney + " 원");
					casino.minusMoney(betMoney);
					if(casino.getMoney() == 0) {
						System.out.println("파산하셨습니다.");
						goodBye();
					}
				}
			}
		}
	}
	
	public void roulette_onePick() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.print("1 ~ 36 중 하나 선택 : ");
		int choice = sc.nextInt();
		System.out.println("===============================");
		System.out.print("배팅 금액 : ");
		int betMoney = sc.nextInt();
		if(betMoney > casino.getMoney()) {
			System.out.println("돈 더 들고 오세요.");
		} else {
			System.out.println("룰렛 돌아가는중");
			delayOneSec();
			System.out.println("...");
			delayOneSec();
			int rouletteNum = (int)(Math.random() * 35) + 1;
			System.out.println("당첨 번호 : " + rouletteNum);
			delayOneSec();
			if(rouletteNum == choice) {
				System.out.println("맞추셨습니다. + " + betMoney*35 + " 원");
				casino.addMoney(betMoney*35);
			} else {
				System.out.println("틀렸습니다. - " + betMoney + " 원");
				casino.minusMoney(betMoney);
				if(casino.getMoney() == 0) {
					System.out.println("파산하셨습니다.");
					goodBye();
				}
			}
		}
	}
	
	public void roulette_threeSection() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("1. 1 ~ 12");
		System.out.println("2. 13 ~ 24");
		System.out.println("3. 25 ~ 36");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		System.out.println("===============================");
		System.out.print("배팅 금액 : ");
		int betMoney = sc.nextInt();
		if(betMoney > casino.getMoney()) {
			System.out.println("돈 더 들고 오세요.");
		} else {
			System.out.println("룰렛 돌아가는중");
			delayOneSec();
			System.out.println("...");
			delayOneSec();
			int rouletteNum = (int)(Math.random() * 35) + 1;
			System.out.println("당첨 번호 : " + rouletteNum);
			delayOneSec();
			// @@@@@@@@@@@@@@@@@@@@@@@@@@@ 여기서 시작-3섹션 if랑 switch로 구현@@@@@@@
		}
	}
	
	public void delayOneSec() {
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public void dice() {
			
		}

	public void blackjack() {
		
	}
}
