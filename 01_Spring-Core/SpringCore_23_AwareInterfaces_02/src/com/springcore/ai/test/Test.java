package com.springcore.ai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ai.bean.OrderManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/ai/cfg/Bean.xml");
		OrderManager om = ctx.getBean("ordermanager", OrderManager.class);
		om.processOrder();

	}

}
