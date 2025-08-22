package com.kh.libarary.controller;

import java.util.*;

import com.kh.libarary.model.vo.*;

public class BookController {

	private ArrayList<Book> list = new ArrayList<Book>();

	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));

	}

	public void insertBook(Book bk) {
		list.add(bk);
	}

	public ArrayList<Book> selectList() {
		return list;
	}

	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		for (Book b : list) {
			String title = b.getTitle();
			boolean found = false;

			for (int i = 0; i <= title.length() - keyword.length(); i++) {
				String part = title.substring(i, i + keyword.length());
				if (part.equals(keyword)) {
					found = true;
					break;
				}
			}

			if (found) {
				searchList.add(b);
			}
		}
		return searchList;
	}

	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(Book b : list) {
			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
				removeBook = b;
				break;
			}
		}
		if(removeBook != null) {
			list.remove(removeBook);
		}
		return removeBook;
	}

}