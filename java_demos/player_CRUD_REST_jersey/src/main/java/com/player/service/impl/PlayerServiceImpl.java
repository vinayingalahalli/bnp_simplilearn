package com.player.service.impl;

import java.util.List;

import com.player.dao.PlayerDAO;
import com.player.dao.impl.PlayerDAOImpl;
import com.player.exception.BusinessException;
import com.player.model.Player;
import com.player.service.PlayerService;

public class PlayerServiceImpl implements PlayerService {
private PlayerDAO playerDAO=new PlayerDAOImpl();
	public Player createPlayer(Player player) {
		
		return playerDAO.createPlayer(player);
	}

	public Player updatePlayer(Player player) {
		
		return playerDAO.updatePlayer(player);
	}

	public Player getPlayerById(int id) throws BusinessException{
		if(id<0 || id>100) {
			throw new BusinessException("Player Id "+id+" is invalid");
		}
		return playerDAO.getPlayerById(id);
	}

	public void removePlayer(int id) {
	playerDAO.removePlayer(id);
		
	}

	public List<Player> getAllPlayers() {
		
		return playerDAO.getAllPlayers();
	}

}
