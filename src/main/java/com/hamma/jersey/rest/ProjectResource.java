package com.hamma.jersey.rest;

import java.util.Collection;
import java.util.concurrent.ExecutionException;

import com.hamma.jersey.dto.ProjectManager;
import com.hamma.jersey.dto.UserDto;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class ProjectResource extends AbstractResource{
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public UserDto getIt(@PathParam("id") Integer id) {
		ProjectManager pm = getManagerFactory().getProjectManager();
		Collection<UserDto> result = null;
		return null;
	}
}
