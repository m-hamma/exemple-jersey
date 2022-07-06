package com.hamma.jersey.config;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionHandler
  implements ExceptionMapper<Exception> {
 
    public Response toResponse(Exception ex) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
