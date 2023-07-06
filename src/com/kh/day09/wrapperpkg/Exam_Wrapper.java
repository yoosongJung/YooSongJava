package com.kh.day09.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 0;
		Integer su = Integer.valueOf(0);
		su = new Integer(0);
		// The constructor Integer(int) has been deprecated since version 9 and marked for removal
//		su = null;
		// 박싱과 언박싱
		su = Integer.valueOf(1026);
		su = 1026; // 오토-박싱
		
		int suNum = su.intValue();
		suNum = su; // 오토-언박싱
		
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
	}

}
