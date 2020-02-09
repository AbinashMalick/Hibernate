package com.otms.test;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otms.entities.Benefits;
import com.otms.entities.InsurancePlan;
import com.otms.util.SessionFactoryRegistry;

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
			Set<Benefits> sbenifit=new HashSet<Benefits>();
			Benefits benefits=new Benefits();
			benefits.setBenefitName("Upto 5 lacks coverage");
			benefits.setTermCondition("If major damage occures");
			sbenifit.add(benefits);
			session.save(benefits);
			System.out.println(benefits);
			
			InsurancePlan insPlan = new InsurancePlan();
			insPlan.setInsurancePlanName("Accident");
			insPlan.setEligibility("If major bone breakage");
			insPlan.setMinEnroll("1200");
			insPlan.setMaxEnroll("2500");
			insPlan.setBenefits(sbenifit);
			
			session.save(insPlan);
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
