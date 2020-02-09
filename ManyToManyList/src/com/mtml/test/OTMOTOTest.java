package com.mtml.test;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtml.entities.Game;
import com.mtml.entities.Player;
import com.mtml.util.SessionFactoryRegistry;


public class OTMOTOTest {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		boolean flag = false;
		try {
			factory = SessionFactoryRegistry.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
			List<Player> players = new ArrayList<Player>();
			
			Player player = new Player();
			player.setName("Sachin");
			player.setGender("Male");
			player.setAge(45);
			player.setFormate("Test");
			session.save(player);
			
			Player player1 = new Player();
			player1.setName("Virat");
			player1.setGender("Male");
			player1.setAge(30);
			player1.setFormate("Test");
			session.save(player1);
			
			Game game = new Game();
			game.setGameName("Cricket");
			game.setType("Outdoor");
			game.setConductedDate(new Date());
			players.add(player);
			players.add(player1);
			game.setPlayers(players);

			
			session.save(game);
			
			flag = true;
		}finally {
			if(tx!=null) {
				if(flag) {
					tx.commit();
				}else {
					tx.rollback();
				}
				SessionFactoryRegistry.close();
			}
		}
	}
}
