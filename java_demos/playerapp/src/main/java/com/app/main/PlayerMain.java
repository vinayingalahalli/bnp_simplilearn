package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.bo.PlayerBO;
import com.app.bo.impl.PlayerBoImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Player App");
		Scanner scanner = new Scanner(System.in);
		PlayerBO playerBO = new PlayerBoImpl();
		int ch = 0;
		do {
			System.out.println("Player Menu");
			System.out.println("----------------");
			System.out.println("1)Add Player");
			System.out.println("2)Remove Player");
			System.out.println("3)Search Player By id");
			System.out.println("4)Get All Players");
			System.out.println("5)EXIT");
			System.out.println("Enter your choice");
			ch = Integer.parseInt(scanner.nextLine());

			switch (ch) {
			case 1:
				System.out.println("Enter Player details");
				System.out.println("Enter Player Id");
				int id=Integer.parseInt(scanner.nextLine());
				System.out.println("Enter player name");
				String name = scanner.nextLine();
				System.out.println("Enter player teamName");
				String teamName = scanner.nextLine();
				System.out.println("Enter player age");
				int age=Integer.parseInt(scanner.nextLine());
				System.out.println("Enter Player Gender(m/f/o)");
				String gender=scanner.nextLine();
				Player player=new Player(id, name, teamName, age, gender);
				
				try {
					player = playerBO.createPlayer(player);
					if (player != null && player.getId() != 0) {
						System.out.println("Player created with below details");
						System.out.println(player);
					}
				} catch (BusinessException e1) {
					System.out.println(e1.getMessage());
				}
				
				break;
			case 2:
				System.out.println("Under construction please try other option");

				break;
			case 3:
				System.out.println("Enter player id for player details");
				int id1 = Integer.parseInt(scanner.nextLine());
				try {
					Player p = playerBO.getPlayerById(id1);
					if (p != null) {
						System.out.println("Player with id " + id1 + " found with details ");
						System.out.println(p);
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 4:
				List<Player> playerList;
				try {
					playerList = playerBO.getAllPlayers();
					if (playerList != null && playerList.size() > 0) {
						System.out.println("Total there are " + playerList.size() + " no of players.. Details are");
						for (Player p1 : playerList) {
							System.out.println(p1);
						}
					} 
				} catch (BusinessException e) {
					System.out.println(e);
				}
				break;
			case 5:
				System.out.println("Thank you for using our app");

				break;

			default:
				System.out.println("Invalid option Try again");
				break;
			}
		} while (ch != 5);
	}

}
