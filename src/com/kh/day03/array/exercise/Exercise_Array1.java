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
		for(int i = 0; i < sixNum.length; i++) {
			sixNum[i] = rand.nextInt(45)+1;
			
			for(int j = 0; j < i; j++) {
				if(sixNum[i] == sixNum[j]) {
					i--;
					continue;
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
	
	public void practice1() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int [] arrs = new int[10];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i+1;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
	
	public void practice2() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		int [] arrs = new int[10];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = arrs.length-i;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
	
	public void practice3() {
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int [] arrs = new int[num];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i+1;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
	
	public void practice4() {
		//길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		//배열 인덱스를 활용해서 귤을 출력하세요.
		
		String [] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.print(fruits[1]);
	}
	
	public void practice5() {
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String sentence = sc.next();
		System.out.print("문자 : ");
		char c = sc.next().charAt(0);
		char [] arrs = new char[sentence.length()];
		int count = 0;
		String position = "";
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sentence.charAt(i);
			if(arrs[i] == c) {
				position += i+" ";
				count++;
			}
		}
		System.out.println(sentence + " 에 " + c + " 가 존재하는 위치(인덱스) : " + position);
		System.out.println(c + " 의 개수 : " + count);
	}
	
	public void practice6() {
		//“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		String [] days = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num > 6) {
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		System.out.println(days[num]+"요일");
	}
	
	public void practice7() {
		//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int all = sc.nextInt();
		int [] arrs = new int[all];
		int sum = 0;
		for(int i = 0; i < arrs.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num = sc.nextInt();
			arrs[i] = num;
			sum += num;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		System.out.println("\n총 합 : " + sum);
	}
	
	public void practice8() {
		//3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num % 2 != 0 && num > 3) {
				break;
			}
			System.out.println("다시 입력하세요.");
		}
		int [] arrs = new int[num];
		for(int i = 0; i < arrs.length; i++) {
			if(i < (num / 2) + 1) {
				arrs[i] = i+1;
			} else {
				arrs[i] = num - i;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
	
	public void practice9() {
		//사용자가 입력한 값이 배열에 있는지 검색하여
		//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		String [] chickens = {"양념", "오리지날", "간장"};
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String chickName = sc.next();
		int count = 0;
		for(int i = 0; i < chickens.length; i++) {
			if(chickens[i].contains(chickName)) {
				count++;
			}
		}
		if(count == 1) System.out.println(chickName + "치킨 배달 가능");
		else System.out.println(chickName + "치킨은 없는 메뉴입니다.");
		
	}
	
	
	
	
	
	
}
