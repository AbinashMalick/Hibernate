package com.lb.props.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lb.entities.Address;
import com.lb.props.util.PROPSSessionFactoryRegistry;

public class PROPTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Address address = null;
		try {
			sessionFactory = PROPSSessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			address = (Address) session.get(Address.class, 1011);
			System.out.println(address);
		}
		finally {
			if(sessionFactory!=null) {
				PROPSSessionFactoryRegistry.closeSessionFactory();
			}
		}
	}
}
