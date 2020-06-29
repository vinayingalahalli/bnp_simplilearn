package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerDAO {
	public Player createPlayer(Player player)throws BusinessException;
	public Player getPlayerById(int id) throws BusinessException;
	public void removePlayerById(int id)throws BusinessException;
	public List<Player> getAllPlayers()throws BusinessException;
	public List<Player> getPlayersByName(String name) throws BusinessException;
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessException;
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	public List<Player> getPlayersByGender(String gender)throws BusinessException;
	public List<Player> getPlayersByAgeRange(int upper,int lower)throws BusinessException;
}
