package com.springcore.baw.constructor.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.baw.constructor.bean.Robot;

public class Test {

	public static void main(String[] args) {

		ClassPathResource res=new ClassPathResource("com/springcore/baw/constructor/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Robot r=factory.getBean("robot",Robot.class);
		System.out.println(r);
		
		
	}

}
