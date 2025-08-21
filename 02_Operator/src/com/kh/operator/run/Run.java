package com.kh.operator.run;

// 1절 
import com.kh.operator.*;

// 이 클래스를 만든 이유 : 프로그램 실행혀라고
public class Run {
	
	public static void main(String[] agrs) {
		
		
		// method
		// 2절 import 해온 클래스에다가 별칭 붙이고 new(생성) 해주기
		A_Arithmetic a = new A_Arithmetic();
//		a.presentToStudent();
		
//		B_InDecrease b = new B_InDecrease();
		//C_Compound c = new C_Compound();
		//c.method1();
		
		D_LogicalNagation d = new D_LogicalNagation();
		//d.method1();
		
		E_Comparison e = new E_Comparison();
//		e.method1();
		
		F_Logical f = new F_Logical();
		//f.method1();
		//f.method2();
		//f.method3();
		
		G_Triple g = new G_Triple();
		//g.method1();
		//g.method2();
		g.practice();
		
	}

}
