package com.kh.chap02.encapsulation.model.vo;

import java.util.*;

public class Cafe {

	// 필드부
	/*
	 * 객체가 가질 수 있는 속성
	 * 정보를 담는 부분
	 * 필드 == 멤버변수
	 * 접근제한자 자료형 필드 식별자
	 * 
	 */
	
	private String name;
	private String address;
	private int signatureMenuPrice;
	
	// 생성자부
	// 메소드부
	/*
	 * 기능를 구현하는 부분
	 * 
	 * 접근제한자 (예약어) 반환형 메소드식별자(매개변수) {
	 * 메소드 호출 시 실행할 코드;
	 * }
	 * 
	 * 접근제한자 : 호출할 수 있는 범위를 제한할 수 있음
	 * 반환형 : void => return할 때 돌려줄 값이 없음
	 * 		  반환 시 결과값의 자료형을 명시해준다.
	 * 매개변수 : 파라미터 : 메소드 호출 시 전달 값을 받아주는 변수
	 * 			메소드 범위에서만 사용 가능. 생략 가능
	 */
	
	
	public void open() {
		dishWash();
		cleaning();
		windowCleaning();
	}
	
	private void dishWash() {
		System.out.println("깨끗하게 빡빡!!");
	}
	
	private void cleaning() {
		System.out.println("청소도 빡빡!!");
	}
	
	private void windowCleaning() {
		System.out.println("유리도 빡빡!!");
	}
	
	// 데이터를 기록 및 수정하는 기능의 메소드 : setter()
	
	/*
	 * DTO -> setter를 만들어줌
	 * VO -> 일반적으로 setter메소드를 구현하지 않음
	 * 
	 * DTO는 2달뒤에 배울건데 DTO학습 전 까지만 VO클래스에 Setter를 구현해서 사용
	 * 
	 * setter만들기 규칙
	 * 
	 * 1. setter메소드는 외부에서 접근이 가능해야 하기 떄문에 접근제한자를 public을 이용
	 * 2. set필드명으로 식별자를 작성하며 낙타봉표기법(CamelCase)을 꼭 지키도록 한다.
	 * 3. (예외사항) 우리는 당분간 항상 모든 필드에 대해서 setter를 구현합니다.
	 */
	
	// 고유메뉴의 가격정보를 기록 및 수정할 수 있는 메소드
	// signatureMenuPrice
	
	Scanner sc = new Scanner(System.in);
	
	public void setSignatureMenuPrice(int signatureMenuPrice) {
		//System.out.println(signatureMenuPrice);
		//signatureMenuPrice = signatureMenuPrice;
		//Scope안에서는 해당 영역안에 있는 지역변수에 대한 우선권이 있음
		
		//System.out.println("내 주소가 뭐지 ? > " + this);
		//this : 해당 객체의 주소값을 가리키는 역할
		//this.signatureMenuPrice = signatureMenuPrice;
		
		if(signatureMenuPrice <= 1000) {
			System.out.println("정상적이지 않은 값을 입력하셨습니다.1000이상의정수를입력하세요");
		} else {
			this.signatureMenuPrice = signatureMenuPrice;
			
		}
		System.out.println(signatureMenuPrice);
	}
	
	
	// name필드를 기록 및 수정할 수 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	 * 관례 위반
	 * 이 경우엔 set으로 시작하면 안됨
	 * public void setNameAndAdrresS(string a , string a)
	 */
	
	/*
	 * 규칙 !
	 * 
	 * 1. getter() 접근제한자를 public
	 * 2. get필드명으로 짓되, 낙타표기법를 사용한다
	 * 3. 모든 필드에 대해서 반드시무조건 꼭 다 절대로 만들어주세요
	 */
	
	// 메소드를 호출한 곳으로 name필드값을 돌려주고 싶음
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getSignatureMenuPrice() {
		return signatureMenuPrice;
	}
	//getter/ setter다만듦 -> 캡슐화가 끝남
	/*
	 * 1. 값을 숨긴다 => 필드의 접근제한자를 public 대신 private로 선언한다.
	 * 2. 메소드를 통해 필드에 접근할 수 있도록 만들어준다 => getter() / setter()구현
	 * 
	 * 데이터를 숨김 -> 객체간의 결합도를 낮춤 -> 책임을 분리시킨다
	 */
	
	//모든 필드값을 확인할 수 있도록 반환해주는 메소드
	
	public String info() {
		
		// name, address, signatureMenuPrice
		// return name, address, signatureMenuPrice
		// return할때 반환할 수 있는 갑 ㅅ단 한개
		
		String info = "[name 필드값 : " + name + ", address 필드값 : " + address
						+ ", signatureMenuPrice : " + signatureMenuPrice + "]";
		return info;
	}

	@Override
	public String toString() {
		return "Cafe [name=" + name + ", address=" + address + ", signatureMenuPrice=" + signatureMenuPrice + ", sc="
				+ sc + "]";
	}
	
}
