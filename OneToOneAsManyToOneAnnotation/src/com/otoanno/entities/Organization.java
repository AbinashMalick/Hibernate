package com.otoanno.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="ORGANIZATION")
public class Organization implements Serializable{
	@Id
	@Column(name="ORGANIZATION_NO")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int organizationNo;
	@Column(name="ORGANIZATION_NM")
	protected String organizationName;
	@Column(name="EST_DT")
	protected Date estDate;
	protected String description;
	@Column(name="BUSINESS_TYPE")
	protected String businessType;
	
	@OneToMany
	@JoinColumn(name="ORGANIZATION_NO", unique=true)
	protected Set<Account> account;
	
	public int getOrganizationNo() {
		return organizationNo;
	}
	public void setOrganizationNo(int organizationNo) {
		this.organizationNo = organizationNo;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public Date getEstDate() {
		return estDate;
	}
	public void setEstDate(Date estDate) {
		this.estDate = estDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public Set<Account> getAccount() {
		return account;
	}
	public void setAccount(Set<Account> account) {
		this.account = account;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessType == null) ? 0 : businessType.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((estDate == null) ? 0 : estDate.hashCode());
		result = prime * result + ((organizationName == null) ? 0 : organizationName.hashCode());
		result = prime * result + organizationNo;
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
		Organization other = (Organization) obj;
		if (businessType == null) {
			if (other.businessType != null)
				return false;
		} else if (!businessType.equals(other.businessType))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (estDate == null) {
			if (other.estDate != null)
				return false;
		} else if (!estDate.equals(other.estDate))
			return false;
		if (organizationName == null) {
			if (other.organizationName != null)
				return false;
		} else if (!organizationName.equals(other.organizationName))
			return false;
		if (organizationNo != other.organizationNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Organization [organizationNo=" + organizationNo + ", organizationName=" + organizationName
				+ ", estDate=" + estDate + ", description=" + description + ", businessType=" + businessType
				+ ", account=" + account + "]";
	}
	

	
	
}
