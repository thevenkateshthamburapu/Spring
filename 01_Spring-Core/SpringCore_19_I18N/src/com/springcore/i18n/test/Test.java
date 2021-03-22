package com.springcore.i18n.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/i18n/cfg/Bean.xml");
		String msg=context.getMessage("hello", new Object[]{"Venkatesh"}, Locale.CHINA);
		System.out.println(msg);
		
		String msg1=context.getMessage("hello", new Object[]{"Venky"}, Locale.ENGLISH);
		System.out.println(msg1);
		
		String msg2=context.getMessage("hello", new Object[]{"Vk"}, Locale.FRANCE);
		System.out.println(msg2);
		
		
	}

}
