package com.kh.day06.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int index = 0;
	public static void main(String [] args)
	{
//		Student stdOne = new Student();
		Student [] stds = new Student[3];
		while(true) {
			Scanner sc = new Scanner(System.in);
			printMenu();
			int choice = sc.nextInt();
			if(choice == 1) {
				inputScore(stds);
			} else if(choice == 2) {
				printScore(stds);
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
	
	public static void inputScore(Student [] stds) {
		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < stds.length; i++) {
			stds[index] = new Student();
			System.out.println("====== 이름 입력 ======");
			System.out.print("이름 : ");
			// 문자열 입력받는 메소드 next(), nextLine()
			// next() : 공백없는 문자열 ex. 이름, ...
			// nextLine() : 공백있는 문자열 ex. 주소, ...
			stds[index].name = sc.next();
			System.out.println("====== 성적 입력 ======");
			System.out.print("국어 : ");
			stds[index].kor = sc.nextInt();
			System.out.print("영어 : ");
			stds[index].eng = sc.nextInt();
			System.out.print("수학 : ");
			stds[index].math = sc.nextInt();
			if(index < stds.length-1) index++;
//		}
	}
	
	public static void printScore(Student [] stds) {
		for(int i = 0; i <= index; i++) {
			double sum = stds[i].kor + stds[i].eng + stds[i].math;
			System.out.println("====== 성적 출력 ======");
			System.out.printf("이름 : %s\n", stds[i].name);
			System.out.printf("국어 : %d\n", stds[i].kor);
			System.out.printf("영어 : %d\n", stds[i].eng);
			System.out.printf("수학 : %d\n", stds[i].math);
			System.out.printf("총점 : %d\n", stds[i].getTotal());
			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
		}
	}
	
	public static void showGoodBye() {
		System.out.println("종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("1~3번 중 선택하세요.");
	}
}
