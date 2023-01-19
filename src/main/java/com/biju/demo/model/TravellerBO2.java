package com.biju.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravellerBO2 {

	@JsonProperty(value = "customer_name")
	private String customerName;

	@JsonProperty(value = "address_line1")
	private String addressLine1;

	@JsonProperty(value = "address_line2")
	private String addressLine2;

	@JsonProperty(value = "state")
	private String state;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


}
