package com.springcore.sio.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.sio.bean.Car;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("com/springcore/sio/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		Car c=factory.getBean("car",Car.class);
		System.out.println(c);
	}

}
