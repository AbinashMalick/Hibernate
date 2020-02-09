package com.mtmm.entities;

import java.io.Serializable;

public class Participant implements Serializable {
	protected int participantNo;
	protected String participantName;
	protected int contactNo;
	protected String emailAdress;
	public int getParticipantNo() {
		return participantNo;
	}
	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contactNo;
		result = prime * result + ((emailAdress == null) ? 0 : emailAdress.hashCode());
		result = prime * result + ((participantName == null) ? 0 : participantName.hashCode());
		result = prime * result + participantNo;
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
		Participant other = (Participant) obj;
		if (contactNo != other.contactNo)
			return false;
		if (emailAdress == null) {
			if (other.emailAdress != null)
				return false;
		} else if (!emailAdress.equals(other.emailAdress))
			return false;
		if (participantName == null) {
			if (other.participantName != null)
				return false;
		} else if (!participantName.equals(other.participantName))
			return false;
		if (participantNo != other.participantNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Participant [participantNo=" + participantNo + ", participantName=" + participantName + ", contactNo="
				+ contactNo + ", emailAdress=" + emailAdress + "]";
	}
	
	
}
