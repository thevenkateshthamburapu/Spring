package com.springcore.fm.ifm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.fm.ifm.bean.ATM;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res=new ClassPathResource("com/springcore/fm/ifm/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		ATM atm=factory.getBean("atm",ATM.class);
		//System.out.println(atm);
		atm.printBalanceInformation(56788.90);
		
		
	}

}
