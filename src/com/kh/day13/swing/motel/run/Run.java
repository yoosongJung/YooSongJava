package com.kh.day13.swing.motel.run;

import java.util.List;

import com.kh.day13.swing.motel.controller.MotelController;
import com.kh.day13.swing.motel.model.vo.Motel;
import com.kh.day13.swing.motel.view.MotelView;

public class Run {
	public static void main(String[] args) {
		MotelController mController = new MotelController();
		MotelView view = new MotelView();
		Motel motel = null;
		List<Motel> allInfo;
		end :
			while(true) {
				int choice = view.printMenu();
				
				switch(choice) {
				case 1 : 
					allInfo = mController.printAllInfo();
					motel = view.checkInRoomNo(allInfo);
					if(motel == null) break;
					if(motel.getPossible() == "already") {
						view.printMessage(motel.getNo() + "번방에는 현재 손님이 있습니다.");
						break;
					}
					mController.checkInOut(motel.getNo(), motel);
					view.printMessage(motel.getNo() + "번방에 입실하셨습니다");
					break;
				case 2 :
					allInfo = mController.printAllInfo();
					motel = view.checkOutRoomNo(allInfo);
					if(motel == null) break;
					if(motel.getPossible() == "already") {
						view.printMessage(motel.getNo() + "번방은 현재 빈 방입니다.");
						break;
					}
					mController.checkInOut(motel.getNo(), motel);
					view.printMessage(motel.getNo() + "번방에서 퇴실하셨습니다");
					break;
				case 3 :
					allInfo = mController.printAllInfo();
					view.showAllRoom(allInfo);
					break;
				case 4 :
					view.printMessage("프로그램을 종료합니다");
					break end;
				}
			}
	}
}
