package com.app.bo;

import com.app.model.Player;

public class PlayerBOImpl implements PlayerBO{

	@Override
	public Player createPlayer(Player player) {
		player.setId(100);
		return player;
	}

	@Override
	public Player getPlayerById(int id) {
		
		return new Player(id, "dffd", "fsd", 11, "m");
	}

}
