package com.kh.idol.controller;

import java.util.*;

import com.kh.idol.model.vo.*;

public class IdolController {

	private List<Fan> fl = new ArrayList();
	private List<Board> boards = new ArrayList();
	private List<Idol> aespa = new ArrayList();
	// 아이돌들도 어디에 담아놓고 고걸 읽어와서 정보를 출력해줘야 하지 않을까?
	
	
	{
		aespa.add(new Idol("카리나", "리더", "Rocket Puncher"));
		aespa.add(new Idol("지젤", "외국인1", "Xenoglossy"));
		aespa.add(new Idol("윈터", "불자", "Armamenter"));
		aespa.add(new Idol("닝닝", "외국인2", "E.D Hacker"));
		
	}
	
}
