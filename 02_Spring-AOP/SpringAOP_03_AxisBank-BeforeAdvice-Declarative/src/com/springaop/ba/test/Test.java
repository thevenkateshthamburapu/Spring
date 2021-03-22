package com.springaop.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.ba.bean.Bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springaop/ba/cfg/Bean.xml");
		Bank bank=ctx.getBean("bank",Bank.class);
		bank.deposit(1234567, 5000.00);
		System.out.println("============================");
		bank.withdraw(5436874, 2000.00);
		
	}

}	
	/*Context-we add context namespace in xml file

	AOP-we add AOP namespace in xml file while performing 
	AOP Operations*/

	/*we want add aspectjrt-1.6.11.jar and
	aspectjweaver-1.8.13.jar*/
