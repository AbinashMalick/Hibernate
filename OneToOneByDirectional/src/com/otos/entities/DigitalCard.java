package com.otos.entities;

import java.io.Serializable;

public class DigitalCard implements Serializable{
	protected int cardNo;
	protected String cardName;
	protected String subcriptionPack;
	protected String cardType;
	protected DTHBox dthBox;
	
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getSubcriptionPack() {
		return subcriptionPack;
	}
	public void setSubcriptionPack(String subcriptionPack) {
		this.subcriptionPack = subcriptionPack;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public DTHBox getDthBox() {
		return dthBox;
	}
	public void setDthBox(DTHBox dthBox) {
		this.dthBox = dthBox;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardName == null) ? 0 : cardName.hashCode());
		result = prime * result + cardNo;
		result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());
		result = prime * result + ((subcriptionPack == null) ? 0 : subcriptionPack.hashCode());
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
		DigitalCard other = (DigitalCard) obj;
		if (cardName == null) {
			if (other.cardName != null)
				return false;
		} else if (!cardName.equals(other.cardName))
			return false;
		if (cardNo != other.cardNo)
			return false;
		if (cardType == null) {
			if (other.cardType != null)
				return false;
		} else if (!cardType.equals(other.cardType))
			return false;
		if (subcriptionPack == null) {
			if (other.subcriptionPack != null)
				return false;
		} else if (!subcriptionPack.equals(other.subcriptionPack))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DigitalCard [cardNo=" + cardNo + ", cardName=" + cardName + ", subcriptionPack=" + subcriptionPack
				+ ", cardType=" + cardType + ", dthBox=" + dthBox + "]";
	}
	
	
}
