package com.kh.idol.view;

import java.util.*;

import com.kh.idol.controller.*;
import com.kh.idol.model.vo.*;

public class IdolView {

	// 필드부
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();

	// 생성자

	// 메소드부
	// 프로그램 실행했을 떄 가장 먼저 보여질 화면을 출력해주는 기능
	public void mainMenu() {

		System.out.println("\n\n ‼ aespa 커뮤니티에 오신것을 환영합니다 ‼ ");

		while (true) {

			System.out.println("이용하실 서비스를 선택해주세요.");
			System.out.println("1. 에스파 정보보기");
			System.out.println("2. 회원가입");
			System.out.println("3. 로그인");
			System.out.println("4. 게시판 서비스");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 번호 입력 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				info();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}
	}

	private void info() {
		System.out.println();
		System.out.println("정보보기 서비스입니다.");
		System.out.println("이용하실 메뉴를 선택해주세요!");
		System.out.println("1. 카리나의 정보보기");
		System.out.println("2. 지젤의 정보보기");
		System.out.println("3. 윈터의 정보보기");
		System.out.println("4. 닝닝의 정보보기");
		System.out.println("5. 모든 멤버 정보보기");
		System.out.println("6. 메인메뉴로 돌아가기");
		System.out.print("이용하실 메뉴를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		sc.nextLine();

		switch (menuNo) {
		case 1, 2, 3, 4:
			findMember(menuNo);
			break;
		case 5:
			findAll();
			break;
		case 6:
			return;
		}

	}
	
	private void findMember(int menuNo) {
		ic.findMember(menuNo);
	}

	private void findAll() {
		List<Idol> aespa = ic.findAll();

		if (aespa.isEmpty()) {
			System.out.println("멤버가 남아있지 않습니다...");
		} else {

			for (Idol i : aespa) {
				System.out.println(" 💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖");
				System.out.println();
				System.out.println("프로필 이미지 : ");
				System.out.println(i.getImage());
				System.out.println();
				System.out.println("이름 : " + i.getName());
				System.out.println("포지션 : " + i.getPosition());
				System.out.println("전투기술 : " + i.getSkill());
			}
			System.out.println(" 💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖💖");

		}

	}

}
