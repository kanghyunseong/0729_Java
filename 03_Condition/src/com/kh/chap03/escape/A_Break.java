package com.kh.chap03.escape;

import java.util.*;

public class A_Break {
	/*
	 * ** 주의사항 : switch문 내부에 작성하는 break문과는 구분을 해야할 필요가 있음
	 * 			  switch문 내부에 있는 break는 switch문을 빠져나가는 용도로 사용
	 * 
	 * break : break문을 만나는 순간 " 가장 가까운 반복문 "을 빠져나감
	 * 		   break;문이 속해 있는 반복문 "한 겹"만 빠져나감
	 * 
	 */
	
	public void method1() {
		//System.out.println("안뇽 나는 메서드");
		
		// 무한 반복하면서 랜덤한 정수(1 ~ 100)를 생성해서 출력하다가
		// 50이 생성되면 반복을 중단 !
		
		while(true) {
			int num = (int)(Math.random() * 100) +1;
			
			System.out.println(num);
			
			// 생성된 정수값이 50이면 멈춰!
			if(num == 50) {
				System.out.println("멈춰!");
				break;
			}
			
		}
		
	}
	
	public void method2() {
		
		// 무한 반복하면서 사용자에게 매 번 문자열을 입력받은 후 
		// 해당 문자열의 길이를 출력
		// 단, 사용자가 입력한 문제열이 "exit"과 같다면 반복을 종료

		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아무거나쓰셈(종료를 원하신다면 'exit'을 입력해주세요) >");
			String keyword = sc.nextLine();
			
			System.out.println(keyword + "은(는) " + keyword.length() + "글자 입니다.");
		
			if(keyword.equals("exit")) {
				System.out.println("프로그램을 종료");
				break;
			}
		}
	}
	
	// 매 번 사용자로부터 정수값을 입력받고
	// 만약 입력한 숫자가 0보다 작다면 프로그램을 종료합니다 라는 문구를 출력하고 종료하시오!
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("0보다 큰 정수를 입력해주세요(프로그램을 종료하고싶으면 0보다 작은 숫자를 입력해주세요) >");
			
			int number = sc.nextInt();
			if(number < 0) {
				System.out.println("프로그램종료");
				break;
			}
		}
	}
	
	/*
	 * 사용자로부터 한 개의 정수값을 입력받아서
	 * 입력받은 숫자부터 1까지의 모든 숫자를 출력해보아요
	 * 
	 * 단, 입력받는 정수는 1보다 커야합니다.
	 * 
	 * 만약 1 미만의 숫자를 입력받았다면 "1이상의 숫자를 입력해주세요" 라고 출력한 뒤
	 * 다시 사용자에게 값을 ㅇ비력ㅂ다을 수 있도록 만들어보아요
	 * 
	 * 출력예시 )
	 * 1이상의 숫자를 입력하세요 > 4
	 * 4 3 2 1 
	 * 
	 *
	 */
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 입력하기 > ");
			
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}else {
				for(int i = num; i >= 1; i--) {
					System.out.print(i+ " ");
				}System.out.println();
			}
		} 
	}
}


