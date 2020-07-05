package com.demo.model;

public class Team {

	private int tid;
	private String teamName;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Team [tid=" + tid + ", teamName=" + teamName + "]";
	}
	
	
}
