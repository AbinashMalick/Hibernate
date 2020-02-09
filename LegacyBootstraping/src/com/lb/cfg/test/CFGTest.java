package com.lb.cfg.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lb.cfg.util.CFGSessionFactoryRegistry;
import com.lb.entities.Address;

public class CFGTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Address address = null;
		try {
			sessionFactory = CFGSessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			address = (Address) session.get(Address.class, 1011);
			System.out.println(address);
		}
		finally {
			if(sessionFactory!=null) {
				CFGSessionFactoryRegistry.closeSessionFactory();
			}
		}
	}
}
