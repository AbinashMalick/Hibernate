package com.hibernate.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="STUDENT_DETAILS")
public class Student_Details {
	
	@Id
	@Column(name="ROLL_NO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*@GeneratedValue(generator="newGenerator")
	@GenericGenerator(name="newGenerator", strategy="foreign", parameters= {@Parameter(value="student_Info", name="property")})
*/	private int rollNo;
	
	@Column(name="MOBILE_NO")
	private int mobileNo;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ROLL_NO")
	private Student student_Info;
	

	public Student getStudent_Info() {
		return student_Info;
	}

	public void setStudent_Info(Student student_Info) {
		this.student_Info = student_Info;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
}
