package com.ha.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	static {
		try {
			Configuration configuration = new Configuration().configure();
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			sessionFactory = configuration.buildSessionFactory(registry);
			}catch(HibernateException e) {
				e.printStackTrace();
				throw e;
			}
		}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void closeSessionFactory() {
		if(sessionFactory!=null) {
			sessionFactory.close();
		}
	}
}
