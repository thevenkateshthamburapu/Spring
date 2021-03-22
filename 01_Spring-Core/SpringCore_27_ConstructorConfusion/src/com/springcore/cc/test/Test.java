package com.springcore.cc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.cc.bean.Book;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/cc/cfg/Bean.xml");
		Book b = (Book) context.getBean("book");
		System.out.println(b);


	}

}
