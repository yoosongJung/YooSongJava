package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Socket socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			System.out.println("게임 준비 완료");
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			while(true) {
				System.out.print("--> ");
				String userNumber = sc.nextLine();
				dos.writeUTF(userNumber);
				dos.flush();
				
				String recvNumber = dis.readUTF();
				if(recvNumber.equalsIgnoreCase("end")) {
					System.out.println("숫자 3개를 입력하세요. 사이 공백 포함");
					continue;
				}
				System.out.println(recvNumber);
				if(recvNumber.startsWith("3")) {
					System.out.println("삼진! 게임 종료");
					break;
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
