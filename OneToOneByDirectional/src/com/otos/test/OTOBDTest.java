package com.otos.test;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otos.entities.DTHBox;
import com.otos.entities.DigitalCard;
import com.otos.util.SessionFactoryRegistry;

public class OTOBDTest {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		boolean flag = false;
		try {
			factory = SessionFactoryRegistry.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
			
			DTHBox dthBox = new DTHBox();
			dthBox.setDthBoxName("Tata sky");
			dthBox.setBoxType("HD");
			dthBox.setManufactureDate(new Date());
			
			DigitalCard card = new DigitalCard();
			card.setCardName("Smart Card");
			card.setCardType("Commercial");
			card.setSubcriptionPack("255 Full pack");
			card.setDthBox(dthBox);
			
			
			
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
