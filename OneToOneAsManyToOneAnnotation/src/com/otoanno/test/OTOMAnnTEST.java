package com.otoanno.test;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otoanno.entities.Account;
import com.otoanno.entities.Organization;
import com.otoanno.util.SessionFactoryRegistry;


public class OTOMAnnTEST {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		Set<Account> account = null;
		boolean flag = false;
		try {
			factory = SessionFactoryRegistry.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
		
			
			Account acc = new Account();
			acc.setAccountHolderName("Abinash Malick");
			acc.setAccountType("Current Account");
			acc.setOpenDate(new Date());
			acc.setEmail("abinash@gmail.com");
			account = new HashSet<Account>();
			account.add(acc);
			session.save(acc);
			
			
			Organization org = new Organization();
			org.setOrganizationName("Stack space s/w solutions");
			org.setDescription("Product based Company");
			org.setBusinessType("Outsourcing");
			org.setEstDate(new Date());
			org.setAccount(account);
			session.save(org);
				
			System.out.println(org);
			
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
