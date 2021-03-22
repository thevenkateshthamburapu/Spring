package com.springjdbc.npjt.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.npjt.modal.Book;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int index) throws SQLException {

		Book book = new Book();
		book.setBookId(rs.getInt("BOOK_ID"));
		book.setBookName(rs.getString("BOOK_NAME"));
		book.setPrice(rs.getDouble("BOOK_PRICE"));
		book.setIsbn(rs.getString("BOOK_ISBN"));
		book.setAuthorName(rs.getString("AUTHOR_NAME"));

		return book;
	}

}
