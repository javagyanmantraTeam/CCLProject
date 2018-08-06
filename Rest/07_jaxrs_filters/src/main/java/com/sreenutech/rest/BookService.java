package com.sreenutech.rest;

import javax.ws.rs.GET;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sreenutech.rest.beans.AuthorException;
import com.sreenutech.rest.beans.Book;
import com.sreenutech.rest.beans.BookException;
import com.sreenutech.rest.beans.BookResponse;
import com.sreenutech.rest.filters.UpdateHeader;





@Path("/book")
@Produces(MediaType.APPLICATION_JSON)
public class BookService {
    
    @GET
    @Path("/{authorID}")
    public Response getBooks(@PathParam("authorID") String authorID) throws Exception {
        
        if("0".equals(authorID)) {
            throw new AuthorException("invalid author");
        }
        
        if("1".equalsIgnoreCase(authorID)) {
            throw new BookException("Books Not found");
        }
        System.out.println("Entered into Resource");
        Book book = new Book();
        
        book.setId("122");
        book.setName("A Monk who sold his Ferrari");
        book.setAuthor("Robin Sharma");
        
        return Response.status(200).
                entity(book).build();
    }
    
    @POST
    @Path("/add")
    @UpdateHeader
    public Response addBook(@Context HttpHeaders headers,  Book book) {
        
        System.out.println("Req Headers :" + headers.getRequestHeaders());
                
        BookResponse resp = new BookResponse();
        resp.setId(book.getId());
        resp.setStatus("Book added successfully.");
        
        return Response.status(200).
                entity(resp).build();
    }

}
