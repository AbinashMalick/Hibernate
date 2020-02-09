package com.sfm.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory=null;
	
	static {
		try {
			System.out.println("Static block executed..");
			Configuration configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			System.out.println(sessionFactory.hashCode());
		}
		catch(HibernateException e) {
			e.printStackTrace();
			throw e;
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void closeSessionFactory() {
		if (sessionFactory!=null) {
			sessionFactory.close();
		}
	}
}
