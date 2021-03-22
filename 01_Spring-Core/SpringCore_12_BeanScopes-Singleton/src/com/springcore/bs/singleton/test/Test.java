package com.springcore.bs.singleton.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.bs.singleton.bean.Message;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathResource res=new ClassPathResource("com/springcore/bs/singleton/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Message m=factory.getBean("singleton",Message.class);
		m.setMsg("Hello venkatesh");
		System.out.println(m.getMsg());
		System.out.println("HashCode : "+m.hashCode());
		
		Message m1=factory.getBean("singleton",Message.class);
		System.out.println(m1.getMsg());
		System.out.println("HashCode : "+m1.hashCode());
		
		/*here the objects of both hashcode is same*/
	}

}
