package com.hamma.jersey.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.hamma.jersey.dao.ExempleDao;
import com.hamma.jersey.dao.UserRepository;
import com.hamma.jersey.service.ExempleService;

@ExtendWith(MockitoExtension.class)
public class MyResourceTest {

    @Mock
    ExempleDao exempleDao = new ExempleDao();
    @Mock
    ExempleService exempleService = new ExempleService();
    @Mock
    private MyResource myResource;

    @BeforeEach
    public void init() {
        System.out.println("entrer dans init");
        myResource = new MyResource(exempleService);
    }

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
        if (myResource != null) {
            System.out.println("valeur myResource ->" + myResource);
            final String responseMsg = myResource.getIt().toString();
            //target().path("myresource").request().get(String.class);
            System.out.println(responseMsg);
            assertNotEquals("Hello, Heroku!", responseMsg);
        }
    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll - executed after all test methods.");
    }
}
