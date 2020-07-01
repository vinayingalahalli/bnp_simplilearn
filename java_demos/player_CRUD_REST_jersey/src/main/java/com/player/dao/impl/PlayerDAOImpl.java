package com.player.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.player.dao.PlayerDAO;
import com.player.exception.BusinessException;
import com.player.model.Player;

public class PlayerDAOImpl implements PlayerDAO {
	private Configuration configuration = new Configuration().configure();
	private StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	private SessionFactory factory = configuration.buildSessionFactory(builder.build());

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

	public Player getPlayerById(int id) throws BusinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Player player=(Player) session.get(Player.class,id);
		transaction.commit();
		session.close();
		if(player==null) {
			throw new BusinessException("No Player Found with ID "+id);
		}
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
