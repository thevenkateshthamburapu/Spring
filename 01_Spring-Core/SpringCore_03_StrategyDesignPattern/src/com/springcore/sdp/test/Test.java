package com.springcore.sdp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.sdp.bean.PaymentContext;

public class Test {

	public static void main(String[] args) throws Exception {
		
		ClassPathResource res=new ClassPathResource("com/springcore/sdp/cfg/bean.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		PaymentContext ctx=factory.getBean("paymentcontext",PaymentContext.class);
		ctx.payBill(4500.00);
	 
	}

}
