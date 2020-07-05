package com.demo.dao;

import java.util.List;

import com.demo.model.Player;

public interface PlayerDAO {

	public Player createPlayer(Player player);
	public Player getPlayerById(int id);
	public List<Player> getAllPlayers();
	public List<Player> getPlayersByTeamName(String teamName);
	public void removePlayerById(int id);
}
