package com.kh.example.preactice1.run;

import com.kh.example.preactice1.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.changeName("홍길동");
		member.printName();
	}
}
