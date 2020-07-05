package com.player.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.player.dao.PlayerDAO;
import com.player.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	private SessionFactory factory ;
	

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public Player createPlayer(Player player) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(player);
		transaction.commit();
		session.close();
		return player;
	}

	public Player updatePlayer(Player player) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(player);
		transaction.commit();
		session.close();
		return player;
	}

	public Player getPlayerById(int id)  {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Player player=(Player) session.get(Player.class,id);
		transaction.commit();
		session.close();
		
		return player;
	}

	public void removePlayer(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Player p=new Player();
		p.setId(id);
		session.delete(p);
		transaction.commit();
		session.close();

	}

	public List<Player> getAllPlayers() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Player> playerList=session.createQuery("from com.player.model.Player").list();
		transaction.commit();
		session.close();
		return playerList;
	}

}
