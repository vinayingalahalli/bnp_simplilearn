package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainee_tbl")
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "traineeName",nullable = false,length = 30)
	private String name;
	@Column(unique = true)
	private long contact;
	private int age;
	private String city;
	private String gender;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Trainee() {
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

	

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", contact=" + contact + ", age=" + age + ", city=" + city
				+ ", gender=" + gender + "]";
	}

	public Trainee(String name) {
		super();
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Trainee(String name, long contact, int age, String city, String gender) {
		super();
		this.name = name;
		this.contact = contact;
		this.age = age;
		this.city = city;
		this.gender = gender;
	}

//	public Trainee(String name, long contact) {
//		super();
//		this.name = name;
//		this.contact = contact;
//	}

//	public Trainee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	
	
	
}
