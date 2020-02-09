package com.otos.entities;

import java.io.Serializable;
import java.util.Date;

public class DTHBox implements Serializable{
	protected int dthBoxNo;
	protected String dthBoxName;
	protected Date manufactureDate;
	protected String boxType;
	protected DigitalCard digitalCard;
	
	public int getDthBoxNo() {
		return dthBoxNo;
	}
	public void setDthBoxNo(int dthBoxNo) {
		this.dthBoxNo = dthBoxNo;
	}
	public String getDthBoxName() {
		return dthBoxName;
	}
	public void setDthBoxName(String dthBoxName) {
		this.dthBoxName = dthBoxName;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public String getBoxType() {
		return boxType;
	}
	public void setBoxType(String boxType) {
		this.boxType = boxType;
	}
	public DigitalCard getDigitalCard() {
		return digitalCard;
	}
	public void setDigitalCard(DigitalCard digitalCard) {
		this.digitalCard = digitalCard;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boxType == null) ? 0 : boxType.hashCode());
		result = prime * result + ((dthBoxName == null) ? 0 : dthBoxName.hashCode());
		result = prime * result + dthBoxNo;
		result = prime * result + ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DTHBox other = (DTHBox) obj;
		if (boxType == null) {
			if (other.boxType != null)
				return false;
		} else if (!boxType.equals(other.boxType))
			return false;
		if (dthBoxName == null) {
			if (other.dthBoxName != null)
				return false;
		} else if (!dthBoxName.equals(other.dthBoxName))
			return false;
		if (dthBoxNo != other.dthBoxNo)
			return false;
		if (manufactureDate == null) {
			if (other.manufactureDate != null)
				return false;
		} else if (!manufactureDate.equals(other.manufactureDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DTHBox [dthBoxNo=" + dthBoxNo + ", dthBoxName=" + dthBoxName + ", manufactureDate=" + manufactureDate
				+ ", boxType=" + boxType + ", digitalCard=" + digitalCard + "]";
	} 
	
	
	
}
