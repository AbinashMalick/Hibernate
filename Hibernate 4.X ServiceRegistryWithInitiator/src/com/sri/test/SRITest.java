package com.sri.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sri.initiator.CustomConfigurableConnectionProviderInitator;

public class SRITest {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure(); 
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).addInitiator(new CustomConfigurableConnectionProviderInitator());
		StandardServiceRegistry registry = builder.build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
		Session session = sessionFactory.openSession();
		session.close();
	}
}
