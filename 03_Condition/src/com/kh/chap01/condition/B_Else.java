package com.kh.chap01.condition;

import java.util.*;

public class B_Else {
	
	/*
	 * if ~ else 
	 * 
	 * [ 표현법 ] 
	 * 
	 * if(조건식) {
	 * 		조건식의 결과가 true였을 떄 실행할 코드  -a
	 * } else {
	 * 		조건식의 결과가 false였을 떄 실행할 코드	-b
	 * }
	 * 
	 * -> 조건식의 결과가 true일 경우 a를 실행
	 * -> 조건식의 결과가 false일 경우 b를 실행
	 */
	
	public void method1() {
		
		// 사용자에게 정수를 입력받아서 0보다 큰지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 주세요 > ");
		
		int number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("0보다 큰 정수입니다.");
		}else {
			System.out.println("0보다 작은 정수입니다.");
		}
		// if문의 조건식의 결과가 true일 경우 => else블럭을 건너 뜀
		// 불필요한 연산이 줄어듬 => 처리속도가 향상
	}
	/*
	 * if ~ else if 문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식1) {
	 * 		조건식 1이 true일 경우 실행할 코드
	 * } else if (조건식 2) {
	 * 		조건식 2가 true일 경우 실행할 코드
	 * } else if (조건식 3) {
	 * 		조건식 3이 true일 경우 실행할 코드
	 * }else if (조건식 4) {
	 * 		조건식 4이 true일 경우 실행할 코드
	 * }else {
	 * 		앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드
	 * }
	 * 
	 * 
	 */
	
	
	public void method2() {
		
		// 정수를 입력받아서 0보다 큰지 / 0인지 / 0보다 작은지 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요! > " );
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("0보다 큰 정수입니다.");
		}else if(num == 0) {
			System.out.println("입력한 정수는 0입니다.");
		}else {
			System.out.println("0보다 작은 정수입니다.");
		}
	}
	
	public void ageCheck() {
		
		//사용자에게 나이를 입력받고
		//입력받은 나이에 따라서 각기 다른 내용을 출력해주세요
		// 어린이 1~12 / 청소년 13 ~17 / 성인 18 ~
		// 0 살, - : 외계인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요 > ");
		int age = sc.nextInt();
		
		// 1번 케이스
		if((1 <= age) && (age <= 12)) {
			System.out.println("어린이입니다.");
		}else if ((13 <= age) && (age <= 17)) {
			System.out.println("청소년입니다.");
		}else if((18 <= age)) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("외계인입니다.");
		}
		
		
		// 2번 케이스
		if(age < 0) {
			System.out.println("올바론 나이를 입력해주세요.");
		} else if(age >= 18) {
			System.out.println("성인입니다.");
		} else if(age <= 12) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("청소년입니다.");
		}
	}
}
