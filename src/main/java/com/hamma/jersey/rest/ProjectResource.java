package com.hamma.jersey.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;

import com.hamma.jersey.dto.ProjectManager;
import com.hamma.jersey.dto.UserDto;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Path("/users")
public class ProjectResource extends AbstractResource {

    @Autowired
    ProjectManager pm;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response getIt(@PathParam("id") Integer id) {
        //ProjectManager pm = getManagerFactory().getProjectManager();
        Collection<UserDto> result = new ArrayList<>();
        UserDto user = new UserDto();
        user.setName("hamma");
        result.add(user);
        return Response.status(200).entity(result).build();
    }
}
