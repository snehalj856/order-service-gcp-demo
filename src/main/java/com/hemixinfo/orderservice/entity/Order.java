package com.hemixinfo.orderservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long orderId;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "order_name")
	private String orderName;

	public Order() {
		// TODO Auto-generated constructor stub
	}
		
	public Order(Long orderId, String customerName, String customerId, String orderName) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.customerId = customerId;
		this.orderName = orderName;
	}

	public Long getOrderId() {
		return orderId;
	}
	
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getOrderName() {
		return orderName;
	}
	
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
}
