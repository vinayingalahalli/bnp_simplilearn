package com.soapservice.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.soapservice.CalculatorService;

public class CalculatorServiceClient {

	public static void main(String[] args) {
		String endpoint="http://localhost:9020/calci?wsdl";
		try {
			URL url=new URL(endpoint);
			//param1 below is targetNamespace from wsdl file
			//param2 below is the service class which you can pick up from wdl file as well
			QName qName=new QName("http://impl.soapservice.com/", "CalculatorServiceImplService");
			Service service=Service.create(url,qName);
			CalculatorService cs=service.getPort(CalculatorService.class);
			System.out.println(cs.sayHello());
			System.out.println("Add service "+cs.add(100, 7888));
			System.out.println("Substract service "+cs.substract(100, 7888));
			System.out.println("Multiply service "+cs.multiply(100, 7888));
			System.out.println("Divide service "+cs.divide(100, 7888));
			System.out.println(cs.sayHelloByName("Sachin R Tendulkarrrrr"));
		} catch (MalformedURLException e) {
			System.out.println(e);
		}

	}

}
