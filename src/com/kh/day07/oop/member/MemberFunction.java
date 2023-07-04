package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {
	private Member2 [] memArrs;
	private int index;
	
	public MemberFunction() {
		memArrs = new Member2[3];
		index = 0;
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 관리 프로그램 ======");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		memArrs[index] = new Member2();
		System.out.println("====== 회원 정보 입력 ======");
		System.out.print("회원 ID 입력 : ");
		memArrs[index].setMemberId(sc.next());
		System.out.print("비밀번호 : ");
		memArrs[index].setMemberPw(sc.next());
		System.out.print("이메일 : ");
		memArrs[index].setMemberEmail(sc.next());
		sc.nextLine();
		System.out.print("주소 : ");
		memArrs[index].setMemberAddress(sc.nextLine());
		
		if(index < memArrs.length-1) index++;
	}
	
	public void printInfo() {
		System.out.println("====== 회원 정보 출력 ======");
		for(int i = 0; i < index; i++) {
			System.out.println((i+1) + "번째 회원정보 출력");
			System.out.printf("아이디 : %s\n비밀번호 : %s\n이메일 : %s\n주소 : %s\n",
					memArrs[i].getMemberId(), memArrs[i].getMemberPw(),
					memArrs[i].getMemnerEmail(), memArrs[i].getMemberAddress());
		}
	}
	
	public void goodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
}
