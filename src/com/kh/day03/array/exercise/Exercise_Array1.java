package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	
	public void exercise1() {
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			System.out.print("양수 입력" + (i+1) + " : ");
			nums[i] = sc.nextInt();
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + " 입니다.");
	}
	
	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
		// 평균을 구하는 프로그램을 작성하라. (배열 크기 5)
		Scanner sc = new Scanner(System.in);
		int [] arrs = new int[5];
		int sum = 0;
		for(int i = 0; i < arrs.length; i++) {
			System.out.print("정수 입력" + (i+1) + " : ");
			arrs[i] = sc.nextInt();
			sum += arrs[i];
		}
		System.out.println("평균 : " + (double)sum/arrs.length);
	}
	
	public void arrayCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오.
		// 230515-1231514 -> 230515-1******
		// 231026-1231515 -> 231026-1******
		char [] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 : ");
		String memberNum = sc.next();
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		char [] copy = new char[14]; // 깊은 복사의 시작!
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i]; // 성별자리 전까지 차례대로 값을 대입
			} else {
				copy[i] = '*'; // 성별자리 이후엔 *로 값 대입
			}
		}
		
		for(int i = 0; i <copy.length; i++) {
			System.out.print(copy[i]);
		}
	}
	
	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		
		Random rand = new Random();
		int [] sixNum = new int[6];
		int num;
		for(int i = 0; i < sixNum.length; i++) {
			sixNum[i] = rand.nextInt(45)+1;
			
			for(int j = 0; j < i; j++) {
				if(sixNum[j] == sixNum[i]) {
					i--;
				}
			}
		}
		
		for(int i = 0; i < sixNum.length-1; i++) {
			for(int j = 0; j < sixNum.length-1-i; j++) {
				if(sixNum[j] > sixNum[j+1]) {
					int temp = sixNum[j];
					sixNum[j] = sixNum[j+1];
					sixNum[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < sixNum.length; i++) {
			System.out.print(sixNum[i] + " ");
		}
		
	}
	
	
	
	
}
