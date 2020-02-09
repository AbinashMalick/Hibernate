package com.entities;




import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustTest {

	public static void main(String[] args) {
		Configuration conf = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sfactory = conf.buildSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx=null;
		tx=session.beginTransaction();
		Customer cr = new Customer();
		cr.setCustomer_id(103);
		cr.setFirst_name("Raja");
		cr.setLast_name("Rishab");
		cr.setDob(new Date("12-feb-19"));
		cr.setGender("Female"); 
		
		try {
			int i=(Integer)session.save(cr);
			tx.commit();
			System.out.println("object saved"+i);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(cr);
		
	
		/*Customer customer = (Customer) session.get(Customer.class, 101);
		System.out.println(customer);*/
	}
}
