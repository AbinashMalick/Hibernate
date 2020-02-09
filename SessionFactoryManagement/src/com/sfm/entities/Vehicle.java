package com.sfm.entities;

import java.util.Date;

public class Vehicle {
	protected int vehicleNo;
	protected String vehicleModelName;
	protected String color;
	protected Date vehiclePurchaseDate;
	protected String chasisNo;
	protected String engineNo;
	protected String registrationNo;
	protected String batteryNo;
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleModelName() {
		return vehicleModelName;
	}
	public void setVehicleModelName(String vehicleModelName) {
		this.vehicleModelName = vehicleModelName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getVehiclePurchaseDate() {
		return vehiclePurchaseDate;
	}
	public void setVehiclePurchaseDate(Date vehiclePurchaseDate) {
		this.vehiclePurchaseDate = vehiclePurchaseDate;
	}
	public String getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getBatteryNo() {
		return batteryNo;
	}
	public void setBatteryNo(String batteryNo) {
		this.batteryNo = batteryNo;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleNo=" + vehicleNo + ", vehicleModelName=" + vehicleModelName + ", color=" + color
				+ ", vehiclePurchaseDate=" + vehiclePurchaseDate + ", chasisNo=" + chasisNo + ", engineNo=" + engineNo
				+ ", registrationNo=" + registrationNo + ", batteryNo=" + batteryNo + "]";
	}
	
	
}
