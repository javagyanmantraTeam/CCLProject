package com.sreenutech.rest.filters;

import java.io.IOException;

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
@UpdateHeader
@Provider
@Priority(2)
public class LoggingFilter implements ContainerRequestFilter,ContainerResponseFilter {

	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		System.out.println("Logging Response Filter");
		
	}

	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("Logging Request Filter");
		
	}

}
