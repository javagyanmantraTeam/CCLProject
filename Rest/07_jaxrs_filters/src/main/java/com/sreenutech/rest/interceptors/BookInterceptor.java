package com.sreenutech.rest.interceptors;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

import com.sreenutech.rest.filters.UpdateHeader;

@Provider
@UpdateHeader
public class BookInterceptor implements  ReaderInterceptor, WriterInterceptor {

    public Object aroundReadFrom(ReaderInterceptorContext ctx)
            throws IOException, WebApplicationException {
        
    	
          System.out.println("Intercepted request");
        
        return ctx.proceed();
    }

    public void aroundWriteTo(WriterInterceptorContext ctx)
            throws IOException, WebApplicationException {
        
        System.out.println("Intercepted response");
        
        ctx.proceed();
        
    }
}

