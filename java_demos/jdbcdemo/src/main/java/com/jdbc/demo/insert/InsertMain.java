package com.jdbc.demo.insert;

import java.util.ArrayList;
import java.util.List;

import com.jdbc.demo.model.Player;

public class InsertMain {

	public static void main(String[] args) {
		PlayerInsert pi=new PlayerInsert();
//		int c=pi.createPlayer(new Player(109, "Geeta", "Australia", 26, "F"));
//		System.out.println(c+" player/s registered successfully");
		List<Player> playerList=new ArrayList<>();
		playerList.add(new Player(110, "Jay", "India", 33, "M"));
		playerList.add(new Player(111, "Meera", "India", 22, "F"));
		//playerList.add(new Player(108, "Ben", "UK", 24, "M"));
		System.out.println(pi.createPlayerBatchTransaction(playerList));

	}

}
//Try Update delete player as assignment