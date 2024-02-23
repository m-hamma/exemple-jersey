package com.hamma.jersey.rest;

import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.hamma.jersey.dto.UserDto;
import com.hamma.jersey.service.ExempleService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/myresource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
//@RestController
public class MyResource {
    private static final Log log = LogFactory.getLog(MyResource.class);
    @Autowired
    private ExempleService exempleService;
//	private static final Logger LOGGER1 = LogManager.getLogger( "Compo1" );
//	private static final Logger LOGGER2 = LogManager.getLogger( "Compo1" );

    /**
     * Method handling HTTP GET requests. The returned object will be sent to the
     * client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt() throws InterruptedException, ExecutionException {
        Collection<UserDto> result = null;
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
    }
}
