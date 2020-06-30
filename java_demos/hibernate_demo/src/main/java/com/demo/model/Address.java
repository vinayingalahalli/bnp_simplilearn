package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String streetName;
	private String cityName;
	private int zipcode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public Address(String streetName, String cityName, int zipcode) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", streetName=" + streetName + ", cityName=" + cityName + ", zipcode=" + zipcode
				+ "]";
	}
	
	
}
