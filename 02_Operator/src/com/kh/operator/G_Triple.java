package com.kh.operator;

import java.util.*;

public class G_Triple {
	
	/*
	 * 삼항 연산자 : 피 연산자가 3개 => 값 3개와 1개의 연산자로 이루어짐(조건문의 형식으로 쓰임)
	 * 
	 * 조건문 : 값에 따라서 연산을 처리하는 방식
	 *		  결과값이 true일 경우 첫 번쨰 문장을 처리 ~
	 *		  결과값이 false일 경우 두 번쨰 문장을 처리 ~
	 *
	 * [ 표현식 ]
	 * 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
	 */
	
	public void method1() {
		System.out.println("시즌 메뉴판 : ");
		System.out.println("1. 한교동 갈릭쉬림프 프레첼");
		System.out.println("2. 요거 젤리 소다 플랫치노");
		System.out.println("3. 케로케로케로피 멜론라떼");
		
		// Ctrl + Shift + o
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력해주세요 > ");
		int menuNo = sc.nextInt();
		
		String selectedMenu = (menuNo == 1) ? "한교동 갈릭쉬림프 프레첼을 주문하셨습니다."
							: (menuNo == 2) ? "요거 젤리 소다 플랫치노를 주문하셨습니다."
							: (menuNo == 3) ? "케로케로케로피 멜론라떼를 주문하셨습니다."
							: "없는 메뉴를 주문하셨습니다.";
		// 조건식 ? 조건식이 true일 경우 결과 값 : 조건식이 false일 경우 결과 값
		
		// 선택한 번호에 따라서 메뉴명을 출력
		// 1번 입력시 == " 한교동 갈릭쉬림프 프레첼를 주문하셨습니다."
		
		System.out.println(selectedMenu);
	}
	
	// 홀짝 구하기 
	
	public void method2() {
		
		// 사용자에게 정수 값을 하나 입력받아서 
		//입력 받은 정수가 홀 / 짝 판별해서 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 값을 하나 입력해주세요.");
		int inputNum = sc.nextInt();
		
		// num % 2 != 0
		// num % 2 == 1
		// ((num % 2) ==0) ==> 연산(판별)은 요걸하기로 결정
		String result = (inputNum % 2 == 0) ? "짝수입니다." : "홀수입니다.";
					
		System.out.println(result);
	}
	
	public void practice() {
		
		// 사용자에게 알파벳 한 글자를 입력받아서 
		// 입력받은 알파벳이 소문자인지 / 대문자인지 판별 후 출력
		
		// 출력형식
		// XXX(사용자가 입력한 알파벳)은(는) 소문자 / 대문자 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 한 글자를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch);
		
		String result = ( 'A' <= ch && ch <= 'Z' ) ? "대문자입니다."
					  : ( 'a' <= ch && ch <= 'z' ) ? "소문자입니다."
                      : "알파벳이 아닙니다.";
		
		System.out.println("사용자가 입력한 " + ch + "은(는) " + result + "입니다.");
		
		
		
	}

}
