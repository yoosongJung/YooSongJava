package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		int [][] arrs = new int[5][5];
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = i*5+5-j;
			}
			System.out.println();
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise2() {
		int [][] arrs = new int[5][5];
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = j*5+1+i;
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise3() {
		int [][] arrs = new int[5][5];
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = (5-i)+(j*5);
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void exercise4() {
		int [][] arrs = new int[5][5];
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				if(i % 2 != 0) arrs[i][j] = i*5+5-j;
				else arrs[i][j] = i*5+j+1;
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ",arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		double [][] score = {{2.4, 3.5}, {4.3, 1.8}, {2.4, 3.2}, {2.8, 3.1}};
		double sum = 0;
		int count = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%.1f ", score[i][j]);
				sum += score[i][j];
				count++;
			}
			System.out.println();
		}
		System.out.printf("4년간 전체 평점 평균 : %.2f\n", sum/count);
	}
}
