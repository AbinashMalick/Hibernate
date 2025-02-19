package com.mtmb.entities;

import java.io.Serializable;
import java.util.Set;

public class Doctor implements Serializable{
	protected int doctorNo;
	protected String doctorName;
	protected String specialization;
	protected int experience;
	protected Set<Surgery> surgeries;
	public int getDoctorNo() {
		return doctorNo;
	}
	public void setDoctorNo(int doctorNo) {
		this.doctorNo = doctorNo;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public Set<Surgery> getSurgeries() {
		return surgeries;
	}
	public void setSurgeries(Set<Surgery> surgeries) {
		this.surgeries = surgeries;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + doctorNo;
		result = prime * result + experience;
		result = prime * result + ((specialization == null) ? 0 : specialization.hashCode());
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
		Doctor other = (Doctor) obj;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (doctorNo != other.doctorNo)
			return false;
		if (experience != other.experience)
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Doctor [doctorNo=" + doctorNo + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", experience=" + experience + ", surgeries=" + surgeries + "]";
	}
	
	
	
	
}
