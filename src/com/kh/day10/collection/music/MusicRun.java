package com.kh.day10.collection.music;

public class MusicRun {

	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		end :
		while(true) {
			int value = mFunc.printMenu();
			switch(value) {
				case 1 :
					mFunc.addToLast();
					break;
				case 2 :
					mFunc.addToFirst();
					break;
				case 3 :
					mFunc.printAllMusics();
					break;
				case 4 :
					mFunc.printOneByTitle();
					break;
				case 5 :
					mFunc.removeMusicByTitle();
					break;
				case 6 :
					mFunc.modifyMusicInfo();
					break;
				case 7 :
					
					break;
				case 8 :
					
					break;
				case 9 :
					
					break;
				case 10 :
					
					break;
				case 0 :
					System.out.println("프로그램이 종료되었습니다.");
					break end;
			}
		}
	}

}
