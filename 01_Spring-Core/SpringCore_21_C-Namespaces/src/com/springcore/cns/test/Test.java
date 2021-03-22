package com.springcore.cns.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.cns.bean.BankAccount;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("com/springcore/cns/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		BankAccount ba=factory.getBean("bankaccount",BankAccount.class);
		System.out.println("....Using C-Namespaces....\n");
		System.out.println(ba);
		
		/*we need to include c namespace in bean 
		configuration file while create Bean.xml file*/
		
		
	}

}
