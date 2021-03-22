package com.springjdbc.sji.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.springjdbc.sji.modal.Players;


public class PlayersDao {
	
	private SimpleJdbcInsert sji;

	public void setSji(SimpleJdbcInsert sji) {
		this.sji = sji;
	}

	public boolean insert(Players model) {
		sji.withTableName("CRICKET_PLAYERS");
		Map<String, Object> map = new HashMap();
		map.put("PLAYER_ID", model.getPlayerId());
		map.put("PLAYER_NAME", model.getPlayerName());
		map.put("PLAYER_AGE", model.getPlayerAge());
		int status=sji.execute(map);
		return status>0?true:false;
		
	}

}
