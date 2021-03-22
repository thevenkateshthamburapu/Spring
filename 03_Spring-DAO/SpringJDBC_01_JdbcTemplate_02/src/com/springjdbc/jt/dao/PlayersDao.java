package com.springjdbc.jt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.springjdbc.jt.mapper.PlayersRowMapper;
import com.springjdbc.jt.model.Players;

public class PlayersDao {

	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void insert(int id, String name, int age) {
		String sql = "INSERT INTO CRICKET_PLAYERS VALUES(?,?,?)";
		int no = jt.update(sql, id, name, age);
		System.out.println("no.of rows effected : " + no);
	}

	public void insertUsingPstmt(int id, String name, int age) {
		String sql = "INSERT INTO CRICKET_PLAYERS VALUES(?,?,?)";
		jt.execute(sql, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				System.out.println("no.of rows effected : " + 1);
				return pstmt.execute();
			}
		});
	}

	public void updateAgeById(int id, int age) {
		String sql = "UPDATE CRICKET_PLAYERS SET PLAYER_AGE=? WHERE PLAYER_ID=?";
		int cnt = jt.update(sql, age, id);
		System.out.println("Rows effected : " + cnt);
	}

	public void getAllPlayersUsingList() {
		String sql = "SELECT * FROM CRICKET_PLAYERS";
		List<Map<String, Object>> mapsList = jt.queryForList(sql);
		Iterator<Map<String, Object>> itr = mapsList.iterator();
		while (itr.hasNext()) {
			Map<String, Object> map = itr.next();
			System.out.println(map);
		}
	}

	public void getPlayerByIdUsingMap(int id) {
		String sql = "SELECT player_id,player_name FROM CRICKET_PLAYERS where player_id=?";
		Map<String, Object> map = jt.queryForMap(sql, id);
		System.out.println(map);
	}

	public void getPlayerNameById(int id) {
		String sql = "SELECT player_name FROM CRICKET_PLAYERS where player_id=?";
		String name = jt.queryForObject(sql, new Object[] { id }, String.class);
		System.out.println(name);
	}

	public void getPlayerByIdWithMapper(int id) {
		String sql = "SELECT * FROM CRICKET_PLAYERS where player_id=?";
		Players model = jt.queryForObject(sql, new Object[] { id }, new PlayersRowMapper());
		System.out.println(model);
	}

	public void getPlayersWithRowMapper() {
		Map<Integer, Players> pMap = new HashMap();
		String sql = "SELECT * FROM CRICKET_PLAYERS";
		List<Players> modelsList = jt.query(sql, new PlayersRowMapper());
		Iterator<Players> itr = modelsList.iterator();
		while (itr.hasNext()) {
			Players pModel = itr.next();
			pMap.put(pModel.getPlayerId(), pModel);
		}
		System.out.println(pMap);

	}

	public void insertUsingBatch(List<Players> pList) {
		String sql = "insert into cricket_players values(?,?,?)";
		List<Object[]> paramsArr = new ArrayList<Object[]>();
		for (Players model : pList) {
			Object[] objArr = { model.getPlayerId(), model.getPlayerName(), model.getPlayerAge() };
			paramsArr.add(objArr);
		}
		jt.batchUpdate(sql, paramsArr);
	}
	
	
}
