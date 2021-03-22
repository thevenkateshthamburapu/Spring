package com.springcore.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.ba.bean.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathResource res=new ClassPathResource("com/springcore/ba/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Person p= factory.getBean("person",Person.class);
		
		
	/*	
		//we can use the same bean using these names
		Person p= factory.getBean("person1",Person.class);
		Person p= factory.getBean("person2",Person.class);
		Person p= factory.getBean("p",Person.class);
		Person p= factory.getBean("5",Person.class);
		Person p= factory.getBean("p,5",Person.class);
		*/
		
		System.out.println(p);
		
		
	}

}
