package com.biju.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "booking")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "booking_no")
	@JsonProperty(value = "booking_no")
	private int bookingNo;

	@Column(name = "agent_code")
	@JsonProperty(value = "agent_code")
	private int agentCode;

	@Column(name = "amount")
	@JsonProperty(value = "amount")
	private int amount;

	@Column(name = "booking_date")
	@JsonProperty(value = "booking_date")
	private String bookingDate;

	@Column(name = "travelle_date")
	@JsonProperty(value = "travelle_date")
	private String travelle_date;

	@Column(name = "no_of_passenger")
	@JsonProperty(value = "no_of_passenger")
	private int noOfPassenger;

	@Column(name = "origin")
	@JsonProperty(value = "origin")
	private String origin;

	@Column(name = "destination")
	@JsonProperty(value = "destination")
	private String destination;

	@Column(name = "customer_code")
	@JsonProperty(value = "customer_code")
	private int customerCode;

	@ManyToOne
	@JoinColumn(name = "customer_code", nullable = false, insertable = false, updatable = false)
	private Traveller traveller;
	@ManyToOne
	@JoinColumn(name = "agent_code", nullable = false, insertable = false, updatable = false)
	private Agent agent;

	public int getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}

	public int getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(int bookingNo) {
		this.bookingNo = bookingNo;
	}

	public int getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(int agentCode) {
		this.agentCode = agentCode;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getTravelle_date() {
		return travelle_date;
	}

	public void setTravelle_date(String travelle_date) {
		this.travelle_date = travelle_date;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
