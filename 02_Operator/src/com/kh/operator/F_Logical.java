package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
	 * 
	 * [ 표현법 ]
	 * 
	 * 논리값 논리연산자 논리값 => 결과값도 논리값
	 * 
	 * 종류
	 * 
	 * 1. AND연산자 : 논리값 && 논리값
	 * 좌항과 우항의 값이 모두 true여야만 최종 결과값이 true
	 * 
	 * 2. OR연산자 : 논리값 || 논리값
	 * 좌항과 우항의 값 중 하나라도 true일 경우 최종 결과값이 true
	 */
	
	//AND
	public void method1() {
		
		// 계획 
		// 사용자에게 정수값을 하나 입력받은 후
		// 사용자가 입력한 정수값이 0보다 크면서 짝수인지 판별할 것
		// 그리고 나서 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력해주세요 > ");
		
		int number = sc.nextInt();
		
		System.out.println("사용자가 입력한 숫자가 0보다 큽니까? : " + (number > 0));
		System.out.println("사용자가 입력한 숫자가 짝수인가요? : " + (number % 2 == 0));
		
		boolean result = (number > 0) && (number % 2 ==0);
		
		System.out.println("사용자가 입력한 정수값이 0보다 크면서 짝수인가요? : " + result);
	}
	
	public void method2() {
		
		// 사용자에게 정수 값을 입력받아서
		
		// 변수에 대입한 뒤
		
		// 출력해보세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 100사이의 숫자를 입력해주세요 > ");
		int number = sc.nextInt();
		
		System.out.println("입력한 정수값 : " + number);
		
		// 사용자가 입력한 값이 1 ~ 100 사이의 값인지 판별하여 출력해줄 것
		// 1_1. 사용자가 입력한 정수 == number 
		// 1_2. 1
		// 1_3. 100
		
		// 1 <= 사용자가 입력한 값 <= 100
		// 1<= number <= 100
		
		// 2_1 (0 < number ) && ( number < 101)
		// 2_2 (100 >= number) && (1 <= number)
		// 2_3 (1 <= number) && (number <= 100)
		boolean result = (1 <= number) && (number <= 100);
		
		System.out.println("사용자가 입력한 값이 1 ~ 100 사이의 값인가요? : " + result );
	}
	
	// OR 연산자
	public void method3() {
		
		// 사용자에게 한 글자를 입력받아서 
		// 입력받은 값이 'A' 또는 'a'인지 확인해서 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 글자를 입력해주세요 > ");
		
		char ch = sc.nextLine().charAt(0);
		
		/*
		 * String str = "KH정보교육원"
		 * char ch = str.cahrAt(5);
		 * System.out.println(ch);
		 * index : 0부터 시작
		 */
		
		System.out.println("입력한 글자 : " + ch);
		
		System.out.println(
		        (ch == 'A' || ch == 'a') 
		            ? "입력한 글자는 'A' 또는 'a'입니다."
		            : "입력한 글자는 'A' 또는 'a'가 아닙니다."
		    );
		
	}
	
	/*
	 * AND(&&) : 두 개의 조건이 모두 true일 경우 true
	 * 
	 * true && true : true
	 * true && false : false
	 * false && false : false
	 * false && true : false
	 * 
	 * OR(||) : 두 개의 조건 중 하나라도 true일 경우 true
	 * 
	 * true || true : true
	 * true || false : true
	 * false || false :  false
	 * false || true : true
	 */
	
	public void tip() {
		
		int num = 10;
		boolean result = false && (num > 0);
		boolean result2 = (num < 0) && (num == 10);
	}
}
