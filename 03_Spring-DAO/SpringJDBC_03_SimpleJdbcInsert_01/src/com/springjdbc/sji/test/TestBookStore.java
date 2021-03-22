package com.springjdbc.sji.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.sji.dao.BookStoreDao;
import com.springjdbc.sji.modal.Book;

public class TestBookStore {

	public static void main(String[] args) throws Exception {


				ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springjdbc/sji/cfg/Beans.xml");
				BookStoreDao dao = ctx.getBean("bookdao", BookStoreDao.class);
				
				Book dto = new Book();
				dto.setBookId(193);
				dto.setBookName("WebServices");
				dto.setAuthorName("Richard");
				dto.setIsbn("ISBN003");
				dto.setPrice(550.00);

				boolean isInserted = dao.insert("BOOK_STORE", dto);

				System.out.println("Record Inserted ? :" + isInserted);
				
				
	}

	
}
