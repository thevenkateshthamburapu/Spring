package com.springcore.bpp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.bpp.bean.PrintMessage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/bpp/cfg/Bean.xml");
		PrintMessage pm=context.getBean("pm",PrintMessage.class);
		System.out.println(pm);
		
		
	}

}
