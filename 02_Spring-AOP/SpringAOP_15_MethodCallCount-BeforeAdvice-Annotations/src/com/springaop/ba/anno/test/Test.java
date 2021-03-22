package com.springaop.ba.anno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.ba.anno.bean.Monitor;
import com.springaop.ba.anno.bean.StatementGenerator;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/ba/anno/cfg/Bean.xml");
		StatementGenerator sg = context.getBean("sg",StatementGenerator.class);

		sg.generateStatement();
		sg.generateStatement();
		sg.generateStatement();

		System.out.println("Count : " + Monitor.getAccessCount("generateStatement"));
	}

}

	/*Context-we add context namespace in xml file

	AOP-we add AOP namespace in xml file while performing
	AOP Operations*/

	/*we want add aspectjrt-1.6.11.jar and
	aspectjweaver-1.8.13.jar*/

