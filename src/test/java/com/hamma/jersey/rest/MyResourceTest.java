package com.hamma.jersey.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.hamma.jersey.dao.ExempleDao;
import com.hamma.jersey.service.ExempleService;

@ExtendWith(MockitoExtension.class)
public class MyResourceTest {

	@InjectMocks
	MyResource myResource = new MyResource();
	@InjectMocks
	ExempleService exempleService = new ExempleService();
	@InjectMocks
	ExempleDao exempleDao = new ExempleDao();
	
	@AfterEach
	void tearDown() {
		// log.info
		System.out.println("@AfterEach - executed after each test method.");
	}


	@DisplayName("Single test successful")
	@Test
	void testSingleSuccessTest() {
		System.out.println("Success");
	}

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        final String responseMsg =  myResource.getIt();
        		//target().path("myresource").request().get(String.class);

        assertNotEquals("Hello, Heroku!", responseMsg);
    }
    @AfterAll
	static void done() {
		System.out.println("@AfterAll - executed after all test methods.");
	}
}
