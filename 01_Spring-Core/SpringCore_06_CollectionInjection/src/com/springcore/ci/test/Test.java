package com.springcore.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.ci.bean.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res=new ClassPathResource("com/springcore/ci/cfg/Beans.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Person person=factory.getBean("person",Person.class);
		System.out.println(person);
		
	}

}
