package com.app.bo;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerBO {

	public Player createPlayer(Player player);
	public Player getPlayerById(int id) throws BusinessException;
	public void removePlayerById(int id);
	public List<Player> getAllPlayers();
	public List<Player> getPlayersByName(String name) throws BusinessException;
	public List<Player> getPlayersByTeamName(String teamname) throws BusinessException;
}
