package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	//int[] counts = new int[2];
	
	// 1번 방법
	public int[] personCount() {
		int studentCount = 0;
		int employeeCount = 0;
		int[] counts = new int[2];

		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				studentCount++;
			}
		}

		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				employeeCount++;
			}
		}
		
		counts[0] = studentCount;
		counts[1] = employeeCount;

		return counts;
	}
	
	/*
	// 2번 방법
	public int[] personCount() {
		
		int[] counts = new int[2];

		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				counts[0]++;
			}
		}

		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				counts[1]++;
			}
		}
		return counts;
	}
	*/
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}

	public Student[] printStudent() {
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
	
	
}
