package com.springcore.bs.prototype.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.bs.prototype.bean.Message;

public class Test {

	public static void main(String[] args) {
		

		ClassPathResource res=new ClassPathResource("com/springcore/bs/prototype/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Message m=factory.getBean("prototype",Message.class);
		m.setMsg("Hello venkatesh");
		System.out.println(m.getMsg());
		System.out.println("HashCode : "+m.hashCode());
		
		Message m1=factory.getBean("prototype",Message.class);
		System.out.println(m1.getMsg());
		System.out.println("HashCode : "+m1.hashCode());
		
		/*here the objects of both hashcode is different 
		 	every request it object 
		  */
	}

}
