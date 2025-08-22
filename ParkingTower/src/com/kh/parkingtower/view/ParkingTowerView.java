package com.kh.parkingtower.view;

import java.util.*;


import com.kh.parkingtower.controller.*;
import com.kh.parkingtower.model.vo.*;

public class ParkingTowerView {

	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();

	public void mainMenu() {
		while (true) {
			try {
				System.out.println("\n===== 주차타워 관리 프로그램 =====");
				System.out.println("1. 차량 주차");
				System.out.println("2. 차량 출차");
				System.out.println("3. 주차된 차량 검색");
				System.out.println("4. 전체 출력");
				System.out.println("0. 프로그램 종료");
				System.out.print("메뉴 선택 > ");

				int menu = sc.nextInt();
				sc.nextLine();

				switch (menu) {
				case 1:
					insertCar();
					break;
				case 2:
					deleteCar();
					break;
				case 3:
					searchCar();
					break;
				case 4:
					selectList();
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해야 합니다.");
				sc.nextLine();
			} 
		}
	}

	public void insertCar() {
		try {
			
			System.out.print("차량 번호를 입력해주세요 > ");
			int carNum = sc.nextInt();
			sc.nextLine();
			
			System.out.print("1.경차 / 2.세단 / 3.SUV / 4.트럭 > ");
			int carType = sc.nextInt();
			sc.nextLine();
			
			System.out.print("차량 운전자 이름을 입력해주세요 > ");
			String owner = sc.nextLine();
			
			if(carType < 1 || carType > 4) {
				System.out.println("잘못된 차량 종류입니다.");
				return;
			}
			
			ptc.insertCar(carNum, carType, owner);
			
			System.out.println("주차 완료");
			
		} catch(InputMismatchException e) {
			System.out.println("입력 값이 잘못 되었습니다.");
		}

	}

	public void deleteCar() {
		try {
			
			System.out.print("출차하실 차량 번호를 입력해주세요 > ");
			int carNum = sc.nextInt();
			sc.nextLine();
			
			int result = ptc.deleteCar(carNum);
			System.out.println(result > 0 ? carNum + "출차 완료" : carNum + "출차 실패");
			
		} catch(InputMismatchException e) {
			System.out.println("차량 번호는 숫자로 입력하세요.");
		}
	}

	public void searchCar() {
		try {
			
			System.out.print("차량 소유자 이름을 입력해주세요 >");
			String owner = sc.nextLine();
			 ArrayList<Car> list = ptc.searchCar(owner);
			
			 if(list.isEmpty()) {
				 System.out.println("검색된 차량이 없습니다.");
			 }else {
				 for(Car c : list) {
					 System.out.println(c);
				 }
			 }
		}catch(InputMismatchException e) {
			System.out.println("소유자 이름은 한글로 입력해주세요.");
		}
	}

	public void selectList() {
		System.out.println("차량 목록 보기");
		ArrayList<Car> list = ptc.selectList();
		if(list.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			for(Car c : list) {
				System.out.println(c);
			}
		}
	}
}
