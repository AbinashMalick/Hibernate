package com.otmoto.test;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmoto.entities.Account;
import com.otmoto.entities.Organization;
import com.otmoto.util.SessionFactoryRegistry;

public class OTMOTOTest {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		boolean flag = false;
		try {
			factory = SessionFactoryRegistry.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
			Organization org = new Organization();
			org.setOrganizationNo(8181);
			org.setOrganizationName("StackSpace Software Solution");
			org.setEstablishedDate(new Date());
			org.setBusinessType("Software ltd");
			session.save(org);
			System.out.println(org);
			Account account = new Account();
			account.setAccountId(3321);
			account.setAccountHolderName("SS Info");
			account.setAccountType("current");
			account.setOrganization(org);
			session.save(account);
			flag = true;
		}finally {
			if(tx!=null) {
				if(flag) {
					tx.commit();
				}else {
					tx.rollback();
				}
				SessionFactoryRegistry.close();
			}
		}
	}
}
