package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dbutil.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;


public class PlayerDAOImpl implements PlayerDAO {

	@Override
	public Player createPlayer(Player player) throws BusinessException {
		int c=0;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="insert into player(id,name,teamName,age,gender) values(?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setString(3, player.getTeamName());
			preparedStatement.setInt(4, player.getAge());
			preparedStatement.setString(5, player.getGender());
			c=preparedStatement.executeUpdate();
		}catch(SQLIntegrityConstraintViolationException e) {
			throw new BusinessException("Player with Id "+player.getId()+" already exists");
		}
		
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured please constact sysadmin");
		}
		if(c==0) {
			throw new BusinessException("Unable to insert");
		}
		
		return player;
	}

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePlayerById(int id) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
