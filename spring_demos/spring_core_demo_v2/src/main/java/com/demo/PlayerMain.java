package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("playerbeans.xml");

		Player p1 = (Player) context.getBean("p1");
		System.out.println("Printing player details for " + p1.getName());
		System.out.println(p1);

		Player p2 = (Player) context.getBean("p2");
		System.out.println("Printing player details for " + p2.getName());
		System.out.println(p2);

		Player p3 = (Player) context.getBean("p3");
		System.out.println("Printing player details for " + p3.getName());
		System.out.println(p3);
	}

}
