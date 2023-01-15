package com.biju.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agent")
public class Agent implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name="agent_code")
	private int agentCode;
	
	@Column (name="agent_name")
	private String agentName;
	
	public int getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(int agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column (name="city")
	private String city;
	
	@Column (name="phone_no")
	private int phoneNo;
	
	@Column (name="country_code")
	private int countryCode;
	

}
