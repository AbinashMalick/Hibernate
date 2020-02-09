package com.mtmm.entities;

import java.io.Serializable;
import java.util.Map;

public class Product implements Serializable{
	protected int productNo;
	protected String productName;
	protected float basePrice;
	protected Map<Float, Participant> bidder;
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}
	public Map<Float, Participant> getBidder() {
		return bidder;
	}
	public void setBidder(Map<Float, Participant> bidder) {
		this.bidder = bidder;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(basePrice);
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productNo;
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
		Product other = (Product) obj;
		if (Float.floatToIntBits(basePrice) != Float.floatToIntBits(other.basePrice))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productNo != other.productNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", basePrice=" + basePrice
				+ ", bidder=" + bidder + "]";
	}
	
	
}
