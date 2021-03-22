package com.springcore.blc.dec.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.springcore.blc.dec.bean.Motor;

public class Test {

	public static void main(String[] args) {
		
		/*we use methods in bean and beans levels*/
		
		//Beans level
		//ClassPathResource res=new ClassPathResource("com/springcore/blc/dec/cfg/Beand.xml");
		
		//Bean level
		ClassPathResource res=new ClassPathResource("com/springcore/blc/dec/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Motor m=factory.getBean("motor",Motor.class);
		m.running();
		
		/*start method initialize(run) automatically
		stop method manually we call it*/
		m.stop();
		
	}

}
