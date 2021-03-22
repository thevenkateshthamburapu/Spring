package com.springaop.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.aa.bean.BankTransaction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/aa/cfg/Bean.xml");

		BankTransaction bt = context.getBean("bank", BankTransaction.class);

		bt.deposit(50000, 8686868);
		System.out.println("=============================");
		bt.withdraw(6700, 5757586);
	}

}

	/*Context-we add context namespace in xml file

	AOP-we add AOP namespace in xml file while performing 
	AOP Operations*/

	/*we want add aspectjrt-1.6.11.jar and
	aspectjweaver-1.8.13.jar*/

