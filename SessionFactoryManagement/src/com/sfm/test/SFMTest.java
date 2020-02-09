package com.sfm.test;

import java.util.Date;

import com.sfm.dao.VehicleDao;
import com.sfm.entities.Vehicle;

public class SFMTest {

	public static void main(String[] args) {
		VehicleDao vehicleDao = new VehicleDao();
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleNo(1023);
		vehicle.setVehicleModelName("Honda City");
		vehicle.setColor("Blue");
		vehicle.setVehiclePurchaseDate(new Date());
		vehicle.setChasisNo("C29939");
		vehicle.setEngineNo("E87765");
		vehicle.setRegistrationNo("TS AK 9767");
		vehicle.setBatteryNo("B2626");
		
		System.out.println("main mathod..");
		//vehicleDao.saveVehicle(vehicle);
		System.out.println(vehicleDao.readVehicle(1023));
		
				
	}
}
