package com.springjdbc.sjc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.sjc.dao.PlayersDao;

public class Test {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springjdbc/sjc/cfg/Beans.xml");
		PlayersDao dao = ctx.getBean("playersdao", PlayersDao.class);

		dao.getPlayerById(106);

	}

}
