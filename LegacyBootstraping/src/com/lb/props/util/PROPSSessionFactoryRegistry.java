package com.lb.props.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PROPSSessionFactoryRegistry {
	private static SessionFactory sessionFactory = null;
	static {
		Configuration configuration = new Configuration();
		try {
			configuration.addResource("com/lb/entities/Address.hbm.xml");
			sessionFactory = configuration.buildSessionFactory();
			
		}catch(Exception e) {
			e.printStackTrace();
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
