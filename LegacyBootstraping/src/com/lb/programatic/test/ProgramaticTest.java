package com.lb.programatic.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lb.entities.Address;
import com.lb.programatic.util.ProgramaticSessionFactoryRegistry;

public class ProgramaticTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Address address = null;
		try {
			sessionFactory = ProgramaticSessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			address = (Address) session.get(Address.class, 1011);
			System.out.println(address);
		}
		finally {
			if(sessionFactory!=null) {
				ProgramaticSessionFactoryRegistry.closeSessionFactory();
			}
		}
	}
}
