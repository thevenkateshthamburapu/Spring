package com.springcore.bfpp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bfpp.bean.ConnectionProvider;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/bfpp/cfg/Bean.xml");
		ConnectionProvider cp=context.getBean("cp",ConnectionProvider.class);
		System.out.println(cp);
		
	}

}
