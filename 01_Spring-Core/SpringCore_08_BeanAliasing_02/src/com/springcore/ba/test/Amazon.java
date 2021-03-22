package com.springcore.ba.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.ba.bean.OrderManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res=new ClassPathResource("com/springcore/ba/cfg/Beans.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		OrderManager om= factory.getBean("ordermanager",OrderManager.class);
		om.processOrder();
		
	}

}
