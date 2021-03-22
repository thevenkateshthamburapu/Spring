package com.springcore.anno.sca.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.anno.sca.bean.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/anno/sca/cfg/Bean.xml");
	Employee emp=ctx.getBean(Employee.class);
	System.out.println(emp);
	}

}

	/*we add context namespace in xml file*/