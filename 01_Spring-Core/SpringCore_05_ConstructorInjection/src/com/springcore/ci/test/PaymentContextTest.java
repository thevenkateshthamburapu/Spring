package com.springcore.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.springcore.ci.bean.PaymentContext;

public class PaymentContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathResource res=new ClassPathResource("com/springcore/ci/cfg/Beans.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		PaymentContext ctx=fact.getBean("paymentcontext",PaymentContext.class);
		ctx.payBill(6478.09, 9876);
		
	}

}
