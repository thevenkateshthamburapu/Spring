package com.springcore.cd.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.cd.bean.A;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("com/springcore/cd/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		A a=factory.getBean("a",A.class);
		System.out.println(a);
		
		/*we get exception because one bean is depending 
		on another bean and repeating process*/
		
	}

}
