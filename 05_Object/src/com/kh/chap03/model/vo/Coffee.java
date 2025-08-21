package com.kh.chap03.model.vo;

public class Coffee {

	// 상품명, 가격, 원두, 크기
	
	// 필드부
	// 상품명, 가격, 원두, 크기 만들어야함
	private String name;
	private int price;
	private String bean;
	private String size;
	
	// 생성자부
	
	// 메소드부 getter / setter / info
	
	// 필드값을 반환해주는 메소드 == getter
	
	public String getName() {
		return name;
	}
	
	
	
	public int getPrice() {
		return price;
	}
	
	public String getBean() {
		return bean;
	}
	
	public String getSize() {
		return size;
	}
	
	// 필드값을 셋팅 해주는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBean(String bean) {
		this.bean = bean;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String info() {
		String info = "상품명 : " + name
					+ ", 원두 : " + bean
					+ ", 사이즈 : " + size
					+ ", 가격 : " + price;
		
		return info;
	}
	
}
