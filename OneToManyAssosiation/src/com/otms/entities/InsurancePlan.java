package com.otms.entities;

import java.io.Serializable;
import java.util.Set;

public class InsurancePlan implements Serializable{
	protected int insurancePlanNo;
	protected String insurancePlanName;
	protected String eligibility;
	protected String minEnroll;
	protected String maxEnroll;
	
	Set<Benefits> benefits;
	
	public int getInsurancePlanNo() {
		return insurancePlanNo;
	}
	public void setInsurancePlanNo(int insurancePlanNo) {
		this.insurancePlanNo = insurancePlanNo;
	}
	public String getInsurancePlanName() {
		return insurancePlanName;
	}
	public void setInsurancePlanName(String insurancePlanName) {
		this.insurancePlanName = insurancePlanName;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public String getMinEnroll() {
		return minEnroll;
	}
	public void setMinEnroll(String minEnroll) {
		this.minEnroll = minEnroll;
	}
	public String getMaxEnroll() {
		return maxEnroll;
	}
	public void setMaxEnroll(String maxEnroll) {
		this.maxEnroll = maxEnroll;
	}
	public Set<Benefits> getBenefits() {
		return benefits;
	}
	public void setBenefits(Set<Benefits> benefits) {
		this.benefits = benefits;
	}
	@Override
	public String toString() {
		return "InsurancePlan [insurancePlanNo=" + insurancePlanNo + ", insurancePlanName=" + insurancePlanName
				+ ", eligibility=" + eligibility + ", minEnroll=" + minEnroll + ", maxEnroll=" + maxEnroll
				+ ", benefits=" + benefits + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eligibility == null) ? 0 : eligibility.hashCode());
		result = prime * result + ((insurancePlanName == null) ? 0 : insurancePlanName.hashCode());
		result = prime * result + insurancePlanNo;
		result = prime * result + ((maxEnroll == null) ? 0 : maxEnroll.hashCode());
		result = prime * result + ((minEnroll == null) ? 0 : minEnroll.hashCode());
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
		InsurancePlan other = (InsurancePlan) obj;
		if (eligibility == null) {
			if (other.eligibility != null)
				return false;
		} else if (!eligibility.equals(other.eligibility))
			return false;
		if (insurancePlanName == null) {
			if (other.insurancePlanName != null)
				return false;
		} else if (!insurancePlanName.equals(other.insurancePlanName))
			return false;
		if (insurancePlanNo != other.insurancePlanNo)
			return false;
		if (maxEnroll == null) {
			if (other.maxEnroll != null)
				return false;
		} else if (!maxEnroll.equals(other.maxEnroll))
			return false;
		if (minEnroll == null) {
			if (other.minEnroll != null)
				return false;
		} else if (!minEnroll.equals(other.minEnroll))
			return false;
		return true;
	}
		
	
	
}
