package com.springcore.baw.byname.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.baw.byname.bean.Robot;

public class Test {

	public static void main(String[] args) {

		ClassPathResource res=new ClassPathResource("com/springcore/baw/byname/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Robot r=factory.getBean("robot",Robot.class);
		System.out.println(r);
		
		
	}

}
