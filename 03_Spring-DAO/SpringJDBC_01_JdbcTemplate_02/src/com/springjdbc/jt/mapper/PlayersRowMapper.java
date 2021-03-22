package com.springjdbc.jt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.jt.model.Players;

public class PlayersRowMapper implements RowMapper<Players> {

	@Override
	public Players mapRow(ResultSet rs, int cnt) throws SQLException {
		Players model = new Players();
		
		model.setPlayerId(rs.getInt("PLAYER_ID"));
		model.setPlayerName(rs.getString("PLAYER_NAME"));
		model.setPlayerAge(rs.getInt("PLAYER_AGE"));

		return model;
	}
}
