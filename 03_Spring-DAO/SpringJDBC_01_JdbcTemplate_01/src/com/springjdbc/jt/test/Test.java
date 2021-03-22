package com.springjdbc.jt.test;

import java.io.File;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.jt.dao.BookStoreDao;
import com.springjdbc.jt.dto.BookDTO;
import com.springjdbc.jt.reader.BookCSVReader;

public class Test {

	public static void main(String[] args) throws Exception {

		// Storing data in Dto obj
				/*BookDTO dto = new BookDTO();
				dto.setBookId(104);
				dto.setBookName("adv core");
				dto.setAuthorName("james");
				dto.setIsbn("ISBN002");
				dto.setPrice(660.00);*/

				ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springjdbc/jt/cfg/Bean.xml");
				BookStoreDao dao = ctx.getBean("bookdao", BookStoreDao.class);
				
				//inserting records
				//boolean status = dao.insert(dto);
				//boolean status = dao.insertWithPstmt(dto);
				//System.out.println("Record inserted ? : " + status);
				
				//deleting records by id
				 //boolean isDeleted = dao.deleteById(103);
				 //System.out.println("Record Deleted ? :"+isDeleted);
				
				//updating price by using id 
				/*boolean isUpdated = dao.updatePriceById(102, 350.00);
				System.out.println("Record Updated ? : "+isUpdated);
				dao.queryForMap(102);*/
				
				//display all records from database
				//dao.queryForList();
				
				//finding one record
				BookDTO dto = dao.findById(101);
				System.out.println(dto);
				
				//display all records from database
				//List<BookDTO> dtos = dao.findAll();				
				//List<BookDTO> dtos = dao.findByAutorName("venkatesh");
				
				/*List<BookDTO> books = BookCSVReader.readCSVData(new File("Book-Details.csv"));
				dao.insertBooksUsingBatch(books);
				System.out.println("Record Inserted");*/
	}

}
