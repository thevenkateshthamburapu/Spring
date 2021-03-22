package com.springaop.ara.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.ara.bean.LoanCalculator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springaop/ara/cfg/Bean.xml");
		LoanCalculator lc = (LoanCalculator) context.getBean("loan");

		double i = lc.computeRi(500000, 12, 2);
		System.out.println("Loan amount :" + i);
		
	}

}


	/*Context-we add context namespace in xml file

	AOP-we add AOP namespace in xml file while performing 
	AOP Operations*/

	/*we want add aspectjrt-1.6.11.jar and
	aspectjweaver-1.8.13.jar*/
