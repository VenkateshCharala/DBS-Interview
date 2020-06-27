package com.dbinterview.orderservice;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Order {
	
	@Id
	@Column
	private int id;
	
	@Column
	private Date orderDate;
	
	@Column
	private String customerName;
    
	@Column
	private String ShippingAddress;
    
	@Column
	private List oderItems;
    
	@Column
	private double total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
    public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public List getOderItems() {
		return oderItems;
	}
	public void setOderItems(List oderItems) {
		this.oderItems = oderItems;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
    
}
