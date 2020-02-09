package com.mt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mt.entities.Advisor;

public class MTTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session =sessionfactory.openSession();
		
		Advisor advisor = (Advisor)session.get(Advisor.class, 1005);
		System.out.println(advisor);
	}
}
