package com;

public class StaticMain {

	public static void main(String[] args) {
		hey();
		StaticMain s=new StaticMain();
		s.hello();
		
		Demo.heyDemo();
		Demo d=new Demo();
		d.heyDemo();
	}
	
	public static void hey() {
		System.out.println("Hey I am static");
	}
	
	public  void hello() {
		System.out.println("Hello I am non-static");
	}

}
