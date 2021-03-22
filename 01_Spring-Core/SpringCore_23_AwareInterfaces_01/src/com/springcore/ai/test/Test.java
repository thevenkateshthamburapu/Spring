package com.springcore.ai.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.ai.bean.OrderManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res = new ClassPathResource("com/springcore/ai/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		OrderManager om = factory.getBean("ordermanager", OrderManager.class);
		om.processOrder();

	}

}
