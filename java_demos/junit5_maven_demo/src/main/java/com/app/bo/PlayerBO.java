package com.app.bo;

import com.app.model.Player;

public interface PlayerBO {

	public Player createPlayer(Player player);

	public Player getPlayerById(int id);

}
