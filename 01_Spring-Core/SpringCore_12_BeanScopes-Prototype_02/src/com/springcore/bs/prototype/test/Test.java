package com.springcore.bs.prototype.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.bs.prototype.bean.Car;

public class Test {

	public static void main(String[] args) {
		
		
		ClassPathResource res=new ClassPathResource("com/springcore/bs/prototype/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Car c=factory.getBean("prototype",Car.class);
		System.out.println(c);
		System.out.println("HashCode: "+c.hashCode());
		
		Car c1=factory.getBean("prototype",Car.class);
		System.out.println(c1);
		System.out.println("HashCode: "+c1.hashCode());
		
		/*here the objects of both hashcode different*/
	}

}
