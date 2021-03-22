package com.springcore.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.nbf.bean.Fuel;
import com.springcore.nbf.bean.Rocket;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res1=new ClassPathResource("com/springcore/nbf/cfg/Parent-Bean.xml");
		BeanFactory pfactory=new XmlBeanFactory(res1);
		Fuel f=pfactory.getBean("fuel1",Fuel.class);
		System.out.println(f);
		
		ClassPathResource res2=new ClassPathResource("com/springcore/nbf/cfg/Child-Bean.xml");
		BeanFactory cfactory=new XmlBeanFactory(res2,pfactory);
		Rocket r=cfactory.getBean("rocket",Rocket.class);
		System.out.println(r);
		
		//Counting Bean Creation
		ConfigurableListableBeanFactory factory=(ConfigurableListableBeanFactory) cfactory;
		int count=factory.getBeanDefinitionCount();
		System.out.println(count);
		
		
	}

}
