package com.springjdbc.npjt.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

import com.springjdbc.npjt.modal.Players;


public class PlayersDao {
	
	private NamedParameterJdbcTemplate npjt;

	public void setNpjt(NamedParameterJdbcTemplate npjt) {
		this.npjt = npjt;
	}
	
	public boolean insertUsingNamedParams(Players p) {
		String query = "insert into CRICKET_PLAYERS values(:id,:name,:age)";
		Map<String, Object> paramsMap = new HashMap();
		paramsMap.put("id", p.getPlayerId());
		paramsMap.put("name", p.getPlayerName());
		paramsMap.put("age", p.getPlayerAge());
		int status= npjt.update(query, paramsMap);
		return status>0?true:false;
		
	}

	public void getNameById(int id) {
		String query = "SELECT PLAYER_NAME FROM CRICKET_PLAYERS WHERE PLAYER_ID=:playerId";
		Map<String, Object> paramMap = new HashMap();
		paramMap.put("playerId", id);
		String name = npjt.queryForObject(query, paramMap, String.class);
		System.out.println(name);
	}

	public void batchExecutionWithNamedParams(final List<Players> pList) {
		String query = "insert into CRICKET_PLAYERS values(:playerId,:playerName,:playerAge)";
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(pList.toArray());
		System.out.println(batch);
		int[] status=npjt.batchUpdate(query, batch);
		System.out.println("on of row effected "+status);
	}

}
