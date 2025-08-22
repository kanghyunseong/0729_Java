package com.kh.music.controller;

import java.util.*;

import com.kh.music.model.vo.*;

public class MusicController {

	private ArrayList<Music> list = new ArrayList();

	public int addList(Music music) {
		list.add(music);
		return 1;
	}

	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}

	public ArrayList<Music> printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				return m;
			}
		}
		return null;
	}

	public Music removeMusic(String title) {
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				list.remove(m);
				return m;
			}
		}
		return null;
	}

	public Music setMusic(String title, Music music) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				return list.set(i, music);
			}
		}
		
		return null;
	}

}
