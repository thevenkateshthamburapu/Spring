package com.springjdbc.npjt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

import com.springjdbc.npjt.mappers.BookRowMapper;
import com.springjdbc.npjt.modal.Book;

public class BookStoreDao {

	private static final String INSERT_BOOK = "INSERT INTO BOOK_STORE(BOOK_ID,AUTHOR_NAME,BOOK_NAME,BOOK_PRICE,BOOK_ISBN)"
			+ " VALUES (:bookId,:authorName,:bookName,:price,:isbn)";
	private static final String FIND_ALL = "SELECT * FROM BOOK_STORE";
	private static final String FIND_BY_ID = "SELECT * FROM BOOK_STORE WHERE BOOK_ID=:bookId";
	private static final String UPDATE_PRICE_BY_ID = "UPDATE BOOK_STORE SET BOOK_PRICE=:price WHERE BOOK_ID=:bookId";
	private static final String DELETE_BY_ID = "DELETE FROM BOOK_STORE WHERE BOOK_ID= :bookId";
	
	private NamedParameterJdbcTemplate npjt;

	public void setNpjt(NamedParameterJdbcTemplate npjt) {
		this.npjt = npjt;
	}
	
	public boolean insertBookDetails(int bookId,String bookName,String authorName,double price,String isbn){
		Map<String,Object> paramMap=new HashMap<String,Object>();
		paramMap.put("bookId", bookId);
		paramMap.put("bookName", bookName);
		paramMap.put("authorName", authorName);
		paramMap.put("price", price);
		paramMap.put("isbn", isbn);
		int status=npjt.update(INSERT_BOOK, paramMap);
		return status>0?true:false;
	}
	
	public Book findById(int bookId){
		Map<String,Object> paramMap=new HashMap<String,Object>();
		paramMap.put("bookId", bookId);
		return npjt.queryForObject(FIND_BY_ID, paramMap, new BookRowMapper());
	}
	
	public boolean updatePriceById(int bookId,double price){
		Map<String,Object> paramMap=new HashMap<String,Object>();
		paramMap.put("bookId", bookId);
		paramMap.put("price", price);
		int status= npjt.update(UPDATE_PRICE_BY_ID, paramMap);
		if (status > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void queryForMap(int bookId) {
		Map<String,Object> paramMap=new HashMap<String,Object>();
		paramMap.put("bookId", bookId);
		Map<String, Object> dataMap = npjt.queryForMap(FIND_BY_ID, paramMap);
		System.out.println(dataMap);
	}
	
	public boolean deleteById(int bookId) {
		Map<String,Object> paramMap=new HashMap<String,Object>();
		paramMap.put("bookId", bookId);
		int status = npjt.update(DELETE_BY_ID, paramMap);
		if (status > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void queryForList() {
		Map<String,Object> paramMap=new HashMap<String,Object>();
		List<Map<String, Object>> allRecords = npjt.queryForList(FIND_ALL,paramMap);
		for (Map<String, Object> map : allRecords) {
			System.out.println(map);
		}
	}
	
	public void insertUsingBatch(List<Book> books) {
		SqlParameterSource[] args = SqlParameterSourceUtils.createBatch(books.toArray());
		int[] status = npjt.batchUpdate(INSERT_BOOK, args);
		System.out.println("Rows Effected : " + status);
	}
	
	public List<Book> findAll() {
		Map<String,Object> paramMap=new HashMap<String,Object>();
		return npjt.query(FIND_ALL, paramMap,new BookRowMapper());
	}
}
