package com.vbs.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {		
//		orderId(PK)
//		orderDate
//		orderStatus
//		collection of Items
	    @Id
		int orderId;
	    

		int orderDate;
		String orderStatus;
	    
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public int getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(int orderDate) {
			this.orderDate = orderDate;
		}
		public String getOrderStatus() {
			return orderStatus;
		}
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		
}
