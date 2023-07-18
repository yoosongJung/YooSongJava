package com.kh.day17.exercise;

import java.util.Scanner;

public class Motel {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		boolean [] rooms = new boolean[10];
		end :
		while(true) {
			System.out.println("모텔 관리 프로그램 v1.0");
			System.out.print("1.입실 2.퇴실 3.방보기 4.종료\n");
			System.out.print("선택 > ");
			int choice = sc.nextInt();
			int chosenRoom = 0;
			switch(choice) {
			case 1 : 
				System.out.print("몇번 방에 입실하시겠습니까?");
				chosenRoom = sc.nextInt();
				if(chosenRoom > 0 && chosenRoom < 11) {
					if(!rooms[chosenRoom-1]) {
						rooms[chosenRoom-1] = true;
						System.out.println(chosenRoom+"번 방에 입실하셨습니다.");
					} else System.out.println(chosenRoom+ "번 방에는 현재 손님이 있습니다.");
				}
				else
					System.out.println("1번 방부터 10번 방까지 준비되어 있습니다.");
				Thread.sleep(1000);
				break;
			case 2 : 
				System.out.print("몇번 방에서 퇴실하시겠습니까?");
				chosenRoom = sc.nextInt();
				if(chosenRoom > 0 && chosenRoom < 11) {
					if(rooms[chosenRoom-1]) {
						rooms[chosenRoom-1] = false;
						System.out.println(chosenRoom+"번 방에서 퇴실하셨습니다.");
					} else System.out.println(chosenRoom+ "번 방은 현재 비어있습니다.");
				}
				else
					System.out.println("1번 방부터 10번 방까지 준비되어 있습니다.");
				Thread.sleep(1000);
				break;
			case 3 : 
				for(int i = 0; i < rooms.length; i++) {
					if(!rooms[i])
						System.out.println((i+1)+"번 방이 현재 비어있습니다.");
					else 
						System.out.println((i+1)+"번 방에는 현재 손님이 있습니다.");
				}
				Thread.sleep(1000);
				break;
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}

}
