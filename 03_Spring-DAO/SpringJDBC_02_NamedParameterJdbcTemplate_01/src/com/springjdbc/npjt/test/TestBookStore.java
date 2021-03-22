package com.springjdbc.npjt.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.npjt.dao.BookStoreDao;
import com.springjdbc.npjt.modal.Book;

public class TestBookStore {

	public static void main(String[] args) throws Exception {


				ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springjdbc/npjt/cfg/Beans.xml");
				BookStoreDao dao = ctx.getBean("bookdao", BookStoreDao.class);
				
				//inserting records
/*				boolean status = dao.insertBookDetails(150, "Sailpoint", "Venkatesh", 500.00, "SAIL657");
				if(status){
					System.out.println("Inserted successfully!");
				}else{
					System.out.println("Unable to insert!");
				}
*/				
				
				//deleting records by id
				 /*boolean isDeleted = dao.deleteById(102);
				 System.out.println("Record Deleted ? :"+isDeleted);*/
				
				//updating price by using id 
				/*boolean isUpdated = dao.updatePriceById(150, 550.00);
				System.out.println("Record Updated ? : "+isUpdated);*/
				
				//find by id converted into map
				/*dao.queryForMap(150);*/
				
				//display all records from database
				/*dao.queryForList();*/
				
				//finding one record
				/*Book book = dao.findById(101);
				System.out.println(book);*/
				
				//display all records from database
				/*List<Book> books = dao.findAll();
				books.forEach((book)->{
					System.out.println(book);
				});*/
				
				//batch insert
				Book book1=new Book();
				book1.setBookId(255);
				book1.setBookName("Spring");
				book1.setAuthorName("Rajesh");
				book1.setPrice(200.00);
				book1.setIsbn("ISBN123");
				Book book2=new Book();
				book2.setBookId(256);
				book2.setBookName("Spring fram");
				book2.setAuthorName("Rajesh Gupta");
				book2.setPrice(250.00);
				book2.setIsbn("ISBN12389");
				List<Book> books=new ArrayList<Book>();
				books.add(book1);
				books.add(book2);
				dao.insertUsingBatch(books);
				
				
				
	}

	
}
