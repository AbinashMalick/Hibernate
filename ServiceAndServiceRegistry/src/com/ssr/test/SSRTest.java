package com.ssr.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import com.ssr.service.CustomConnectionProviderImpl;

public class SSRTest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings( configuration.getProperties()).addService(ConnectionProvider.class, new CustomConnectionProviderImpl()).build();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
		Session session = sessionFactory.openSession();
		session.close();
		sessionFactory.close();
	}
}
