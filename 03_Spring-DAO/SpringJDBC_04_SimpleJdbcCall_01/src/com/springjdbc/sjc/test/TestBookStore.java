package com.springjdbc.sjc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.sjc.dao.BookStoreDao;

public class TestBookStore {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springjdbc/sjc/cfg/Beans.xml");
		BookStoreDao dao = ctx.getBean("bookdao", BookStoreDao.class);
		
/*		String name = dao.getNameById(123);
		System.out.println("Book Name : " + name);
*/		
		/*Object price = dao.getPriceById(123);
		System.out.println("Price : "+price);*/
		

		dao.getBooksByPrice(5657.00);
		//dao.getBooksByPrice(550.00);

	}

}
