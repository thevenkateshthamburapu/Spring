package com.springjdbc.npjt.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.npjt.modal.Players;

public class PlayerRowMapper implements RowMapper<Players> {

	@Override
	public Players mapRow(ResultSet rs, int counter) throws SQLException {

		Players p = new Players();
		p.setPlayerId(rs.getInt("PLAYER_ID"));
		p.setPlayerName(rs.getString("PLAYER_NAME"));
		p.setPlayerAge(rs.getInt("PLAYER_AGE"));

		return p;

	}

}
