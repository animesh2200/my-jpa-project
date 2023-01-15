package com.biju.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking implements Serializable{
	private static final long serialVersionUID = 1L;
		
 @Id
 @Column(name="booking_no")
 private int bookingNo;

 @Column(name="agent_code")
 private int agentCode;
 
 @Column(name="amount")
 private int amount;
 
 @Column(name="booking_date")
 private String bookingDate;
 
 @Column(name="travelle_date")
 private String travelle_date;
 
 @Column(name="no_of_passenger")
 private int noOfPassenger;
 
 @Column(name="origin")
 private String origin;
 
 @Column(name="destination")
 private String destination;

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
