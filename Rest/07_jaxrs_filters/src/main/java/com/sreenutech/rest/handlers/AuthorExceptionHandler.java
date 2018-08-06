package com.sreenutech.rest.handlers;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.sreenutech.rest.beans.AuthorException;
import com.sreenutech.rest.beans.Book;

@Provider
public class AuthorExceptionHandler implements
    ExceptionMapper<AuthorException> {

    public Response toResponse(AuthorException  err) {
        
        System.out.println("Exception occured:" + err);
        
        Book resp = new Book();
        resp.setId("404");
        resp.setName("Author not found");
        
        return Response.status(Status.NOT_FOUND).entity(resp).build();
    }
}

