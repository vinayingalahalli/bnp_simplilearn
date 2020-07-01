package com.hello;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class HelloRest {

	@GET
	public String sayHelloGET() {
		return "Hello Welcome to JAX-RS with JERSEY API GET";
	}
	
	@Path("/{name}")
	@GET
	public String sayHelloGET(@PathParam("name")String name) {
		return "Hello "+name+" Welcome to JAX-RS with JERSEY API GET";
	}
	@POST
	public String sayHelloPOST() {
		return "Hello Welcome to JAX-RS with JERSEY API POST";
	}

	@PUT
	public String sayHelloPUT() {
		return "Hello Welcome to JAX-RS with JERSEY API PUT";
	}

	@DELETE
	public String sayHelloDELETE() {
		return "Hello Welcome to JAX-RS with JERSEY API DELETE";
	}

}
