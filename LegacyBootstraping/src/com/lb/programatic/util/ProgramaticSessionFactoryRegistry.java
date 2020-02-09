package com.lb.programatic.util;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgramaticSessionFactoryRegistry {
	private static SessionFactory sessionFactory = null;
	static {
		Properties props = new Properties();
		try {
			props.load(ProgramaticSessionFactoryRegistry.class.getClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Configuration configuration = new Configuration();
		configuration.setProperty("hibernate.connection.driver_class", props.getProperty("db.driver_classname"));
		configuration.setProperty("hibernate.connection.url", props.getProperty("db.url"));
		configuration.setProperty("hibernate.connection.username", props.getProperty("db.username"));
		configuration.setProperty("hibernate.connection.password", props.getProperty("db.password"));
		configuration.setProperty("hibernate.show_sql", "ture");
		configuration.addResource("com/lb/entities/Address.hbm.xml");

		sessionFactory = configuration.buildSessionFactory();
		
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
