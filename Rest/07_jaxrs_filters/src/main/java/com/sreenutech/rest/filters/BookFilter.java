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
@Priority(1)
public class BookFilter implements ContainerRequestFilter, ContainerResponseFilter {

    public void filter(ContainerRequestContext reqCtx) throws IOException {
        
        System.out.println("Adding start time in request headers");
        
        reqCtx.getHeaders().add("startTime", String.valueOf(System.currentTimeMillis()));
        
    }

    public void filter(ContainerRequestContext reqCtx,
            ContainerResponseContext respCtx) throws IOException {

        System.out.println("Adding ProcessingTime in response headers");
        
        long startTime = Long.parseLong( reqCtx.getHeaderString("startTime") );
        
        respCtx.getHeaders().add("ProcessingTime", 
            String.valueOf(System.currentTimeMillis()-startTime ) + " millisecs" );
    }

}
