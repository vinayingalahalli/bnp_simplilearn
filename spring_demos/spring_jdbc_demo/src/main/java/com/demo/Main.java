package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.PlayerDAO;
import com.demo.model.Player;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("jdbcbean.xml");
		PlayerDAO dao=(PlayerDAO) context.getBean("dao");
		
		//dao.createPlayer(new Player("Sachin", "India", 41, "M"));
		//System.out.println(dao.getPlayerById(3));
		
		List<Player> playerList=dao.getAllPlayers();
		for(Player p:playerList) {
			System.out.println(p);
		}
	}

}
