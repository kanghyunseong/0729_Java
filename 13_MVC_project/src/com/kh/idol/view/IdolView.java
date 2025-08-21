package com.kh.idol.view;

import java.util.*;

import com.kh.idol.controller.*;
import com.kh.idol.model.vo.*;

public class IdolView {

	// 필드부
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();

	// 로그인에 성공한 회원의 정보를 담아줄 필드
	private Fan loginFan;

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
				signUp();
				break;
			case 3:
				login();
				break;
			case 4:
				boardMenu();
				break;
			case 5:
				return;
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
		Idol idol = ic.findMember(menuNo);
		System.out.println("💝" + idol.getName() + "💝");
		System.out.println("🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵");
		System.out.println(idol.getImage());
		System.out.println("포지션 : " + idol.getPosition());
		System.out.println("전투 기술 : " + idol.getSkill());
		System.out.println("🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵🔵");
		System.out.println();
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

	public void signUp() {
		System.out.println("\n에스파 커뮤니티에 오신것을 환영합니다.");
		System.out.println("회원가입 서비스입니다.");

		String userId;
		while (true) {

			// 제약조건 => 아이디는 4글자에서 10글자 사이일 것
			// => 아이디는 다른 Fan의 아이디와 중복되면 안될 것
			System.out.print("가입하실 아이디를 입력해주세요 > ");
			userId = sc.nextLine();
			// 하나의 메소드는 하나의 기능만을 수행해야한다.
			// 하지만 지금 이 회원가입 메소드는
			// 회원 가입 뿐만 아니라 아이디값에 대한 유효성 검증을 진행하고있다.
			// 이렇게 되면 이 메소드는 하는 일이
			// 1. 유효성 검증
			// 2. 회원가입
			// 두개가 되어버리기 떄문에 하는 일이 너무 많은 것이다.
			// 1. 아이디는 4글자에서 10글자 사이만 가능
			if (!(3 < userId.length() && userId.length() < 11)) {
				System.out.println("아이디는 4글자에서 10자 사이만 사용 가능합니다.");
				continue;
			}

			// 2. 중복체크
			boolean duplicatedId = ic.checkId(userId);

			if (duplicatedId) {
				System.out.println("이미 존재하는 아이디 입니다");
			} else {
				System.out.println("사용 가능한 아이디입니다.");
				break;
			}
		}

		System.out.print("비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();

		System.out.print("닉네임을 입력해주세요 > ");
		String nickName = sc.nextLine();

		// 뷰는 일단 자신의 할일을 1절까지 마무리함
		// 사용자가 입력한 아이디와 비밀번호와 닏네임을 가지고 Fan객체를 생성해서
		// Controller에 있는 fans라는 List의 요소로 추가
		boolean result = ic.signUp(userId, userPwd, nickName);
		if (result) {
			System.out.println("회원가입에 실패했씁니다 다시시도해주세요");
		} else {
			System.out.println("추카포카양파링~~");
		}
	}

	private void login() {
		System.out.println("\n 로그인 서비스 입니다.");

		System.out.print("아이디를 입력하세요 > ");
		String userId = sc.nextLine();

		System.out.print("비밀번호를 입력하세요 > ");
		String userPwd = sc.nextLine();

		Fan fan = ic.login(userId, userPwd);

		if (fan != null) {
			System.out.println(fan.getNickName() + "님 환영합니다.");
			loginFan = fan;
		} else {
			System.out.println("로그인 실패");
		}

	}

	private void boardMenu() {
		while (true) {

			System.out.println("\n 에스파 게시판입니다. ");
			System.out.println("이용하실 메뉴를 선택해주세요. ");
			System.out.println("1. 게시글 작성 ");
			System.out.println("2. 게시글 전체 조회 ");
			System.out.println("3. 게시글 상세 조회 ");
			System.out.println("4. 메인메뉴로 돌아가기 ");
			System.out.print("당신의 선택은 ? >  ");

			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:
				post();
				break;
			case 2:
				selectBoardList();
				break;
			case 3:
				findByBoardNo();
				break;
			case 4:
				return;
			}
		}
	}

	private void post() {

		System.out.println("\n게시글 작성 서비스");

		// 전제조건 : 로그인한 사용자만 게시글을 작성할 수 있음
		if (loginFan != null) {

			System.out.println("게시글 제목을 입력해주세요 > ");
			String boardTitle = sc.nextLine();

			System.out.println("게시글 내용을 입력해주세요 > ");
			String boardContent = sc.nextLine();

			ic.post(boardTitle, boardContent, loginFan.getUesrId());

			System.out.println("게시글 작성 성공 ~~!");

		} else {
			System.out.println("로그인 후 이용가능한 서비스 입니다.");
		}
	}

	private void selectBoardList() {

		System.out.println();
		System.out.println("\n전체 게시글 목록입니다.");
		System.out.println();

		List<Board> boardList = ic.selectBoardList();

		if (boardList.isEmpty()) {
			System.out.println("게시글이 아직 존재하지 않습니다");
			System.out.println();
			System.out.println("첫 게시글의 주인공이 되어보세요");
		} else {
			for (Board board : boardList) {
				System.out.print("글 번호 : " + board.getBoardNo() + "\t");
				System.out.print("글 제목 : " + board.getBoardTitle() + "\t");
				System.out.print("작성자 : " + board.getUserId() + "\t");
				System.out.print("작성일 : " + board.getCreateDate() + "\t");
				System.out.println();
			}
		}
	}
	
	private void findByBoardNo() {
		System.out.println("\n게시글 상세 보기 서비스 입니다.");
		
		selectBoardList();
		
		System.out.print("상세 보기를 할 번호를 입력해주세요 > ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Board board = ic.findByBoardNo(boardNo);
		
		if(board != null) {
			System.out.println("==============");
			System.out.println(boardNo + "번 게시글 상세보기");
			// 4개 중에 하나 랜덤한 사진
			System.out.println("\n제목" + board.getBoardTitle());
			System.out.println("\n내용" + board.getBoardContent());
			System.out.println("\n 작성자 : " + board.getUserId() + "\t 작성일 : " + board.getCreateDate());
			
			
			
		} else {
			System.out.println(boardNo + "번 게시글은 존재하지 않습니다.");
		}
	
	
	
	
	
	
	
	
	}
}
