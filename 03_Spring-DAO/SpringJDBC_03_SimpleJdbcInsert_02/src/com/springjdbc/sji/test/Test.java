package com.springjdbc.sji.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.sji.dao.PlayersDao;
import com.springjdbc.sji.modal.Players;

public class Test {

	public static void main(String[] args) throws Exception {


				ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springjdbc/sji/cfg/Beans.xml");
				PlayersDao dao = ctx.getBean("playersdao", PlayersDao.class);
				
				Players model = new Players(111, "Ashok", 25);
				boolean isInserted=dao.insert(model);
				System.out.println("Record Inserted ? :" + isInserted);
				
	}

	
}
