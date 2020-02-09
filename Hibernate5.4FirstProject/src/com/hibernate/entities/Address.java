package com.hibernate.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESSES")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADDRESS_ID")
	private int addressId;
	
	private String addressLine1;
	
	private String state;
	
	private int zip;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="address")
	//@JoinColumn(name="STUDENT_INFORMATION")
	private Set<Student> studentInfo = new HashSet<>();
	

	public Set<Student> getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(Set<Student> studentInfo) {
		this.studentInfo = studentInfo;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
}
