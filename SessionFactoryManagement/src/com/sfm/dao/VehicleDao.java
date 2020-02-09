package com.sfm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sfm.entities.Vehicle;
import com.sfm.util.SessionFactoryRegistry;

public class VehicleDao {
	SessionFactory sessionFactory;
	boolean flag = false;
	Transaction transaction;
	Session session;
	public void saveVehicle(Vehicle vehicle) {
		try {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(vehicle);
			System.out.println("Record has been inserted..");
			flag = true;
		}
		finally {
			if(flag) {
				transaction.commit();
			}else {
				transaction.rollback();
			}
		  }
		}//save Vehicle
		public Vehicle readVehicle(int vehicleNo) {
			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			Session session = sessionFactory.openSession();
			Vehicle vehicle = (Vehicle) session.get(Vehicle.class, vehicleNo);
			return vehicle;
		}
}
