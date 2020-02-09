package com.ht.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ht.entities.Address;
public class HTTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Address address = (Address) session.get(Address.class, 5011);
		System.out.println(address);
	
		session.close();
		sessionFactory.close();
		
	}
}
