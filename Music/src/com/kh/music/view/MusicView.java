package com.kh.music.view;

import java.util.*;

import com.kh.music.controller.*;
import com.kh.music.model.vo.*;

public class MusicView {

	private Scanner sc = new Scanner(System.in);

	private MusicController mc = new MusicController();

	public void mainMenu() {
		while (true) {

			System.out.println("====== 메인메뉴 ======");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("9. 프로그램 종료");

			System.out.print("번호를 입력해주세요 > ");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 9:
				System.out.println("프로그램이 종료되었습니다. ");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. ");
			}
		}
	}

	public void addList() {
		System.out.print("곡 명을 입력해주세요 > ");
		String title = sc.nextLine();

		System.out.print("가수 명을 입력해주세요 > ");
		String singer = sc.nextLine();

		int result = mc.addList(new Music(title, singer));
		System.out.println(result > 0 ? "추가 성공" : "추가 실패");
	}

	public void addAtZero() {
		System.out.print("곡 명을 입력해주세요 > ");
		String title = sc.nextLine();

		System.out.print("가수 명을 입력해주세요 > ");
		String singer = sc.nextLine();

		int result = mc.addAtZero(new Music(title, singer));
		System.out.println(result > 0 ? "추가 성공" : "추가 실패");
	}

	public void printAll() {
		System.out.println("***** 전체 곡 목록 출력 *****");
		List<Music> list = mc.printAll();
		if (list.isEmpty()) {
			System.out.println("리스트가 비었습니다.");
		} else {
			for (Music m : list) {
				System.out.println(m);
			}
		}
	}

	public void searchMusic() {
		System.out.println("***** 특정 곡 검색 *****");
		System.out.print("검색하실 곡 이름일 입력해주세요 > ");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);
		System.out.println(m == null ? "검색한 곡이 없습니다" : m);
	}

	public void removeMusic() {
		System.out.println("***** 특정 곡 삭제 *****");

		System.out.print("삭제하실 곡 이름을 입력해주세요. > ");
		String removeTitle = sc.nextLine();
		Music m = mc.removeMusic(removeTitle);
		System.out.println(m == null ? "삭제할 곡이 없습니다" : m + "을(를) 삭제했습니다.");

	}

	public void setMusic() {
		System.out.println("****** 특정 곡 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();

		System.out.print("수정할 곡 명 : ");
		String newTitle = sc.nextLine();

		System.out.print("수정할 가수 명 : ");
		String newSinger = sc.nextLine();

		Music m = mc.setMusic(title, new Music(newTitle, newSinger));
		System.out.println(m == null ? "수정할 곡이 없습니다." : m + "의 값이 변경되었습니다.");
	}

}
