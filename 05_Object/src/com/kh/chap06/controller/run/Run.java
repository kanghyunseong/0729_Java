package com.kh.chap06.controller.run;

import java.util.*;

import com.kh.chap06.controller.*;

public class Run {

	public static void main(String[] args) {
		/*
		Human human = new Human();
		human.hi();
		*/
		
		/*
		MethodController mc = new MethodController();
		int a = mc.add(1, 2);
		int b = mc.add(2, 3);
		int c = mc.add(3, 6);
		int d = mc.add(a, b);
		int e = mc.add(c, d);
		System.out.println("총합 : " + e);
		*/
		
		MethodController mc = new MethodController();
		// int[] dd = new int[3];
		//mc.method1();
		//mc.method2();
		//String returnValue = mc.method2();
		//System.out.println(mc.method2());
		//System.out.println(mc.method3());
		//mc.println("method3 호출 결과ssss : " + mc.method3());
		//mc.method4(1);
		//int result = mc.method5(100);
		//System.out.println(result);
		//mc.a();
		
		//MethodController mc = mc;
		//☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		//mc.test(mc);
		
		// 복습하자~~~~
		//객체를 생성하지않고 메서드를 호출할 수 있음
		//static 
		//Math.random();
		//int[] arr = {2, 3};
		//System.out.println(Arrays.toString(arr));
		//MethodController.staticMethod();
		
		// mc.haha(3.34);
		
		
		//System.out.println(1);
		//System.out.println(1.1);
		//System.out.println('a');
		//System.out.println("어라?");
		//System.out.println(mc);
		//System.out.println();
		
		OverloadingController oc = new OverloadingController();
		// 컴파일이 끝난 시점 어떤 메소드가 호출될지 결정
		// 컴파일러가 알아서 코드를 분석하여 메소드 호출 연결
		oc.test();
		oc.test(2);
		oc.test("ㅇㄴ");
		oc.test(3, 4);
		
		
	}
	
	

}
