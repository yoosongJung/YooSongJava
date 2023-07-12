package com.kh.day13.swing.student.run;

import java.util.List;

import com.kh.day13.swing.student.controller.StudentController;
import com.kh.day13.swing.student.model.vo.Student;
import com.kh.day13.swing.student.view.StudentView;

public class Run {
	public static void main(String[] args) {
		StudentController sController = new StudentController();
		StudentView view = new StudentView();
		Student std = null;
		end :
			while(true) {
				// 메뉴 출력
				// 메뉴 선택
				int choice = view.printMenu();
				
				// 메뉴에 따라 기능 구현
				switch(choice) {
				case 1: 
					std = view.inputInfo();
					sController.addStudent(std);
					view.printMessage("학생정보 입력 성공");
				break;
				case 2: 
					String name = view.searchInfoByName();
					List<Student> searchList = sController.printOneStd(name);
					view.showAllStudentList(searchList);
					view.printMessage("학생정보 출력 성공");
				break;
				case 3: 
					List<Student> allList = sController.printAllInfo();
					view.showAllStudentList(allList);
					view.printMessage("학생정보 출력 성공");
				break;
				case 4: 
					List<Student> reExamList = sController.checkPass();
					view.showAllStudentList(reExamList);
					view.printMessage("재시험자 출력 성공");
				break;
				case 5: view.printMessage("프로그램이 종료되었습니다.");
				break end;
				}
			}
	}
}
