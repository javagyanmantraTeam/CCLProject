package com.sreenutech.bean;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/beanResource")
public class UserResource {
	@GET
    @Path("/get/{id}")
    public String get(@BeanParam UserBean user) {
		System.out.println("Bean param is :"+user.toString());
        return "User Bean: " + user.toString();
    }
}
