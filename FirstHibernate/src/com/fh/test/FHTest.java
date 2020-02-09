package com.fh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fh.entities.Advisor;
import com.fh.entities.Mechanic;

public class FHTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Mechanic mechanic = (Mechanic) session.get(Mechanic.class, 5015);
		System.out.println(mechanic);
	
		session.close();
		sessionFactory.close();
		
		Configuration configuration1 = new Configuration().configure("hibernate-advisor.cfg.xml");
		SessionFactory sfactory = configuration1.buildSessionFactory();
		Session session1 = sfactory.openSession();
		
		Advisor advisor = (Advisor) session1.get(Advisor.class, 1002);
		System.out.println(advisor);
		
		session1.close();
		sfactory.close();
	
	}
}
