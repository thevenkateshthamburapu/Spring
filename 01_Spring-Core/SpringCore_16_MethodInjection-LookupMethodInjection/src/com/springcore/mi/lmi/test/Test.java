package com.springcore.mi.lmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.mi.lmi.bean.TokenGenerator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res=new ClassPathResource("com/springcore/mi/lmi/cfg/Bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		TokenGenerator tg=factory.getBean("tg",TokenGenerator.class);
		System.out.println("Hashcode-1: "+tg.getToken().hashCode());
		System.out.println("Hashcode-2: "+tg.getToken().hashCode());
		
		
		/*In spring when a non-singleton bean is getting
		injected into a singleton bean the result will 
		be always singleton only.
		but we got different hashcodes every time call
		*/
	}

}
