package com.springcore.anno.awa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfigurationAttributes;

import com.springcore.anno.awa.bean.Car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/anno/awa/cfg/Bean.xml");		
		Car c=ctx.getBean("car",Car.class);
		System.out.println(c);
		
		/*we add context namespace in xml file*/
	}

}
