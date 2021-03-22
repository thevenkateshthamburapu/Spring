package com.springcore.anno.config.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.anno.config.bean.AppConfiguration;
import com.springcore.anno.config.bean.Car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
		Car c=context.getBean(Car.class);
		c.drive();
		
	}

}
