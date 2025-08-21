package com.kh.chap01.model.vo;

public class Parent {
	// 필드부
	private int x;
	private int y;
	
	public Parent() {
		
	}
	
	// 생성자부
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void printParent() {
		System.out.println("안뇽 나는 부모클래스야~");
	}
	
	public void print() {
		System.out.println("나는 부모~");
	}

}
