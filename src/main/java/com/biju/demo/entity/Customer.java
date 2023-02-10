package com.biju.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValu(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "customer_first_name")
	private String customerFirstName;

	@Column(name = "custormer_last_name")
	private String customerLastName;

	@Column(name = "phone_no")
	private int phoneNo;

	@Column(name = "address")
	private String address;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
