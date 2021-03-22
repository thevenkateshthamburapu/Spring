package com.spring.orm.hibernate.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.hibernate.entity.Emp;
import com.spring.orm.hibernate.service.EmpService;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/hibernate/config/Beans.xml");
		EmpService service = context.getBean(EmpService.class);

		/**
		 * Saving Entity
		 */
		Emp emp = new Emp("Venkatesh", "venkatesh@oracle.com", 45000.00);
		service.save(emp);

		/**
		 * Retrivieng Entity by ID
		 */
		 System.out.println("Find By ID : "+service.findByid(1));

		/**
		 * Retriving all entites
		 */
		List<Emp> emps = service.findAll();

		for (Emp e : emps) {
			System.out.println(e);
		}
	}
}
