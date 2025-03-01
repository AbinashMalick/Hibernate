package com.tm.entities;

public class Advisor {
	protected int advisorNo;
	protected String firstName;
	protected String lastName;
	protected String qualification;
	protected int experience;
	protected int contactNo;
	protected String emailAddress;
	public int getAdvisorNo() {
		return advisorNo;
	}
	public void setAdvisorNo(int advisorNo) {
		this.advisorNo = advisorNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Advisor [advisorNo=" + advisorNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", qualification=" + qualification + ", experience=" + experience + ", contactNo=" + contactNo
				+ ", emailAddress=" + emailAddress + "]";
	}
	
	
}
