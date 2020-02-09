package com.hibernate.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Certification {
	@Id
	@GeneratedValue
	@Column(name="CERT_ID")
	private int certificatonId;
	
	@Column(name="CERT_NAME")
	private String certificatonName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ROLL_NO") 
	private Set<Student> student = new HashSet<>();


	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public int getCertificatonId() {
		return certificatonId;
	}

	public void setCertificatonId(int certificatonId) {
		this.certificatonId = certificatonId;
	}

	public String getCertificatonName() {
		return certificatonName;
	}

	public void setCertificatonName(String certificatonName) {
		this.certificatonName = certificatonName;
	}
}
