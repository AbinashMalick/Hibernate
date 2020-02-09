package com.tm.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tm.entities.Advisor;

public class TrTest {

	public static void main(String[] args) {
		boolean flag = false;
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
			
			Advisor advisor = new Advisor();
			advisor.setAdvisorNo(2019);
			advisor.setFirstName("hemant");
			advisor.setLastName("roy");
			advisor.setQualification("Mtech");
			advisor.setExperience(4);
			advisor.setContactNo(9863212);
			advisor.setEmailAddress("hemant12.das@gmail.com");
			
			Advisor advisor1 = new Advisor();
			advisor1.setAdvisorNo(2020);
			advisor1.setFirstName("komal");
			advisor1.setLastName("Meheta");
			advisor1.setQualification("MCA");
			advisor1.setExperience(2);
			advisor1.setContactNo(98132412);
			advisor1.setEmailAddress("komal.meheta@gmail.com");
			
			Advisor advisor2 = new Advisor();
			advisor2.setAdvisorNo(2021);
			advisor2.setFirstName("nayantara");
			advisor2.setLastName("kapoor");
			advisor2.setQualification("MCA");
			advisor2.setExperience(3);
			advisor2.setContactNo(9587212);
			advisor2.setEmailAddress("nayamtara.k@gmail.com");
			
			session.save(advisor);
			session.save(advisor1);
			session.save(advisor2);
			flag = true;
		}
		finally {
			if(session!=null && transaction!=null) {
				if(flag) {
			
					transaction.commit();
					System.out.println("record inserted...");
				}
				else {
					transaction.rollback();
					System.out.println("failed to insert");
				}	
			}
		
		}
		session.close();
		sessionFactory.close();
	}
}
