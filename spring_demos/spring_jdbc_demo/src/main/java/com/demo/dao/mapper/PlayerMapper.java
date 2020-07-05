package com.demo.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.model.Player;

public class PlayerMapper implements RowMapper<Player> {

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		Player player=new Player();
		player.setId(rs.getInt("id"));
		player.setAge(rs.getInt("age"));
		player.setGender(rs.getString("gender"));
		player.setName(rs.getString("name"));
		player.setTeamName(rs.getString("teamName"));
		return player;
	}

}
