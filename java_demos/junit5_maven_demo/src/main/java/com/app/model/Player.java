package com.app.model;

import java.util.Objects;

public class Player {

	private int id;
	private String name;
	private String teamName;
	private int age;
	private String gender;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, String teamName, int age, String gender) {
		super();
		this.id = id;
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

	public Player(String name, String teamName, int age, String gender) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return id == other.id;
	}
	
	
	
}
