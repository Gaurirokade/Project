package com.vbs.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item{
//	itemId(PK)
//	orderId(FK)
//	itemName
//	itemUnitPrice
//	itemQuantity
	@Id
	int itemId;
	
	String itemName;
	int itemPrice;
	String itemQuality;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemQuality() {
		return itemQuality;
	}
	public void setItemQuality(String itemQuality) {
		this.itemQuality = itemQuality;
	}
	




	

}
