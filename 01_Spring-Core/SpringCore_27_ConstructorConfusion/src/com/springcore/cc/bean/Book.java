package com.springcore.cc.bean;

public class Book {
	
	private int bookId;
	private String isbn;
	private String bookName;

	public Book(String isbn, String bookName) {
		this.isbn = isbn;
		this.bookName = bookName;
	}

	public Book(int bookId, String isbn) {
		this.bookId = bookId;
		this.isbn = isbn;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", isbn=" + isbn + ", bookName=" + bookName + "]";
	}

}
