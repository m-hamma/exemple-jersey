package com.hamma.jersey.rest;

import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hamma.jersey.dto.UserDto;
import com.hamma.jersey.service.ExempleService;
import com.hamma.main.MongoApp;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	private static final Log log = LogFactory.getLog(MyResource.class);
	@Autowired
	ExempleService exempleService;

	public MyResource() {
		super();
	}

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<UserDto> getIt() {
		Collection<UserDto> result = null;
		try {
			// exempleService.getListUsers().stream().forEach(e->result=e.toString());
			result = exempleService.getListUsers();
			result.stream().forEach(new Consumer<UserDto>() {
				@Override
				public void accept(UserDto user) {
					log.info("---------------------" + user.getName() + "---------------------");
					if (user.getLocal() != null)
						log.info(
								"---------------------" + user.getLocal().getEmail() + "---------------------");
				}
			});
			return result;
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return result;
	}
}
