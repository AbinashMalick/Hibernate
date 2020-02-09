package com.ha.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ha.entities.Sparepart;
import com.ha.util.SessionFactoryRegistry;

public class SparepartDao {
	SessionFactory sessionFactory = null;
	Session session = null;
	Transaction transaction = null;
	boolean flag = false;

	public Sparepart saveSparepart(Sparepart sparepart) {
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(sparepart);
			System.out.println("Data Inserted...");
			flag = true;
		}finally {
			if(session!=null && transaction!=null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
		}
		return sparepart;
	}
}
