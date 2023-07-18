package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {

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
			System.out.println("서버와 연결되었습니다.");
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			for(;;) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");	
				String sendCal = sc.nextLine();
				dos.writeUTF(sendCal);
				if(sendCal.equalsIgnoreCase("exit")) {
					System.out.println("종료하였습니다.");
					break;
				}
				dos.flush();
				
				String recvCal = dis.readUTF();
				if(recvCal.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				System.out.printf("계산 결과 : %s\n", recvCal);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
