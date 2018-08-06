package com.suman.rest;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class Messagersource {
	
	MessagerService messagerservice=new MessagerService();

	@Path("/m1")
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage(){
		return messagerservice.getAllMessage();
		
	}
}
