package com.demo.model;

public class Hello {

	private String message;
	public Hello() {
		System.out.println("Hello from empty non param constructor");
	}
	public Hello(String message) {
		super();
		this.message = message;
		System.out.println("Hello from  param constructor");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Hello from setter");
	}
	
}
