package com.springaop.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.aa.bean.ReminderBatch;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/aa/cfg/Bean.xml");
		ReminderBatch rb = context.getBean("rb", ReminderBatch.class);
		rb.sendNoticationToPlanHolders();

	}

}


	/*Context-we add context namespace in xml file

	AOP-we add AOP namespace in xml file while performing 
	AOP Operations*/

	/*we want add aspectjrt-1.6.11.jar and
	aspectjweaver-1.8.13.jar*/
