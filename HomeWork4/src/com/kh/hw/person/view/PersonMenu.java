package com.kh.hw.person.view;

import java.util.*;

import com.kh.hw.person.controller.*;
import com.kh.hw.person.model.vo.*;

public class PersonMenu {

	Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {

		while (true) {
			int[] counts = pc.personCount();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + counts[0] + "명입니다.");

			System.out.println("사원은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + counts[1] + "명입니다.");

			System.out.println("\n1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다. ");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		// System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		// System.out.println("현재 저장된 학생은 M명입니다.");
	}

	public void studentMenu() {
		while (true) {
			int studentCount = pc.personCount()[0];
			System.out.println("\n1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");

			if (studentCount >= 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}

			System.out.print("메뉴 번호 >");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1 && studentCount < 3) {
				insertStudent();
			} else if (choice == 2) {
				printStudent();
			} else if (choice == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void employeeMenu() {
		while (true) {
			int employeeCount = pc.personCount()[1];
			System.out.println("\n1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");

			if (employeeCount >= 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}

			System.out.print("메뉴 번호 > ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1 && employeeCount < 10) {
				insertEmployee();
			} else if (choice == 2) {
				printEmployee();
			} else if (choice == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void insertStudent() {
		while (true) {

			int counts = pc.personCount()[0];

			if (counts >= 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				return;
			}

			System.out.print("학생 이름 : ");
			String name = sc.next();

			System.out.print("학생 나이 : ");
			int age = sc.nextInt();

			System.out.print("학생 키 : ");
			double height = sc.nextDouble();

			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();

			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();

			System.out.print("학생 전공 : ");
			String major = sc.nextLine();

			pc.insertStudent(name, age, height, weight, grade, major);

			if (pc.personCount()[0] >= 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				return;
			}

			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			String ans = sc.nextLine();

			if (ans.equals("N") || ans.equals("n")) {
				break;
			}
		}
	}

	public void printStudent() {
		Student[] students = pc.printStudent();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println(students[i]);

			}
		}
	}

	public void insertEmployee() {

		while (true) {
			int counts = pc.personCount()[1];
			if (counts >= 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				return;
			}

			System.out.print("사원 이름 : ");
			String name = sc.next();

			System.out.print("사원 나이 : ");
			int age = sc.nextInt();

			System.out.print("사원 키 : ");
			double height = sc.nextDouble();

			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();

			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();

			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			pc.insertEmployee(name, age, height, weight, salary, dept);

			if (pc.personCount()[1] >= 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
				return;
			}

			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char ans = sc.nextLine().charAt(0);
			if(ans == ('N') || ans == ('n')) {
				break;
			}
		}
	}

	public void printEmployee() {
		Employee[] employee = pc.printEmployee();
		for(int i = 0; i < employee.length; i++) {
			if(employee[i] != null) {
				System.out.println(employee[i]);
			}
		}
	}
}
