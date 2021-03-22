package com.springaop.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.ba.bean.Calculator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/ba/cfg/Bean.xml");
		Calculator c = context.getBean("calculator", Calculator.class);
		System.out.println("Sum : " + c.add(10, 20));
		
	}

}


	/*Context-we add context namespace in xml file

	AOP-we add AOP namespace in xml file while performing 
	AOP Operations*/

	/*we want add aspectjrt-1.6.11.jar and
	aspectjweaver-1.8.13.jar*/