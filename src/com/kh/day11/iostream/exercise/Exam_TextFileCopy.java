package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
//		문자 스트림 FileReader와 FileWriter를 이용하여 
//		c:\windows\system.ini를 c:\Temp\system.txt 파일로 복사하는 프로그램을 작성하라.
		File file = new File("C:\\Temp");
		if(!file.exists()) {
			file.mkdir();
		}
		Reader fileReader = null;
		Writer fileWriter = null;
		File src = new File("C:\\windows\\system.ini");
		File dest = new File("C:\\Temp\\system.txt");
		try {
			fileReader = new FileReader(src);
			fileWriter = new FileWriter(dest);
			int readChar;
			while(true) {
				readChar = fileReader.read();
				if(readChar == -1) break;
				fileWriter.write((char)readChar);
			}
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
