package com.springjdbc.jt.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.jt.dao.PlayersDao;
import com.springjdbc.jt.model.Players;

public class Test {

	public static void main(String[] args) throws Exception {

		// Storing data in Dto obj
		/*
		 * BookDTO dto = new BookDTO(); dto.setBookId(104); dto.setBookName(
		 * "adv core"); dto.setAuthorName("james"); dto.setIsbn("ISBN002");
		 * dto.setPrice(660.00);
		 */

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springjdbc/jt/cfg/Bean.xml");
		PlayersDao dao = ctx.getBean("playerdao", PlayersDao.class);
		
		//insert data
		// dao.insert(101, "Sehwag", 38);
		
		//insert using parameter statement
		// dao.insertUsingPstmt(102, "Sachin", 40);
		
		//update
		//dao.updateAgeById(101, 39);
		
		//get all players using list
		//dao.getAllPlayersUsingList();
		
		//get all players using map
		dao.getPlayerByIdUsingMap(102);
		
		//get player details
		//dao.getPlayerNameById(101);
		
		//get player details using row mapper
		//dao.getPlayerByIdWithMapper(101);
		
		//get all players details
		//dao.getPlayersWithRowMapper();

		List<Players> pList = new ArrayList<>();
		Players p1 = new Players(103, "Kohli", 29);
		Players p2 = new Players(104, "Dhoni", 35);
		Players p3 = new Players(105, "Rahane", 30);

		pList.add(p1);
		pList.add(p2);
		pList.add(p3);

		//dao.insertUsingBatch(pList);
	}

}
