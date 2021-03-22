package com.springaop.aj.anno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.aj.anno.bean.Monitor;
import com.springaop.aj.anno.bean.ReportGenerator;

public class Test {

	public static void main(String[] args) {
ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springaop/aj/anno/cfg/Bean.xml");
		
		ReportGenerator rg   = ctx.getBean("rg",ReportGenerator.class);
		
		rg.generateReport();
		rg.generateReport();
		rg.generateReport();		
		
		System.out.println("Count : "+Monitor.getAccessCount("generateReport"));

	}

}

	/*Context-we add context namespace in xml file

	AOP-we add AOP namespace in xml file while performing 
	AOP Operations*/
	/*we want add aspectjrt-1.6.11.jar and
	aspectjweaver-1.8.13.jar*/