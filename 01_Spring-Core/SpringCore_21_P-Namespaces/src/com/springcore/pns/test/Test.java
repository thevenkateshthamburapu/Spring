package com.springcore.pns.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.pns.bean.BankAccount;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("com/springcore/pns/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		BankAccount ba=factory.getBean("bankaccount",BankAccount.class);
		System.out.println("....Using P-Namespaces....\n");

		System.out.println(ba);
		
		/*we need to include p namespace in bean 
		configuration file while create Bean.xml file*/
		
	}

}
