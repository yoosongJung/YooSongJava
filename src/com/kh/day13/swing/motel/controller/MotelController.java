package com.kh.day13.swing.motel.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day13.swing.motel.model.vo.Motel;

public class MotelController {
	List<Motel> mList;
	public MotelController() {
		mList = new ArrayList<Motel>();
		for(int i = 1; i < 11; i++) {
			mList.add(new Motel(i,"empty"));
		}
	}
	
	public List<Motel> printAllInfo() {
		return mList;
	}
	
	public void checkIn(int roomNo, Motel motel) {
		mList.set(roomNo-1, motel);
	}

}
