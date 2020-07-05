package com.demo.model;

public class Address {

	private int aid;
	private String addressDetails;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(String addressDetails) {
		this.addressDetails = addressDetails;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", addressDetails=" + addressDetails + "]";
	}
	
}
