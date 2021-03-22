package com.springcore.mi.mr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.mi.mr.bean.ReportGenerator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathResource res=new ClassPathResource("com/springcore/mi/mr/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		ReportGenerator rg=factory.getBean("rg",ReportGenerator.class);
		rg.generate(530007);
		
		
	}

}
