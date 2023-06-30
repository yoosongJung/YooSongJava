package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int korean = 0;
	static int english = 0;
	static int math = 0;
	public static void main(String [] args)
	{
		while(true) {
			Scanner sc = new Scanner(System.in);
			printMenu();
			int choice = sc.nextInt();
			if(choice == 1) {
				inputScore();
			} else if(choice == 2) {
				printScore();
			} else if(choice == 3) {
				showGoodBye();
				break;
			} else {
				printException();
			}
		}
		
	}
	
	public static void printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		korean = sc.nextInt();
		System.out.print("영어 : ");
		english = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}
	
	public static void printScore() {
		double sum = korean + english + math;
		System.out.println("====== 성적 출력 ======");
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.printf("총점 : %.0f\n", sum);
		System.out.printf("평균 : %.2f\n", sum/3);
	}
	
	public static void showGoodBye() {
		System.out.println("종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("1~3번 중 선택하세요.");
	}
}
