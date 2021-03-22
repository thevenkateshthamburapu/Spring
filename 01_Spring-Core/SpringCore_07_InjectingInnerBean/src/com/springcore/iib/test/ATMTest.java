package com.springcore.iib.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.iib.bean.ATM;

public class ATMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("com/springcore/iib/cfg/Beans.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		ATM atm= factory.getBean("atm",ATM.class);
		atm.withdraw(2000);
		
		
	}

}
