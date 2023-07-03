package com.kh.day06.oop.student;

import java.util.Scanner;

import com.kh.day06.oop.student.Student;

public class StudentRun {
	static int index = 0;
	public static void main(String[] args) {
		// 학생 성적 확인 프로그램
		// 1. 학생 성적 입력
		// 2. 학생 성적 출력
		// 3. 재평가 여부 확인
		// 4. 프로그램 종료
		// 메뉴 입력 : 4
		Student [] stds = new Student[3];
		while(true) {
			int num = printMenu();
			if(num == 4) {
				goodBye();
				break;
			} else if(num == 1) {
				inputStudent(stds);
			} else if(num == 2) {
				printStudent(stds);
			} else if(num == 3) {
				reExam(stds);
			}
		}
	}
		
		public static int printMenu() {
			Scanner sc = new Scanner(System.in);
			System.out.println("====== 학생 성적 확인 프로그램 ======");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 학생 성적 출력");
			System.out.println("3. 재평가 여부 확인");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			int num = sc.nextInt();
			return num;
		}
		// 1. 선택시
		// 1번째 학생 정보 입력
		// 학생 이름 입력 : 일용자
		// 1차 점수 입력 : 60
		// 2차 점수 입력 : 55
		// => 1명씩 입력받도록 하거나
		// 2명 한꺼번에 입력받도록 하세요
		public static void inputStudent(Student [] stds) {
			Scanner sc = new Scanner(System.in);
			stds[index] = new Student();
			System.out.println("====== 학생 성적 입력 ======");
			System.out.println((index+1) + "번째 학생정보 입력");
			System.out.print("학생 이름 입력 : ");
			stds[index].setName(sc.next());
			System.out.print("1차 점수 입력 : ");
			stds[index].setFirstScore(sc.nextInt());
			System.out.print("2차 점수 입력 : ");
			stds[index].setSecondScore(sc.nextInt());
			
			if(index < stds.length-1) index++;
		}
	
		// 2. 선택시
		// 1번째 학생 정보 출력
		// 일용자 학생의 점수는 
		// 1차 점수 : 60, 2차 점수 : 55 입니다.
		public static void printStudent(Student [] stds) {
			System.out.println("====== 학생 성적 출력 ======");
			for(int i = 0; i < index; i++) {
				System.out.println((i+1) + "번째 학생정보 출력");
				System.out.printf("%s 학생의 점수는 1차 점수 : %d점, 2차 점수 : %d점 입니다.\n",
						stds[i].getName(), stds[i].getFirstScore(), stds[i].getSecondScore());
			}
		}
		
		// 3. 선택시
		// 1번째 일용자 학생의 확인결과
		// 통과했습니다.
		
		// 1번째 일용자 학생의 확인결과
		// 1차 시험 재평가 대상자입니다.
		
		// 1번째 일용자 학생의 확인결과
		// 2차 시험 재평가 대상자입니다.
		
		// 1번째 일용자 학생의 확인결과
		// 1차 시험 재평가 대상자입니다.
		// 2차 시험 재평가 대상자입니다.
		public static void reExam(Student [] stds) {
			System.out.println("====== 재평가 여부 확인 ======");
			for(int i = 0; i < index; i++) {
				System.out.println((i+1) + "번째 " + stds[i].getName() + " 학생의 확인결과");
				if(stds[i].getAvg() >= 60 ) {
					if(stds[i].getFirstScore() < 40) {
						System.out.println("1차 시험 재평가 대상자입니다.");
					} else if(stds[i].getSecondScore() < 40) {
						System.out.println("2차 시험 재평가 대상자입니다.");
					} else System.out.println("통과했습니다.");
				} else {
					if(stds[i].getFirstScore() < 60) {
						System.out.println("1차 시험 재평가 대상자입니다.");
					}
					if(stds[i].getSecondScore() < 60) {
						System.out.println("2차 시험 재평가 대상자입니다.");
					}
				}
			}
		}
		
		// 재평가 기준 설명
		// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
		// 1. 점수가 40점 미만인 경우 과락으로 재평가 대상자가 된다.
		// 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
		// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 60점 미만의
		// 과목은 재평가를 본다.
	// 4. 선택시
	// 프로그램이 종료되었습니다.
	public static void goodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
}
