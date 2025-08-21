package com.kh.chap01.model.vo;

public class Child1 extends Parent {
	// 필드부 
	// int x, int y
	private int z;
	
	// 생성자부
	public Child1() {}
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// 메소드부
	public void setZ(int z) {
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void printChild1() {
		System.out.println("안뇽 나는 첫 번쨰 자식 클래스 chidl1이야~");
	}
	
	@Override
	public void print() {
		System.out.println("나는 자식1~");
	}
}
