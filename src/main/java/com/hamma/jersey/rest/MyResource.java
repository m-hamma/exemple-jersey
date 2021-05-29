package com.hamma.jersey.rest;

import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;

import com.hamma.jersey.dto.UserDto;
import com.hamma.jersey.model.User;
import com.hamma.jersey.service.ExempleService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	@Autowired
	ExempleService exempleService;

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	//Client client = ClientBuilder.newClient();
    	//client.target('').
    	/*Response response 
    	  = invocationBuilder.get(Employee.class);*/
      //  return "Hello, Heroku!";
    	String result="";
      
    	try {
			//exempleService.getListUsers().stream().forEach(e->result=e.toString());
			exempleService.getListUsers().stream().forEach(new Consumer<UserDto>() {
	            @Override
	            public void accept(UserDto user) {
	            	  System.out.println(user.getName());
	            }
	        });
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
      return result;
      
    }
}
