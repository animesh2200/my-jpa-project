package com.biju.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravellerBO {

	@JsonProperty(value = "customer_name")
	private String customerName;
	@JsonProperty(value = "phone_no")
	private int phoneNo;
	@JsonProperty(value = "address_line1")
	private String addressLine1;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

}
