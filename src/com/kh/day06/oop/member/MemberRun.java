package com.kh.day06.oop.member;

import java.util.Scanner;

public class MemberRun {
	static int index = 0;
	public static void main(String[] args) {
		Member [] memArrs = new Member[3];
		while(true) {
			int num = printMenu();
			if(num == 4) {
				goodBye();
				break;
			} else if(num == 1) {
				inputMemberInfo(memArrs);
			} else if(num == 2) {
				printMemberInfo(memArrs);
			} else if(num == 3) {
				checkGrade(memArrs);
			}
		}

	}

	private static void checkGrade(Member[] memArrs) {
		System.out.println("====== 회원 등급 출력 ======");
		for(int i = 0; i < index; i++) {
			System.out.println(memArrs[i].getName() + " 회원님의 등급결과");
			System.out.printf("회원 등급은 %s 입니다\n", memArrs[i].getGrade());
		}
	}

	private static void printMemberInfo(Member[] memArrs) {
		System.out.println("====== 회원 정보 출력 ======");
		for(int i = 0; i < index; i++) {
			System.out.println((i+1) + "번째 회원정보 출력");
			System.out.printf("%s 님의 아이디는 %s - 회원 점수 : %d\n",
					memArrs[i].getName(), memArrs[i].getId(), memArrs[i].getPoint());
		}
		
	}

	private static void inputMemberInfo(Member[] memArrs) {
		Scanner sc = new Scanner(System.in);
		memArrs[index] = new Member();
		System.out.println("====== 회원 정보 입력 ======");
		System.out.println((index+1) + "번째 회원정보 입력");
		System.out.print("회원 이름 입력 : ");
		memArrs[index].setName(sc.next());
		System.out.print("회원 ID 입력 : ");
		memArrs[index].setId(sc.next());
		System.out.print("회원 점수 입력 : ");
		memArrs[index].setPoint(sc.nextInt());
		
		if(index < memArrs.length-1) index++;
		
	}

	private static void goodBye() {
		System.out.println("프로그램이 종료되었습니다.");
		
	}

	private static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 정보 확인 프로그램 ======");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 출력");
		System.out.println("3. 회원 등급 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int num = sc.nextInt();
		return num;
	}

}
