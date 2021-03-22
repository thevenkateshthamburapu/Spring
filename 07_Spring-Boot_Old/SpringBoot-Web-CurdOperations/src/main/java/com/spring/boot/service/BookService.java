package com.spring.boot.service;

import java.util.List;

import com.spring.boot.model.Book;

public interface BookService {

	public boolean insert(Book book);

	public List<Book> findAllBooks();
	
	public boolean delete(Integer bid);
	
	public Book edit(Integer bid);
	
	public boolean update(Book b);
	
	

}
