package com.suman.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

@Path("/hello")
@Singleton
public class HeloResource {
	@GET
	public String getmessg(){
		return "hello............";
	}

	
	@GET
	@Path("/data")
	@Produces(MediaType.TEXT_XML)
	public String getData(){
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	}
}
