package com.biju.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable  {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "S_Name")
	private String name;
	@Column(name = "class")
	private int clas;
	@Column(name = "create_date")
	private String date;
	@Id
	@Column(name = "Roll_number")
	private int roll;
	@Column(name = "address")
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClas() {
		return clas;
	}

	public void setClas(int clas) {
		this.clas = clas;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
