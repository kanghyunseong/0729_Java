package com.kh.chap04.run;

import java.util.*;

import com.kh.chap04.controller.*;

class Run {

	public static void main(String[] args) {
		
		System.out.println(StaticController.str);

		
		FieldController fc = new FieldController(); 
		// 1. FieldController 자료형으로 fc라는 이름의 지역변수를 선언
		// 2. 객체 생성(new키워드를 만났을떄)global 멤버 변수 할당
		// 3. 주소값을 대입
		
		//System.out.println(fc.global);
		//fc.checkVariable(3);
		// checkVariable호출 == parameter(매개변수) 할당 및 초기화
		
		// checkVariable 호출 종료 시
		// parameter, local 지역변수 소멸
		
		/*
		StaticController sc = new StaticController();
		*/
		System.out.println(StaticController.str);
		
		System.out.println(StaticController.Java_Version);
		
		//System.out.println(Arrays.toString(new int[2]));
		
		//System.out.println(Math.random()); // 0.0 ~ 0.999999~
		System.out.println(Math.PI);
		
		/*
		 * AccessModifier(접근제어자 / 접근제한자)
		 * 
		 * 1. (+)public
		 * => 어디서든 (같은 패키지, 다른 패키지, 클래스 내/외부 포함 전부) 접근 가능
		 * 
		 * 2. (#)protected
		 * => 같은 패키지라면 무조건 접근 가능
		 * => 다른 패키지라면 상속 구조인 클래스에서만 접근 가능
		 * => 상속이라는 개념은 07번에서 배울 것
		 * 
		 * 3. (~)default(package friendly)
		 * => 오로지 같은 패키지에서만 접근 가능
		 * 
		 * 4. (-)private 
		 * => 오직 클래스 내부에서만 접근 가능 
		 * 
		 * 
		 */
		
	}

}
