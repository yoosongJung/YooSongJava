package com.kh.day13.swing.motel.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day13.swing.motel.model.vo.Motel;

public class MotelView {

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("모텔 관리 프로그램 v1.0");
		System.out.println("1.입실		2.퇴실		3.방보기		4.종료");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
	public Motel checkInRoomNo(List<Motel> allList) {
		Motel motel = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번방에 입실하시겠습니까?");
		int roomNo = sc.nextInt();
		if(roomNo > 0 && roomNo < 11) {
			if(allList.get(roomNo-1).getPossible() == "book") {
				motel = new Motel(roomNo, "already");
			} else if(allList.get(roomNo-1).getPossible() == "empty"){
				motel = new Motel(roomNo, "book");
			}
		} else {
			System.out.println("1~10번방 중 선택하세요.");
		}
		return motel;
	}
	
	public void showAllRoom(List<Motel> allList) {
		int i = 1;
		for(Motel motel : allList) {
			if(motel.toString() == "empty") {
				System.out.println(i + "번방이 현재 비어있습니다.");
			} else {
				System.out.println(i + "번방에는 현재 손님이 있습니다.");
			}
			i++;
		}
	}

}
