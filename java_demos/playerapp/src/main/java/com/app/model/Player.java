package com.app.model;

public class Player {

	private int id;
	private String name;
	private String teamName;
	
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

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Player(int id, String name, String teamName) {
		super();
		this.id = id;
		this.name = name;
		this.teamName = teamName;
	}

	public Player(String name, String teamName) {
		super();
		this.name = name;
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", teamName=" + teamName + "]";
	}
	
}
