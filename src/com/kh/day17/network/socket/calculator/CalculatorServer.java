package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			System.out.println("서버 구동중입니다.");
			for(int i = 1; i <= 20; i++) {
				System.out.print("=");
				Thread.sleep(100);
			}
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다..");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while(true) {
				String recvCal = dis.readUTF();
				System.out.printf("받은 메시지 : %s\n", recvCal);
				if(recvCal.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				String [] msgArrs = recvCal.split(" ");
				String result = ""; 
				if(msgArrs.length != 3) {
					result = "end";
				} else {
					int num1 = Integer.parseInt(msgArrs[0]);
					int num2 = Integer.parseInt(msgArrs[2]);
					String operator = msgArrs[1];
					switch(operator) {
					case "+" : 
						result = String.valueOf(num1 + num2);
						break;
					case "-" : 
						result = String.valueOf(num1 - num2);
						break;
					case "*" : 
						result = String.valueOf(num1 * num2);
						break;
					case "/" :
						result = String.valueOf(num1 / num2);
						break;
					case "%" : 
						result = num1 % num2 + ""; // 문자열 만나면 문자열 자동 변환
						break;
					default : result = "end";
					}
				}
				dos.writeUTF(result);
				dos.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
