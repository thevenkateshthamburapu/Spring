package com.springcore.mcf.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.mcf.bean.Car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/mcf/cfg/bean1.xml","com/springcore/mcf/cfg/bean2.xml");
		Car c = ctx.getBean("car", Car.class);
		System.out.println(c);
	}

}
