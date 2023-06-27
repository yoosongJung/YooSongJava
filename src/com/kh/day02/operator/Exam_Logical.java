package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args)
	{
		System.out.println("논리연산자 예제");
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4;
		// 남자이면서 평균평점 4.3 이상인 사람
		// 컴퓨터공학과 또는 경영학과인 사람
		result1 = (num1 == num2) && (num1 < num2); // false
		result2 = (num1 < num2) || (num1 == num2); // false
		result3 = (num1 > num2) && (num1 != num2); // true
		result4 = (num1 > num2) || (num1 == num2); // true
		
		System.out.println("result1의 결과값 : " + result1);
		System.out.println("result2의 결과값 : " + result2);
		System.out.println("result3의 결과값 : " + result3);
		System.out.println("result4의 결과값 : " + result4);
		
		// 연습문제1번-2
		int aNum = 70;
		int bNum = 55;
		
		result1 = (aNum == bNum) || (aNum++ < 100);
		// a : 71, b : 55, true
		result2 = (aNum < bNum) && (--bNum < 55); // && 앞이 false면 뒤는 계산 안함.
		// a : 71, b : 55, false
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		// a : 72, b : 54, true
		result4 = (aNum++ != bNum) || (bNum++ >= 85); // || 앞이 true면 뒤는 계산 안함.
		// a : 73, b : 54, true
		System.out.println("aNum의 값 : " + aNum + ", bNum의 값 : " + bNum);
		
	}
}
