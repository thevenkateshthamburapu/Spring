package com.springjdbc.sjc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.springjdbc.sjc.modal.Book;

public class BookStoreDao {

	private SimpleJdbcCall sjc;

	public void setSjc(SimpleJdbcCall sjc) {
		this.sjc = sjc;
	}

	public String getNameById(Integer bid) {
		String name = null;
		// Setting Procedure Name to call
		sjc.setProcedureName("GET_BOOK_NAME_BY_ID");
		// Storing input param details in Map
		Map<String, Object> inParamMap = new HashMap();
		inParamMap.put("BID", bid);
		// Execute the procedure
		Map<String, Object> outParamMap = sjc.execute(inParamMap);
		return (String) outParamMap.get("BNAME");

	}

	public Object getPriceById(Integer bid) {
		String name = null;
		// Setting Procedure Name to call
		sjc.setProcedureName("GET_BOOK_PRICE_BY_ID");
		// Storing input param details in Map
		Map<String, Object> inParamMap = new HashMap();
		inParamMap.put("BID", bid);
		// Execute the procedure
		Map<String, Object> outParamMap = sjc.execute(inParamMap);
		
		return  outParamMap.get("BPRICE");

	}

	public void getBooksByPrice(double price) {

		sjc.setProcedureName("GET_BOOKS_BY_PRICE");

		Map<String, Object> inParamMap = new HashMap();
		inParamMap.put("BPRICE", price);

		Map<String, Object> outParamMap = sjc.execute(inParamMap);
		System.out.println(outParamMap);

	}

}
