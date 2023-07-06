package com.kh.day09.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar openDate =  Calendar.getInstance();
		openDate.clear();
		openDate.set(2023, 4, 15, 9, 0);
		Calendar closeDate = Calendar.getInstance();
		closeDate.clear();
		closeDate.set(2023, 9, 26, 17, 50);
		Exam_Calendar ex = new Exam_Calendar();
		ex.printCalendar("현재", today);
		ex.printCalendar("개강일", openDate);
		ex.printCalendar("종강일", closeDate);
	}
	public void printCalendar(String title, Calendar cal) {
		int year 		= cal.get(Calendar.YEAR);
		int month 		= cal.get(Calendar.MONTH)+1;
		int day 		= cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek   = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay	= cal.get(Calendar.HOUR_OF_DAY);
		int ampm 		= cal.get(Calendar.AM_PM);
		int hour 		= cal.get(Calendar.HOUR);
		int minute 		= cal.get(Calendar.MINUTE);
		int second 		= cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		System.out.print(title + " ");
		System.out.print(year + "/" + month + "/" + day);
		
		System.out.print("/");
		switch(dayOfWeek) {
		case Calendar.SUNDAY :    System.out.print("일요일"); break;
		case Calendar.MONDAY :    System.out.print("월요일"); break;
		case Calendar.TUESDAY :   System.out.print("화요일"); break;
		case Calendar.WEDNESDAY : System.out.print("수요일"); break;
		case Calendar.THURSDAY :  System.out.print("목요일"); break;
		case Calendar.FRIDAY : 	  System.out.print("금요일"); break;
		case Calendar.SATURDAY :  System.out.print("토요일"); break;
		}
		System.out.print("(" + hourOfDay + "시) ");
		if(ampm == Calendar.AM) System.out.print("오전 ");
		else System.out.print("오후 ");
		System.out.print(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
		System.out.println();
	}
}
