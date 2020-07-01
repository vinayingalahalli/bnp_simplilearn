package com.player.service;

import java.util.List;

import com.player.exception.BusinessException;
import com.player.model.Player;

public interface PlayerService {

	public Player createPlayer(Player player);
	public Player updatePlayer(Player player);
	public Player getPlayerById(int id) throws BusinessException;
	public void removePlayer(int id);
	public List<Player> getAllPlayers();
	public List<Player> getPlayersByName(String name)throws BusinessException;
	public List<Player> getPlayersByTeamName(String teamName)throws BusinessException;
	public List<Player> getPlayersByAgeRange(int upper,int lower) throws BusinessException;
}

//After this is done enchance it to Team class and move teamName to Team class and bring on relationship between Player & Team
