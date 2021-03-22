package com.springcore.anno.dso.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.anno.dso.bean.A;
import com.springcore.anno.dso.cfg.AppConfig;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		A a = ctx.getBean("a",A.class);

	}

}
