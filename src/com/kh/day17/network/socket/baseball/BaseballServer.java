package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseballServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.");
			Thread.sleep(1000);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SS");
			System.out.println(simpleDateFormat.format(new Date()));
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			int [] numArrs = new int[3];
			for(int i = 0; i < numArrs.length; i++) {
				numArrs[i] = (int)(Math.random()*9)+1;
				for(int j = 0; j < i; j++) {
					if(numArrs[i] == numArrs[j]) {
						i--;
						break;
					}
				}
			}
			System.out.printf("서버 숫자 -> %d %d %d\n", numArrs[0], numArrs[1], numArrs[2]);
			System.out.println("서버 준비 완료");
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
					
			while(true) {
				String recvNumber = dis.readUTF();
				System.out.printf("받기 : %s\n", recvNumber);
				
				String [] numberArrs = recvNumber.split(" ");
				String result = ""; 
				if(numberArrs.length != 3) {
					result = "end";
				} else {
					int strike = 0;
					int ball = 0;
//					int num1 = Integer.parseInt(numberArrs[0]);
//					int num2 = Integer.parseInt(numberArrs[1]);
//					int num3 = Integer.parseInt(numberArrs[2]);
//					if(numArrs[0] == num1) strike++;
//					if(numArrs[1] == num2) strike++;
//					if(numArrs[2] == num3) strike++;
//					if(numArrs[0] == num2 || numArrs[0] == num3) ball++;
//					if(numArrs[1] == num1 || numArrs[1] == num3) ball++;
//					if(numArrs[2] == num1 || numArrs[2] == num2) ball++;
					
					for (int i = 0; i < numArrs.length; i++) {
						for (int j = 0; j < numberArrs.length; j++) {
							if (numArrs[i] == Integer.parseInt(numberArrs[j])) {
								if(i == j) strike++;
								else ball++;
							}
						}
					}
					
					result = strike + "스트라이크 " + ball + "볼";
					System.out.println(result);
				}
				dos.writeUTF(result);
				dos.flush();
				if(result.equals("3스트라이크 0볼")) break;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
