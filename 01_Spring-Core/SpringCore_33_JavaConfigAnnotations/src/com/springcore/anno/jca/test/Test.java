package com.springcore.anno.jca.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.anno.jca.bean.Car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/anno/jca/cfg/Bean.xml");
		Car c=ctx.getBean(Car.class);
		System.out.println(c);
		ctx.registerShutdownHook();
		
	}

}
	//add javax.inject-1.jar
	/*we add context namespace in xml file*/
	