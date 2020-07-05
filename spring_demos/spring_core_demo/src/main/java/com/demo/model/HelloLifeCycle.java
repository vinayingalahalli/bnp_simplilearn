package com.demo.model;

public class HelloLifeCycle {

	private String message;
	public HelloLifeCycle() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("bean is going through init");
	}
	
	public void destroy() {
		System.out.println("bean is going to be destroyed now");
	}
	
}
