package com.kh.chap03.model.vo;

import java.util.*;

public class MBTI {

	private String introversionExtroversion;
	private String sensingiNtuition;
	private String thinkingFeeling;
	private String judgePerceiving;

	public MBTI() {
		super();
	}

	public MBTI(String introversionExtroversion, String sensingiNtuition, String thinkingFelling,
			String judgePerceiving) {
		super();
		this.introversionExtroversion = introversionExtroversion;
		this.sensingiNtuition = sensingiNtuition;
		this.thinkingFeeling = thinkingFelling;
		this.judgePerceiving = judgePerceiving;
	}


	public String getIntroversionExtroversion() {
		return introversionExtroversion;
	}

	public void setIntroversionExtroversion(String introversionExtroversion) {
		this.introversionExtroversion = introversionExtroversion;
	}

	public String getSensingiNtuition() {
		return sensingiNtuition;
	}

	public void setSensingiNtuition(String sensingiNtuition) {
		this.sensingiNtuition = sensingiNtuition;
	}

	public String getThinkingFelling() {
		return thinkingFeeling;
	}

	public void setThinkingFelling(String thinkingFelling) {
		this.thinkingFeeling = thinkingFelling;
	}

	public String getJudgePerceiving() {
		return judgePerceiving;
	}

	public void setJudgePerceiving(String judgePerceiving) {
		this.judgePerceiving = judgePerceiving;
	}

	@Override
	public String toString() {
		return "MBTI [introversionExtroversion=" + introversionExtroversion + ", sensingiNtuition=" + sensingiNtuition
				+ ", thinkingFelling=" + thinkingFeeling + ", judgePerceiving=" + judgePerceiving + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(introversionExtroversion, judgePerceiving, sensingiNtuition, thinkingFeeling);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introversionExtroversion, other.introversionExtroversion)
				&& Objects.equals(judgePerceiving, other.judgePerceiving)
				&& Objects.equals(sensingiNtuition, other.sensingiNtuition)
				&& Objects.equals(thinkingFeeling, other.thinkingFeeling);
	}
	
	// 결론적으로 우리가 해야할 일
	// 필드의 값이 동일하다면
	// equals()와 hashcode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함
	
	
	
	/*
	@Override
	public boolean equals(Object obj) {
		MBTI mbti = (MBTI)obj;
		// 필드값 비교
		// ei, sn, tf, jp 넷 중 하나라도 다르면 false을 반환
		// 내 필드랑 매개변수로 받아온 애 필드
		if(!this.introversionExtroversion.equals(mbti.introversionExtroversion) ||
		   !this.sensingiNtuition.equals(mbti.sensingiNtuition) || 
		   !this.thinkingFeeling.equals(mbti.thinkingFeeling) ||
		   !this.judgePerceiving.equals(mbti.judgePerceiving)) {
			return false;
		}
	return true;
	}
	
	
	
	@Override
	public int hashCode() {
		// 객체를 가지고 뭐 알아서 10진수로 만들어서 반환
		// 필드값 똑같으면 똑같은 해시코드 나오게 하고싶다.
		
		return (introversionExtroversion + sensingiNtuition
				+ thinkingFeeling + judgePerceiving).hashCode();
		
	}
	
	*/
	
}
