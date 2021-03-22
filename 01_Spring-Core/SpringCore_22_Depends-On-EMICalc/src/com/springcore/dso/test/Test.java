package com.springcore.dso.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.dso.bean.LoanCalculator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("com/springcore/dso/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		LoanCalculator lc=factory.getBean("lc",LoanCalculator.class);
		lc.computeEmi(500000, 3, "TCS");
		
		
	}

}
