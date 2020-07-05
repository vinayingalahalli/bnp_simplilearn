package com.demo.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.demo.dao.PlayerDAO;
import com.demo.dao.mapper.PlayerMapper;
import com.demo.model.Player;

public class PlayerDAOImpl implements PlayerDAO	{

	private JdbcTemplate template;
	private DataSource dataSource;
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template=new JdbcTemplate(this.dataSource);
	}

	@Override
	public Player createPlayer(Player player) {
		String sql="insert into player(name,age,gender,teamName) values(?,?,?,?)";
		template.update(sql,player.getName(),player.getAge(),player.getGender(),player.getTeamName());
		return player;
	}

	@Override
	public Player getPlayerById(int id) {
		String sql="select id,name,age,gender,teamName from player where id=?";
		Player player = template.queryForObject(sql, new Object[] {id}, new PlayerMapper());
		return player;
	}

	@Override
	public List<Player> getAllPlayers() {
		String sql="select id,name,age,gender,teamName from player";
		List<Player> playerList=template.query(sql, new PlayerMapper());
		return playerList;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePlayerById(int id) {
		// TODO Auto-generated method stub
		
	}

}
