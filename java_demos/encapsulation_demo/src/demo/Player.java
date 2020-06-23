package demo;

public class Player {

	private int id;
	private String name;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void printPlayer() {
		System.out.println("Player Id = "+id);
		System.out.println("Player Name = "+name);
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}
/*
 * Encapsulated Class
 *  DTO - Data Transfer Class
 *  VO - Value Object Class
 *  bean class
 *  Model class
 *  POJO class - Plain Old Java Object class
*/