package com.springaop.ta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.ta.bean.DepartmentDao;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springaop/ta/cfg/Bean.xml");
		DepartmentDao dao = ctx.getBean("dao", DepartmentDao.class);
		dao.insert();
	}

}

	/*Context-we add context namespace in xml file

	AOP-we add AOP namespace in xml file while performing 
	AOP Operations*/

	/*we want add aspectjrt-1.6.11.jar and
	aspectjweaver-1.8.13.jar*/
