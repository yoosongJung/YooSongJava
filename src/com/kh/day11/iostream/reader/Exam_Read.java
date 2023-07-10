package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		Reader reader = null;
		// Cannot instantiate the type Reader
		
		try {
			// 이런 것들을 Checked Exception이라고 함.
			// Unhandled exception type FileNotFoundException
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			
			// Unhandled exception type IOException
			while(true) {
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
