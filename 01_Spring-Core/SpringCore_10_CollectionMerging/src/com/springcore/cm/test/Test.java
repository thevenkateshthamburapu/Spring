package com.springcore.cm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.cm.bean.Meeting;

public class Test {

	public static void main(String[] args) {
		
		ClassPathResource res=new ClassPathResource("com/springcore/cm/cfg/Beans.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		Meeting m=factory.getBean("standupcal",Meeting.class);
		System.out.println(m);
		
		Meeting m1=factory.getBean("weeklycal",Meeting.class);
		System.out.println(m1);
		
	}

}
