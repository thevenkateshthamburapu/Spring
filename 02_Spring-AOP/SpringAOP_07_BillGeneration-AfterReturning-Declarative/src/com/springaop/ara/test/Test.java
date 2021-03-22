package com.springaop.ara.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.ara.bean.BillGenerator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/ara/cfg/Bean.xml");
		BillGenerator bg = context.getBean("bill", BillGenerator.class);
		double billAmt = bg.generateBill(8989797);
		System.out.println("Bill amount : " + billAmt);
	}

}


	/*Context-we add context namespace in xml file

	AOP-we add AOP namespace in xml file while performing 
	AOP Operations*/

	/*we want add aspectjrt-1.6.11.jar and
	aspectjweaver-1.8.13.jar*/
