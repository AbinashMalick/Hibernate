package com.otms.entities;

import java.io.Serializable;

/**
 * @author Avi
 *
 */
public class Benefits implements Serializable{
	
	protected int benefitId;
	protected String benefitName;
	protected String termCondition;
	
	
	public int getBenefitId() {
		return benefitId;
	}
	public void setBenefitId(int benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitName() {
		return benefitName;
	}
	public void setBenefitName(String benefitName) {
		this.benefitName = benefitName;
	}
	public String getTermCondition() {
		return termCondition;
	}
	public void setTermCondition(String termCondition) {
		this.termCondition = termCondition;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + benefitId;
		result = prime * result + ((benefitName == null) ? 0 : benefitName.hashCode());
		result = prime * result + ((termCondition == null) ? 0 : termCondition.hashCode());
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
		Benefits other = (Benefits) obj;
		if (benefitId != other.benefitId)
			return false;
		if (benefitName == null) {
			if (other.benefitName != null)
				return false;
		} else if (!benefitName.equals(other.benefitName))
			return false;
		if (termCondition == null) {
			if (other.termCondition != null)
				return false;
		} else if (!termCondition.equals(other.termCondition))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Benefits [benefitId=" + benefitId + ", benefitName=" + benefitName + ", termCondition=" + termCondition
				+ "]";
	}
	
}
