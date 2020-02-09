package com.mtmm.test;


import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtmm.entities.Participant;
import com.mtmm.entities.Product;
import com.mtmm.util.SessionFactoryRegistry;


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
			Map<Float, Participant> bidder = new HashMap<Float, Participant>();
			
			Participant part = new Participant();
			part.setParticipantName("Jogender");
			part.setContactNo(9865321);
			part.setEmailAdress("jogi@gmail.com");
			session.save(part);
			
			Participant part1 = new Participant();
			part1.setParticipantName("Harindar");
			part1.setContactNo(98654564);
			part1.setEmailAdress("hari@gmail.com");
			session.save(part1);
			System.out.println(part1);
			
			Product product = new Product();
			product.setProductName("Lenovo K5 Note");
			product.setBasePrice(100f);
			product.setBidder(bidder);
			bidder.put(101f, part);
			bidder.put(102f, part1);
			
			
			session.save(product);
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
