package com.demo.model;

import java.util.List;

public class Player {

 private int id;
 private String name;
 private String city;
 private Team team;
 private List<Address> addressList;
 public Player() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Player(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}

public Team getTeam() {
	return team;
}
public void setTeam(Team team) {
	this.team = team;
}

public List<Address> getAddressList() {
	return addressList;
}
public void setAddressList(List<Address> addressList) {
	this.addressList = addressList;
}
@Override
public String toString() {
	return "Player [id=" + id + ", name=" + name + ", city=" + city + ", team=" + team + ", addressList=" + addressList
			+ "]";
}
 
}
