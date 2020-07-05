package com.player.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String teamName;
	private int age;
	private String gender;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player( String name, String teamName, int age, String gender) {
		super();
		//this.id = id;
		this.name = name;
		this.teamName = teamName;
		this.age = age;
		this.gender = gender;
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

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", teamName=" + teamName + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
	
	
}
