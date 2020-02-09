package com.persistency.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hd.entities.Vehicle;

public class HibernateHelper {
	SessionFactory sessionfactory=null;
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		return sessionfactory;
	}
}
