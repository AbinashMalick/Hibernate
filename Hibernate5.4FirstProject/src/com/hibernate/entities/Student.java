package com.hibernate.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
	@GeneratedValue
	/*@GeneratedValue(generator="newGenerator")
	@GenericGenerator(name="newGenerator", strategy="foreign", parameters= {@Parameter(value="address", name="property")})*/
	@Column(name="ROLL_NO")
	private int rollNo;
	
	//@Transient
	@Column(name="FULL_NAME", nullable=false)
	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	Date birthDate;
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="student")
	Set<Certification> certification = new HashSet<>();
	
	public Set<Certification> getCertification() {
		return certification;
	}
	public void setCertification(Set<Certification> certification) {
		this.certification = certification;
	}
	/*@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ROLL_NO")
	private Student_Details studentDetails;
	
	
	public Student_Details getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(Student_Details studentDetails) {
		this.studentDetails = studentDetails;
	}*/
	
	
	/*@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", birthDate=" + birthDate + ", certification="
				+ certification + "]";
	}
	
	
}
