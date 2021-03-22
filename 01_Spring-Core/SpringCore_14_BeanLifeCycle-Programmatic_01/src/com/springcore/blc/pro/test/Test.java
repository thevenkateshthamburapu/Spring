package com.springcore.blc.pro.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.springcore.blc.pro.bean.Motor;

public class Test {

	public static void main(String[] args) {
		
		ClassPathResource res=new ClassPathResource("com/springcore/blc/pro/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Motor m=factory.getBean("motor",Motor.class);
		m.running();
		ConfigurableListableBeanFactory cfactory=(ConfigurableListableBeanFactory) factory;
		cfactory.destroySingletons();
		
		//using this we know the how many beans created
		int c=cfactory.getBeanDefinitionCount();
		System.out.println(c);
		
	}

}
