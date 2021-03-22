package com.springcore.anno.ra.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.anno.ra.bean.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/anno/ra/cfg/Bean.xml");
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getCompany().getCompName());		
		
		/*we add context namespace in xml file*/
		
	}

}
