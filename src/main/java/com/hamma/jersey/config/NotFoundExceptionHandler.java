package com.hamma.jersey.config;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionHandler
  implements ExceptionMapper<EmployeeNotFound> {
 
    public Response toResponse(EmployeeNotFound ex) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
