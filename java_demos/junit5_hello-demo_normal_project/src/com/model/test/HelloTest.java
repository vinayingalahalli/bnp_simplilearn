package com.model.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.model.Hello;

public class HelloTest {
private static Hello hello;
	@BeforeAll
	public static void beforeAll() {
		hello=new Hello();
		System.out.println("@BeforeAll");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("@BeforeEach");
	}
	
	@Test
	public void sayHelloTest() {
		System.out.println("@Test");
		Assertions.assertEquals("Hello Junit5", hello.sayHello());
	}
	@Test
	public void sayHelloAgainTest() {
		System.out.println("@Test Again");
		Assertions.assertEquals("Hello Junit5", hello.sayHello());
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("@AfterEach");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("@AfterAll");
	}
}
