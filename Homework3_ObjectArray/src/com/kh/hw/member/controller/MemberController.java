package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.*;

public class MemberController {

	public static final int SIZE = 10;

	private Member[] m = new Member[SIZE];
	
	//초기화블럭
//	static {
//		m[0] = new Member("admin", "관리자", "ad1234", "admis@khs.com", 'M', 100);
//	}

	public int existMemberNum() {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				count++;
			}
		}
		return count;
	}

	public boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		if (existMemberNum() >= SIZE) {
			return;
		}

		for (int i = 0; i < SIZE; i++) {
			if (m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}

	public String searchId(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
			}
		} 
		return null;
	}

	public Member[] searchName(String name) {
		Member[] temp = new Member[SIZE];
		int idx = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getName().equals(name)) {
				temp[idx++] = m[i];
			}
		}
		Member[] result = new Member[idx];
		for (int i = 0; i < idx; i++) {
			result[i] = temp[i];
		}
		return result;
	}

	public Member[] searchEmail(String email) {
		Member[] temp = new Member[SIZE];
		int idx = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)) {
				temp[idx++] = m[i];
			}
		}
		
		Member[] result = new Member[idx];
		for(int i = 0; i < idx; i++) {
			result[i] = temp[i];
		}
		return result;
	}

	public boolean updatePassword(String id, String password) {
		for(int i = 0; i <m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}

	public boolean updateName(String id, String name) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}

	public boolean updateEmail(String id, String email) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}

	public boolean delete(String id) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}

	public void delete() {
		for(int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}

	public Member[] printAll() {
		Member[] temp = new Member[existMemberNum()];
		
		int idx = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				temp[idx++] = m[i];
			}
		}
		
		return temp;
	}
}
