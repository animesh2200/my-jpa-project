package com.biju.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "traveller")
public class Traveller implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "customer_code")
	@JsonProperty(value = "customer_code")
	private int customerCode;

	@Column(name = "customer_name")
	@JsonProperty(value = "customer_name")
	private String customerName;

	@Column(name = "phone_no")
	@JsonProperty(value = "phone_no")
	private int phoneNo;

	@Column(name = "address_line1")
	@JsonProperty(value = "address_line1")
	private String addressLine1;

	@Column(name = "address_line2")
	@JsonProperty(value = "address_line2")
	private String addressLine2;

	@Column(name = "city")
	@JsonProperty(value = "city")
	private String city;

	@Column(name = "state")
	@JsonProperty(value = "state")
	private String state;

	@Column(name = "agent_code")
	@JsonProperty(value = "agent_code")
	private int agentCode;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "customerCode")
	private List<Booking> bookings;

	public int getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}

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

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(int agentCode) {
		this.agentCode = agentCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	
	

}
