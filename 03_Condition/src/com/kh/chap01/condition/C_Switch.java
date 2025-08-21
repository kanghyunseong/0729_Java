package com.kh.chap01.condition;

import java.util.*;

public class C_Switch {

	/*
	 * 스위치(전환하다, 바뀌다)
	 */
	
	public void method0() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇층 가세요(B1 / B2 / B3)");
		String floor = sc.nextLine();
		System.out.print(floor);
		
		switch(floor) {
        case "B1":
            System.out.println("지하 1층입니다. 문이 열립니다.");
            break;
        case "B2":
            System.out.println("지하 2층입니다. 문이 열립니다.");
            break;
        case "B3":
            System.out.println("지하 3층입니다. 문이 열립니다.");
            break;
        default:
            System.out.println("해당 층은 없습니다. 다시 입력해주세요.");
            break;
		}
		
		/*
		 * switch 문
		 * 
		 * [ 표현식 ]
		 * 
		 * switch() {
		 * case 정수, 문자, 실수, 문자열 : 실행할 코드;
		 * }
		 * 
		 * switch(정수 || 문자 || 실수 || 문자열) {
		 * case 값1 : 실행할코드 a // 동등비교대상 == 값1 true일 경우 실행할코드 a를 수행
		 * break;
		 * case 값2 : 실행할코드 b // 동등비교대상 == 값2 true일 경우 실행할코드 b를 수행
		 * break;
		 * case 값n : 실행할코드 n // 동등비교대상 == 값n true일 경우 실행할코드 n를 수행
		 * break;
		 * default : 실핼할코드; // == else
		 * 
		 * }
		 */
	}
	
	// 메뉴 주문
	// 부대찌개, 떡갈비, 제육볶음, 칼국수, 수제비
	public void method1() {
		
		
		// 사용자에게 구매할 음식의 이름을 입력받아
		// 각 음식마다 가격을 출력해줄 것
		
		// 부대찌개 떡갈비 제육볶음 칼국수 수제비
		// 11000  13000 9000 10000 7000
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주문하실 음식의 이름을 입력해주세요 (부찌, 떡갈비, 제육, 칼국수, 수제비) > ");
		String menuName = sc.nextLine();
		
		// 1번 경우 
		
//		switch(menuName) {
//		case "부대찌개" : 
//			System.out.println("주문하신 음식은 : " + menuName);
//			System.out.println("금액 : 11000");
//			break;
//		case "떡갈비" : 
//			System.out.println("주문하신 음식은 : " + menuName);
//			System.out.println("금액 : 13000");
//			break;
//		case "제육볶음" : 
//			System.out.println("주문하신 음식은 : " + menuName);
//			System.out.println("금액 : 7000");
//			break;
//		case "칼국수" : 
//			System.out.println("주문하신 음식은 : " + menuName);
//			System.out.println("금액 : 10000");
//			break;
//		case "수제비" : 
//			System.out.println("주문하신 음식은 : " + menuName);
//			System.out.println("금액 : 7000");
//			break;
//		default : 
//			System.out.println("그런 메뉴는 없습니다.");
//		}
		
		// 중복제거하기
		
		int price = 0;
		
		switch(menuName) {
		case "부대찌개" :
			price = 11000;
			break;
		case "제육" :
			price = 7000;
			break;
		case "떡갈비" :
			price = 13000;
			break;
		case "칼국수" :
			price = 7000;
			break;
		case "수제비" :
			price = 7000;
			break;
		default :
			System.out.println("그런 메뉴 없습니다.");
		return; // 현재 실행되고 있는 메소드 영역을 아예 빠져나간다.
				// 메서드를 호출한 곳으로 돌아감
		}
		
		System.out.println("주문하신 음식은 : " + menuName);
		
		if(price != 0) {
			System.out.println("금액은 : " + price + "원 입니다.");
		}
	}
	
	//3번쩁 방법
//	int result = switch(menuName) {
//	case "제육", "수제비", "칼국수" -> 3000;
//	case "떡갈비", "부찌" -> 5000;
//	default -> 0;
//	}
	
	
	public void login() {
		
		// 로그인 구현하기
		// 기획 / 설계
		
		// 기획 -> 뭘 만들지?
		// 설계 -> 어떻게 만들지?
		
		// 로그인 사용 -> 분석 -> 이해
		// 로그인이란 뭘까 ...?
		
		// 아이디 비밀번호
		// 		입력
		
		// 로그인 구현할 때 필요한 값 :
		// 1. 사용자가 입력한 아이디 값 	-> 문자열 자료형
		// 2. 사용자가 입력한 비밀번호 값	-> 문자열 자료형
		
		// 로그인 시 필요한 선행 작업 :
		// 회원가입
		
		// 1. 회원가입 시 사용자가 원하는 아이디 값과 비밀번호 값을 입력하여 회원가입을 진행함
		// 2. 가입 시 입력했던 아이디와 비밀번호를 둘 다 정확히 입력한다면 로그인 성공 화면 출력
		// 3. 가입 시 입력했던 아이디 또는 비밀번호가 하나라도 일치하지 않다면 로그인 실패 화면 출력
		
		
		String id = "uesr01";
		String password = "pass01";
		String name = "홍길동";
		
		// ----------------------------------------------------
		
		System.out.println("KH업텐");
		System.out.println("==================");
		System.out.println("로그인 서비스 입니다.");
		System.out.println("==================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.print("아이디 > ");
		String uesrId = sc.nextLine();
		
		System.out.println("--------------------");
		System.out.print("비밀번호 > ");
		String uesrPwd = sc.nextLine();
		
		System.out.println("--------------------");
		
		// 만약에 사용자가 로그인 시 입력한 아이디값과 회원가입시 가입한 아이디값이 동일하고
		// 사용자가 로그인 시 비밀번호 값과 회원가입 시 가입한 비밀번호 값이 동일하면
		// 로그인 성공
		
		if(uesrId.equals(id) && uesrPwd.equals(password)) {
			System.out.println("로그인 성공 ~ " + name + "님 환영합니다.");
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
		// 기본자료형 : boolean, char, byte, short, int, long, float, double
		// => 기본자료형의 경우 동등 비교 연사자라를 수행하는데 있어 문제가 없음( ==, != )
		
		// 참조자료형 : 그 외
		// => 동등비교 연산자(==, !=)를 통해서 값을 비교하는것이 불가능
		// 실제 변수에 담기는 값이 주소값이기 떄문
		// 문자열의 값을 비교 : equals() => true / false
		
	}
}
