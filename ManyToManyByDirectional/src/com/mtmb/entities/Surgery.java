package com.mtmb.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Surgery implements Serializable{
	protected int surgeryNo;
	protected String surgeryName;
	protected String surgeryType;
	protected Date surgeryDate;
	protected Set<Doctor> doctors;
	public int getSurgeryNo() {
		return surgeryNo;
	}
	public void setSurgeryNo(int surgeryNo) {
		this.surgeryNo = surgeryNo;
	}
	public String getSurgeryName() {
		return surgeryName;
	}
	public void setSurgeryName(String surgeryName) {
		this.surgeryName = surgeryName;
	}
	public String getSurgeryType() {
		return surgeryType;
	}
	public void setSurgeryType(String surgeryType) {
		this.surgeryType = surgeryType;
	}
	public Date getSurgeryDate() {
		return surgeryDate;
	}
	public void setSurgeryDate(Date surgeryDate) {
		this.surgeryDate = surgeryDate;
	}
	public Set<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(Set<Doctor> doctors) {
		this.doctors = doctors;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((surgeryDate == null) ? 0 : surgeryDate.hashCode());
		result = prime * result + ((surgeryName == null) ? 0 : surgeryName.hashCode());
		result = prime * result + surgeryNo;
		result = prime * result + ((surgeryType == null) ? 0 : surgeryType.hashCode());
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
		Surgery other = (Surgery) obj;
		if (surgeryDate == null) {
			if (other.surgeryDate != null)
				return false;
		} else if (!surgeryDate.equals(other.surgeryDate))
			return false;
		if (surgeryName == null) {
			if (other.surgeryName != null)
				return false;
		} else if (!surgeryName.equals(other.surgeryName))
			return false;
		if (surgeryNo != other.surgeryNo)
			return false;
		if (surgeryType == null) {
			if (other.surgeryType != null)
				return false;
		} else if (!surgeryType.equals(other.surgeryType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Surgery [surgeryNo=" + surgeryNo + ", surgeryName=" + surgeryName + ", surgeryType=" + surgeryType
				+ ", surgeryDate=" + surgeryDate + ", doctors=" + doctors + "]";
	}
	
	
}
