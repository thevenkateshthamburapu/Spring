package com.springjdbc.sji.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.springjdbc.sji.modal.Book;

public class BookStoreDao {

	private SimpleJdbcInsert sji;

	public void setSji(SimpleJdbcInsert sji) {
		this.sji = sji;
	}

	public boolean insert(String tblName, Book dto) {

		// Setting table name
		sji.setTableName(tblName);

		Map<String, Object> tableMap = new HashMap();
		// Storing table info
		tableMap.put("BOOK_ID", dto.getBookId());
		tableMap.put("BOOK_NAME", dto.getBookName());
		tableMap.put("BOOK_ISBN", dto.getIsbn());
		tableMap.put("BOOK_PRICE", dto.getPrice());
		tableMap.put("AUTHOR_NAME", dto.getAuthorName());

		// Executing
		int cnt = sji.execute(tableMap);

		return (cnt > 0) ? true : false;
	}

}
