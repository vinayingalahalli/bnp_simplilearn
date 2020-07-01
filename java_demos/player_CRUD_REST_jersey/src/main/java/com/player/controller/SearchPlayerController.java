package com.player.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.player.model.Player;
import com.player.service.PlayerService;
import com.player.service.impl.PlayerServiceImpl;

@Path("/players")
public class SearchPlayerController {

	private PlayerService service=new PlayerServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Player> getAllPlayers(){
		return service.getAllPlayers();
	}
}
