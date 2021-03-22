package com.springjdbc.sjc.dao;

import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;


public class PlayersDao {
	
	private SimpleJdbcCall sjc;

	
	public void setSjc(SimpleJdbcCall sjc) {
		this.sjc = sjc;
	}


	public void getPlayerById(Integer playerId) {
		SqlParameterSource in = new MapSqlParameterSource().addValue("PLAYERID", playerId);
		sjc.withProcedureName("GET_PLAYER_BY_ID");
		Map out = sjc.execute(in);
		System.out.println(out);
	}
}
