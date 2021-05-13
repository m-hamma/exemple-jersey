package com.hamma.jersey.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MyResourceTest {

	@InjectMocks
	MyResource myResource = new MyResource();
	
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

        assertEquals("Hello, Heroku!", responseMsg);
    }
    @AfterAll
	static void done() {
		System.out.println("@AfterAll - executed after all test methods.");
	}
}
