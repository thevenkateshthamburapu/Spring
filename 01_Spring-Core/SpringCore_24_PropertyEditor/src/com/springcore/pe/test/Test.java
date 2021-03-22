package com.springcore.pe.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.pe.bean.Calculator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/pe/cfg/Bean.xml");
		Calculator calc = ctx.getBean("calc", Calculator.class);
		calc.addNumbers();
	}

}
