package com.player.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.player.dao.PlayerDAO;
import com.player.model.Player;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-orm.xml");
		PlayerDAO dao=(PlayerDAO) context.getBean("dao");
		//System.out.println(dao.createPlayer(new Player("Jaya", "US", 34, "F")));
		System.out.println(dao.getPlayerById(4));
		
		List<Player> playerList=dao.getAllPlayers();
		for(Player p:playerList) {
			System.out.println(p);
		}
	}

}
