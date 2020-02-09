package com.ha.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="SPAREPART", uniqueConstraints= {@UniqueConstraint(columnNames= {"MODEL_NO","PURCHASE_DT"})})
public class Sparepart {

	@Id
	@Column(name="SPAREPART_NO")
	protected int sparepartNo;
	
	@Column(name="SPAREPART_NM", nullable=false)
	protected String sparepartName;
	
	@Column(name="MODEL_NO")
	protected String modelNo;
	
	@Column(name="PURCHASE_DT")
	protected Date purchaseDate;
	
	protected float price;
	
	public int getSparepartNo() {
		return sparepartNo;
	}
	public void setSparepartNo(int sparepartNo) {
		this.sparepartNo = sparepartNo;
	}
	public String getSparepartName() {
		return sparepartName;
	}
	public void setSparepartName(String sparepartName) {
		this.sparepartName = sparepartName;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
