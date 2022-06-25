package com.hamma.jersey.rest;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.hamma.jersey.dto.UserDto;
import com.hamma.jersey.service.ExempleService;
import com.hamma.main.MongoApp;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/myresource")
@Component
public class MyResource  {
	private static final Log log = LogFactory.getLog(MyResource.class);

	private ExempleService exempleService;

	public MyResource(ExempleService exempleService) {
		this.exempleService=exempleService;
	}

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getIt() {
		Collection<UserDto> result = null;
		try {
			// exempleService.getListUsers().stream().forEach(e->result=e.toString());
			result = exempleService.getListUsers();
			result.stream().forEach(new Consumer<UserDto>() {
				@Override
				public void accept(UserDto user) {
					log.info("---------------------" + user.getName() + "---------------------");
					if (user.getLocal() != null)
						log.info("---------------------" + user.getLocal().getEmail() + "---------------------");
				}
			});
			return Response.status(200).entity(result).build();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}
}
