package com.springcore.si.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.si.bean.PaymentContext;

public class PaymentContextTest {

	public static void main(String[] args) {

		ClassPathResource resource=new ClassPathResource("com/springcore/si/cfg/beans.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		PaymentContext ctx=factory.getBean("paymentcontext",PaymentContext.class);
		ctx.payBill(5214.25, 5588);
		
	}

}
