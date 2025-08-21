package com.kh.chap01.condition;

import java.util.*;

public class A_If {
	
	/*
	 * ( 단일 ) if문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 		
	 * 		조건식이 true일 경우 실행하고자 하는 코드;
	 * 
	 * }
	 * 
	 * => 조건식의 결과가 true일 경우 : if문 Scope({})안의 코드가 수행
	 * => 조건식의 결과가 false일 경우 :if문 Scope({})를 건너뜀!
	 * 
	 */
	
	public void method1() {
		
		//System.out.println("모범시민맞다 ~~");
		
		if(0 < 1) {
			System.out.println("0이 1보다 작아용");
		}
		
		// if문의 조건식 자리에는 결론적으로 true 아니면 false값이 들어가도록 만들어야함!
		
		if(false) {
			System.out.println("얘는 죽었다 깨나도 안나옴");
		}
		
		if(true) {
			System.out.println("조건식 자리에는 최종적으로 true가 와야함");
		}
	
	}
	
	public void method2() {
		
		boolean loginCheck = false; //로그인 상태를 저장해둔 변수
		
		if(loginCheck == false) {
			System.out.println("네이버를 더 안전하고 편리하게 이용해보세요. ");
			System.out.println("NAVER 로그인");
			System.out.println("아이디 찾기 | 비밀번호 찾기 | 회원가입");
		}
		
		if(loginCheck == true) {
			System.out.println("홍길동님 환영합니다 :) ");
			System.out.println("메일 | 카페 | 블로그 | 쇼핑 | 예약");
		}
	}
	
	public void lunchMenu() {
		
		// 오늘의 날씨를 입력받아서
		
		// 점심메뉴를 추천해주는 프로그램
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘의 날씨를 입력해주세요 (더움 / 맑음 / 비옴) : ");
		
		String weather = sc.nextLine();
		
		
		
		if(weather.equals("더움")) {
			
			System.out.println("사용자가 입력한 날씨는 : " + weather + "입니다.");
			
			System.out.println("추천드릴 점심 메뉴는 냉면 입니다." );
			
		} else if(weather.equals("맑음")) {
			
			System.out.println("사용자가 입력한 날씨는 : " + weather + "입니다.");
			
			System.out.println("추천드릴 점심 메뉴는 김치찌개 입니다." );
			
		} else if(weather.equals("비옴")) {
			
			System.out.println("사용자가 입력한 날씨는 : " + weather + "입니다.");
			
			System.out.println("추천드릴 점심 메뉴는 김밥천국 스페셜 정식입니다." );
			
		} else {
			
			System.out.println("추천드릴 음식이 없습니다. ");
		}
		
		// 정리
		// 문자열값 비교
		// 동등 비교 연산자를(==)사용할 수 없음
		// == 대신 .equals()를 호출해야함
		// System.out.println(weather.equals("비옴"));
		
		// 조건
		// 만약에 사용자가 입력한 문자열이 "비옴"과 일치하다면
		// if weather "비옴" .equals()
		//김밥천국
	}
	
	public void method3() {
		
		// 사용자에게 정수값을 입력받아서 홀 / 짝을 판별 => 출력
		// if문을 이용해서 출력
		// 단, 입력받은 정수가 0보다 클 경우에만 조건문을 실행 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 > ");
		
		int inputNum = sc.nextInt();
		
//		if((inputNum % 2) == 0 && (inputNum > 0)) {
//			System.out.println("0보다 크면서 짝수입니다.");
//		}else if ((inputNum % 2) != 0 && (inputNum > 0 )) {
//			System.out.println("0보다 크면서 홀수입니다.");
//		}else
//			System.out.println("아무것도 해당되지 않습니다.");
		
		if(inputNum > 0) {
			if(inputNum % 2 == 0) {
				System.out.println("0보다 크면서 짝수입니다.");
			} else if(inputNum % 2 != 0) {
				System.out.println("0보다 크면서 홀수입니다.");
			}
			
		} else {
			System.out.println("0보다 작거나 같은 수입니다. 조건에 해당하지 않습니다.");
		}
	}
	
	public void method4() {
		
		// 1. 메뉴판 보여주기
		// 출력문 
		
		// 2. 메뉴번호로 메뉴 입력받기
		// Scanner 사용해서 nextInt()
		
		// 3. 수량 입력받기
		// Scanner 사용해서 nextInt()
		
		// 4. 조건문
		// if문을 이용해서 입력한 메뉴번호에 따라 메뉴명 대입하기
		// 혹시 없는 메뉴번호를 입력했다면 없는 메뉴라고 대입하기
		
		// 5. 출력해주기 
		// XXX메뉴를 XXX잔 주문하셨습니다. 출력해주기
		
		// 6. 진짜 주문할건지 물어보기 
		// 사용자한테 Y / N 입력받아서 확인하기
		
		// 7. 6번에서 입력받은 단일 문자가 'Y'또는 'y'와 일치하다면
		// 메뉴명과 수량과 가격 출력하기 if문 + 중첩 if문 + 출력문
		
		System.out.println("시즌 메뉴판 : ");
		System.out.println("1. 한교동 갈릭쉬림프 프레첼");
		System.out.println("2. 요거 젤리 소다 플랫치노");
		System.out.println("3. 케로케로케로피 멜론라떼");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력해주세요.");
		int menuNumber = sc.nextInt();
		
		System.out.print("메뉴 수량을(를) 입력해주세요.");
		int menuPoint = sc.nextInt();
		
		String menuName = "";
		int menuCup = 0;
		
		if(menuNumber == 1) {
			menuName = "한교동 갈릭쉬림프 프레첼";
			menuCup = menuPoint;
			
		} else if(menuNumber == 2) {
			menuName = "요거 젤리 소다 플랫치노";
			menuCup = menuPoint;
			
		} else if(menuNumber == 3) {
			menuName = "케로케로케로피 멜론라떼";
			menuCup = menuPoint;
			
		} else {
			System.out.println("없는메뉴입니다.");
		}
		System.out.println(menuName + "메뉴를 " + menuCup + "잔 주문하셨습니다.");
		
		System.out.print("정말로 주문하시겠습니까 ( Y / N)  > ");
		sc.nextLine();
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			int price = 0;
			if(menuNumber == 1) {
				price = 5000;
			}else if(menuNumber == 2) {
				price = 7000;
			}else if(menuNumber == 3) {
				price = 8000;
			}
			System.out.println("총 결제 금액은 " + (menuPoint * price) + "입니다.");
		}
	}
}
