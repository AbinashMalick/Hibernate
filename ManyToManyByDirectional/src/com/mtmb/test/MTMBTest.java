package com.mtmb.test;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtmb.entities.Doctor;
import com.mtmb.entities.Surgery;
import com.mtmb.util.SessionFactoryRegistry;



public class MTMBTest {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		boolean flag = false;
		try {
			factory = SessionFactoryRegistry.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
			
	/*		Set<Surgery> surgeries = new HashSet<Surgery>();*/
			Set<Doctor> doctors = new HashSet<Doctor>();
			
			Doctor doctor = new Doctor();
			doctor.setDoctorName("S P PANDA");
			doctor.setExperience(6);
			doctor.setSpecialization("Heart Sergion");
			session.save(doctor);
			doctors.add(doctor);
			
			Doctor doctor1 = new Doctor();
			doctor1.setDoctorName("D N MOHARANA");
			doctor1.setExperience(10);
			doctor1.setSpecialization("Brain Sergion");
			session.save(doctor1);
			doctors.add(doctor1);
			
			Surgery surgery = new Surgery();
			surgery.setSurgeryName("Heart");
			surgery.setSurgeryType("Open Surgery");
			surgery.setSurgeryDate(new Date());
			surgery.setDoctors(doctors);
			session.save(surgery);
			
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
