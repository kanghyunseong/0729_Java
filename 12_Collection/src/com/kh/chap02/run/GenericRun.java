package com.kh.chap02.run;

import java.util.*;

import com.kh.chap02.model.vo.*;

public class GenericRun {

	public static void main(String[] args) {

		/*
		 * 제네릭<Generic>
		 * 
		 * 컬렉션을 사용하면서 다룰 타입들을 미리 지정할 수 있는 기능
		 * => 명시적으로 <Integer>, <Plant>
		 * => 특정 타입의 요소들만 컬렉션에 담을 수 있도록 지정할 수 있음
		 * 
		 * 별도의 제네릭 없이 컬렉션 객체 생성(E == Object)
		 *
		 * 1. 다룰 요소의 타입을 제한할 수 있음 => 실수를 줄일 수 있음
		 * 
		 * 
		 * 
		 */
		
		ArrayList<Plant> plants = new ArrayList();
		plants.add(new Plant("관엽", "산세베리아"));
		//plants.add("식물시작~");
		plants.add(new Plant("관엽", "폴리샤스"));
		
		//String name = ((Plant)plants.get(0)).getName();
		Plant p = plants.get(0);
		
		for(Plant plant : plants) {
			System.out.println(plant);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
