package com.springcore.anno.comp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.anno.comp.bean.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/springcore/anno/comp/cfg/Bean.xml");
		Student s=ctx.getBean(Student.class);
		System.out.println(s);
		
		/*we add context namespace in xml file*/
	}

}
