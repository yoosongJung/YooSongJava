package com.kh.day11.iostream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {
		Writer writer = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.nextLine();
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/" + fileName);
			System.out.println(fileName + " 파일에 저장될 내용 입력");
			System.out.println("종료는 exit");
			for(int i = 1;;i++) {
				System.out.print(i + " : ");
				String input = sc.nextLine();
				if(input.equals("exit")) break;
				writer.write(input + "\n");
			}
			writer.flush();
			System.out.println("파일 저장이 완료되었습니다. 확인하세요.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
