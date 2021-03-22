package com.springjdbc.npjt.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.npjt.dao.PlayersDao;
import com.springjdbc.npjt.modal.Players;

public class Test {

	public static void main(String[] args) throws Exception {


				ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springjdbc/npjt/cfg/Beans.xml");
				PlayersDao dao = ctx.getBean("playersdao", PlayersDao.class);
				
				Players p = new Players(126, "Dhavan", 29);
				/*boolean status=dao.insertUsingNamedParams(p);
				if(status){
					System.out.println("Successfully inserted!");
				}else{
					System.out.println("unable to insert!");
				}*/
				
				dao.getNameById(106);
				
				List<Players> pList = new ArrayList();
				Players p1 = new Players(107, "Kohli", 29);
				Players p2 = new Players(108, "Dhoni", 35);
				Players p3 = new Players(109, "Rahane", 30);
				pList.add(p1);
				pList.add(p2);
				pList.add(p3);
				//dao.batchExecutionWithNamedParams(pList);

				
	}

	
}
