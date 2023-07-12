package com.kh.day13.swing.student.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day13.swing.student.model.vo.Student;

public class StudentController {
	List<Student> stdList;
	
	public StudentController() {
		stdList = new ArrayList<Student>();
	}
	
	public void addStudent(Student stdOne) {
		stdList.add(stdOne);
	}
	
	public List<Student> printOneStd(String searchName) {
		List<Student> findList = new ArrayList<Student>();
		for(Student mOne : stdList) {
			if(mOne.getName().equals(searchName)) {
				findList.add(mOne);
			}
		}
		return findList;
	}
	
	public List<Student> printAllInfo() {
		return stdList;
	}
	
	public List<Student> checkPass() {
		List<Student> reExam = new ArrayList<Student>();
		for(Student student : stdList) {
			int score1 = student.getScore1();
			int score2 = student.getScore2();
			if(score1 < 60 || score2 < 60) {
				reExam.add(student);
			}
		}
		return reExam;
	}
}
