package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void forExercise1() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
				// 1+2+3+4+5+6+7+8+9+10=55
				int sum = 0;
				for(int i = 1; i < 11;i++) {
					sum = sum + i;
					if(i != 10)	System.out.print(i + "+");
					else System.out.print(i + "=");
				}
				System.out.print(sum);
	}
	
	public void forExercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 9 사이의 정수 입력 : ");
		int num = sc.nextInt();
		if(num < 1 || num > 9) {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다");
			return;
		}
		System.out.println(num + "단");
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}
	
	public void forDoubleExercise1() {
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}
	
	public void forDoubleExercise2() {
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.printf("%2d시 %2d분\n",i, j);
			}
		}
	}
	
	public void forDoubleExercise3() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void for1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	    //단, 입력한 수는 1보다 크거나 같아야 합니다.
	    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		for(int i = 0; i < num; i++) {
			System.out.print((i+1) + " ");
		}
	}
	
	public void for2() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	    //단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		for(int i = num; i > 0; i--) {
			System.out.print((i) + " ");
		}
	}
	
	public void for3() {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + " 까지의 합 : " + sum);
	}
	
	public void for4() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		System.out.print("숫자 입력 : ");
		int num2 = sc.nextInt();
		if(num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		if(Math.abs(num-num2) == 1 || num == num2) {
			System.out.println("두 수의 사이의 값은 없습니다.");
		} else if (num < num2) {
			System.out.println(num + " ~ " + num2 + " 사이의 값 : ");
			for(int i = num+1; i < num2; i++) {
				System.out.print(i + " ");
			}
		} else if (num > num2) {
			System.out.println(num2 + " ~ " + num + " 사이의 값 : ");
			for(int i = num2+1; i < num; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void for5() {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
	}
	
	
	
	
	
	
	
}
