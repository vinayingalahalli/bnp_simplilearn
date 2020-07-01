package com.player.dao;

import java.util.List;

import com.player.exception.BusinessException;
import com.player.model.Player;

public interface PlayerDAO {
	public Player createPlayer(Player player);
	public Player updatePlayer(Player player);
	public Player getPlayerById(int id) throws BusinessException;
	public void removePlayer(int id);
	public List<Player> getAllPlayers();
}
