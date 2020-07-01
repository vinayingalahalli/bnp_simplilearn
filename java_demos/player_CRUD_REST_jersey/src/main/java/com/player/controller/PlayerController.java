package com.player.controller;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.player.exception.BusinessException;
import com.player.model.Player;
import com.player.service.PlayerService;
import com.player.service.impl.PlayerServiceImpl;

@Path("/player")
public class PlayerController {
private PlayerService service=new PlayerServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Player createPlayer(Player player) {
		return service.createPlayer(player);
	}
	
//	@GET
//	@Path("/{id}")
//	public Player getPlayerById(@PathParam("id") int id) {
//		return service.getPlayerById(id);
//	}
	@GET
	@Path("/{id}")
	public Response getPlayerById(@PathParam("id") int id) {
		try {
			return Response.ok(service.getPlayerById(id), MediaType.APPLICATION_JSON).build();
		} catch (BusinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}
	
	@DELETE
	@Path("/{id}")
	public void removePlayerById(@PathParam("id")int id) {
		 service.removePlayer(id);
	}
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Player updatePlayer(Player player) {
		return service.updatePlayer(player);
	}
}
