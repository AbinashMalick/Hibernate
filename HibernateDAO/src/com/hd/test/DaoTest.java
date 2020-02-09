package com.hd.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hd.entities.Advisor;
import com.hd.entities.Vehicle;
import com.persistency.Dao.HibernateHelper;

public class DaoTest {

	public static void main(String[] args) {
		boolean flag = false;
		SessionFactory sessionfactory = HibernateHelper.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		try {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleNo("4021");
		vehicle.setVehicleModelName("ASTONMARTIN");
		vehicle.setColor("Blue");
		vehicle.setVehiclePurchaseDate(new Date(10, 24, 2018));
		vehicle.setChasisNo("C5561");
		vehicle.setEngineNo("E4411");
		vehicle.setRegistrationNo("R3311");
		vehicle.setBatteryNo("B2211");
		session.save(vehicle);
		
		Advisor advisor = new Advisor();
		advisor.setAdvisorNo(1250);
		advisor.setFirstName("Joy");
		advisor.setLastName("Kenedy");
		advisor.setExperience(3);
		advisor.setQualification("MCA");
		advisor.setContactNo("659823");
		advisor.setEmailAddress("joy@gmail.com");
		session.save(advisor);
		flag = true;
		System.out.println("Data inserted..");
		}
		finally {
			if(session!=null && transaction!=null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
			session.close();
			sessionfactory.close();
		}
	}
}
