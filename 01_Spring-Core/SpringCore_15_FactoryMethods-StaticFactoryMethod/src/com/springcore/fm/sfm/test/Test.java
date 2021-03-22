package com.springcore.fm.sfm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.fm.sfm.bean.Alarm;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res=new ClassPathResource("com/springcore/fm/sfm/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Alarm a=factory.getBean("alarm",Alarm.class);
		a.ring();
		
		
	}

}
