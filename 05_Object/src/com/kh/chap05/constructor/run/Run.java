package com.kh.chap05.constructor.run;

import java.util.*;

import com.kh.chap05.constructor.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Member member = new Member();
		
		Member member2 = new Member("하하호호호");
		System.out.println(member2.info());
		
		Member member3 = new Member("gkgk", "gkgkgkgk");
		System.out.println(member3.info());
		System.out.println();
		
		Member member4 = new Member("gkgk", "gkgkgkgk", "GHGHGHGH");
		System.out.println(member4.info());
	
	
	}
}
