package com.kh.day17.oop.motel.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day17.oop.motel.domain.vo.Room;

public class MotelController {

	List<Boolean> rList;
	
	public MotelController() {
		rList = new ArrayList<Boolean>();
		for(int i = 0; i < 10; i++) {
			rList.add(false);
		}
	}
	
	public void checkIn(int roomNo) {
		if(roomNo > 0 && roomNo < 11) {
			Boolean room = rList.get(roomNo-1);
			if(!room) {
				rList.set(roomNo-1, true);
				System.out.println(roomNo+"번 방에 입실하셨습니다.");
			} else System.out.println(roomNo+ "번 방에는 현재 손님이 있습니다.");
		}
		else
			System.out.println("1번 방부터 10번 방까지 준비되어 있습니다.");
	}
	
	public void checkOut(int chosenRoom) {
		if(chosenRoom > 0 && chosenRoom < 11) {
			Boolean room = rList.get(chosenRoom-1);
			if(room) {
				rList.set(chosenRoom-1, false);
				System.out.println(chosenRoom+"번 방에서 퇴실하셨습니다.");
			} else System.out.println(chosenRoom+ "번 방은 현재 비어있습니다.");
		}
		else
			System.out.println("1번 방부터 10번 방까지 준비되어 있습니다.");
	}
	
	public void printAllRooms() {
		for(int i = 0; i < rList.size(); i++) {
			if(!rList.get(i))
				System.out.println((i+1)+"번 방이 현재 비어있습니다.");
			else 
				System.out.println((i+1)+"번 방에는 현재 손님이 있습니다.");
		}
	}
	
}
