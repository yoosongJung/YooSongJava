package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			if(num1 == 0) break;
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+, -, *, /, %) : ");
			String cal = sc.next();
			int result = 0;
			switch(cal) {
				case "+" : result = num1 + num2;
					break;
				case "-" : result = num1 - num2;
					break;
				case "*" : result = num1 * num2;
					break;
				case "/" : result = num1 / num2;
					break;
				case "%" : result = num1 % num2;
					break;
			}
			System.out.println(num1 + " " + cal + " " + num2 + " = " + result +
					"\n" + "종료하려면 0 입력");
		}
		
	}
}
