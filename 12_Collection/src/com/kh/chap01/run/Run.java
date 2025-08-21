package com.kh.chap01.run;

import com.kh.chap01.controller.*;

public class Run {

	public static void main(String[] args) {

		// 정수 값을 여러 개 다루고 싶음
		// 정확하게 몇 개의 정수를 다룰지 알 수 없음
		Integers integers = new Integers();
		integers.add(10);
		integers.add(60);
		integers.add(90);
		
		System.out.println(integers);
		
	}

}
