package com.biju.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "external_api")

public class ExternalApi implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "Activity")
	private String activity;

	@Column(name = "Type")
	private String type;

	@Column(name = "Participants")
	private int participants;

	@Column(name = "Price")
	private int price;

	@Column(name = "Link")
	private String link;

	@Id
	@Column(name = "Key_1")
	private int key;

	@Column(name = "Accessibility")
	private int accessibility;

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getAccessibility() {
		return accessibility;
	}

	public void setAccessibility(int accessibility) {
		this.accessibility = accessibility;
	}

}