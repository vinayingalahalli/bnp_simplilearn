package com.jdbc.demo.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.exception.BusinessException;
import com.jdbc.demo.model.Player;
import com.jdbc.demo.util.MySqlConnection;

public class PlayerInsert {

	public int createPlayer(Player player) {
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
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured please constact sysadmin");
		}
		
		return c;
		
	}
	
	public int createPlayerBatch(List<Player> playerList) {
		int c=0;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="insert into player(id,name,teamName,age,gender) values(?,?,?,?,?)";
			PreparedStatement  preparedStatement=connection.prepareStatement(sql);
			for(Player player:playerList) {
			
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setString(3, player.getTeamName());
			preparedStatement.setInt(4, player.getAge());
			preparedStatement.setString(5, player.getGender());
		//	c=preparedStatement.executeUpdate();
			preparedStatement.addBatch();
			}
			c=preparedStatement.executeBatch().length;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured please contact sysadmin");
		}
		
		return c;
		
	}
	
	public int createPlayerBatchTransaction(List<Player> playerList) {
		int c=0;
		Connection connection=null;
		try {
			connection=MySqlConnection.getConnection();
			connection.setAutoCommit(false);
			String sql="insert into player(id,name,teamName,age,gender) values(?,?,?,?,?)";
			PreparedStatement  preparedStatement=connection.prepareStatement(sql);
			for(Player player:playerList) {
			
			preparedStatement.setInt(1, player.getId());
			preparedStatement.setString(2, player.getName());
			preparedStatement.setString(3, player.getTeamName());
			preparedStatement.setInt(4, player.getAge());
			preparedStatement.setString(5, player.getGender());
		//	c=preparedStatement.executeUpdate();
			preparedStatement.addBatch();
			}
			c=preparedStatement.executeBatch().length;
			connection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			try {
				System.out.println("Rolling back");
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println(e);
			}
			throw new BusinessException("Internal error occured please contact sysadmin");
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		
		return c;
		
	}
}
