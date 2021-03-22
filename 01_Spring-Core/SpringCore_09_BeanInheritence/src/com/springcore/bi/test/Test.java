package com.springcore.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.bi.bean.Mobile;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("com/springcore/bi/cfg/Beans.xml");
		BeanFactory factory=new XmlBeanFactory(res);
//		Mobile bm=factory.getBean("basemobile",Mobile.class);
//		System.out.println(bm);
		/*	When we declare a bean as abstract, 
		  the class will not become abstract only 
		  the current bean definition will become 
		  abstract, which means spring wilt not create 
		  the object of that bean. Any call to 
		  factory.getBean("abstractbean") to
		  an abstract bean will results out in an error.
		  */
		Mobile m=factory.getBean("mobile2",Mobile.class);
		System.out.println(m);
		
		Mobile m1=factory.getBean("mobile3",Mobile.class);
		System.out.println(m1);
		
		Mobile m2=factory.getBean("mobile4",Mobile.class);
		System.out.println(m2);
		

	}

}
