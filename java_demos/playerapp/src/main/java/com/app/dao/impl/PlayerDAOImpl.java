package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dbutil.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	@Override
	public Player createPlayer(Player player) throws BusinessException {
		int c = 0;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "insert into player(id,name,teamName,age,gender) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setString(3, player.getTeamName());
			preparedStatement.setInt(4, player.getAge());
			preparedStatement.setString(5, player.getGender());
			c = preparedStatement.executeUpdate();
		} catch (SQLIntegrityConstraintViolationException e) {
			throw new BusinessException("Player with Id " + player.getId() + " already exists");
		}

		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured please constact sysadmin");
		}
		if (c == 0) {
			throw new BusinessException("Unable to insert");
		}

		return player;
	}

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select name,gender,age,teamname from player where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				player=new Player();
				player.setId(id);
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setTeamName(resultSet.getString("teamname"));
			}else {
				throw new BusinessException("Player with id "+id+" doesnt exist");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured please constact sysadmin");
		}
		return player;
	}

	@Override
	public void removePlayerById(int id) throws BusinessException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList=new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select id,name,gender,age,teamname from player";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(resultSet.getString("gender"));
				player.setTeamName(resultSet.getString("teamname"));
				playerList.add(player);
			}
			if(playerList.size()==0) {
				throw new BusinessException("No Players as of now in DB");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured please constact sysadmin");
		}
		return playerList;
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
		List<Player> playerList=new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select id,name,age,teamname from player where gender=upper(?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, gender);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player=new Player();
				player.setId(resultSet.getInt("id"));
				player.setAge(resultSet.getInt("age"));
				player.setName(resultSet.getString("name"));
				player.setGender(gender);
				player.setTeamName(resultSet.getString("teamname"));
				playerList.add(player);
			}
			if(playerList.size()==0) {
				throw new BusinessException("No Players as of now in DB with gender "+gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured please contact sysadmin");
		}
		return playerList;
	}

}
