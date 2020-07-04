package com.soapservice.impl;

import javax.jws.WebService;

import com.soapservice.CalculatorService;

@WebService(endpointInterface = "com.soapservice.CalculatorService")
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public String sayHello() {
		
		return "Hello Calculator SOAP Service with JAX-WS";
	}

	@Override
	public String sayHelloByName(String name) {
		
		return "Hello "+name+".... Welcome to SOAP Service with JAX-WS";
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
