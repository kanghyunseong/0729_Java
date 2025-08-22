package com.kh.libarary.view;

import java.util.*;

import com.kh.libarary.controller.*;
import com.kh.libarary.model.vo.*;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);

	BookController bc = new BookController();

	public void mainMenu() {
		while (true) {
			try {
				System.out.println("\n===== Welcome KH Library =====");
				System.out.println("1. 새 도서 추가");
				System.out.println("2. 도서 전체 조회");
				System.out.println("3. 도서 검색 조회");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 도서 명 오름차순 정렬");
				System.out.println("9. 종료");
				System.out.print("메뉴 번호 입력 : ");

				int menu = sc.nextInt();
				sc.nextLine();

				switch (menu) {
				case 1:
					insertBook();
					break;
				case 2:
					selectList();
					break;
				case 3:
					searchBook();
					break;
				case 4:
					deleteBook();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				}

			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("오류가 발생했습니다: " + e.getMessage());
			}
		}
	}

	public void insertBook() {
		try {
			System.out.println("===== 새로운 도서 추가 ===");
			System.out.print("도서명을 입력해주세요. > ");
			String title = sc.nextLine();

			System.out.print("저자명을 압력해주세요. > ");
			String author = sc.nextLine();

			System.out.print("장르를 입력해주세요 (1.인문 / 2.자연과학 / 3.의료 / 4.기타)\r\n" + "");
			int categoryNo = sc.nextInt();
			sc.nextLine();

			String category = "";

			if (categoryNo == 1) {
				category = "인문";
			} else if (categoryNo == 2) {
				category = "자연과학";
			} else if (categoryNo == 3) {
				category = "의료";
			} else {
				category = "기타";
			}

			System.out.print("가격을 입력해주세요 > ");
			int price = sc.nextInt();
			sc.nextLine();

			Book newBook = new Book(title, author, category, price);
			bc.insertBook(newBook);
			System.out.println("도서가 추가되었습니다.");

		} catch (InputMismatchException e) {
			System.out.println("숫자 입력이 잘못되었습니다.");
			sc.nextLine();
		}

	}

	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book b : bookList) {
				System.out.println(b);
			}
		}
	}

	public void searchBook() {
		System.out.print("검색할 도서명을 입력해주세요 > ");
		String keyword = sc.nextLine();

		ArrayList<Book> searchList = bc.searchBook(keyword);
		if (searchList.isEmpty()) {
			System.out.println("검색결과가 없어!!");
		} else {
			for (Book b : searchList) {
				System.out.println(b);
			}
		}
	}

	public void deleteBook() {

		System.out.print("삭제할 도서명을 입력 해주세요. > ");
		String title = sc.nextLine();
		
		System.out.print("삭제할 저자명을 입력 해주세요. >");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다. ");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다. ");
		}
	}
}