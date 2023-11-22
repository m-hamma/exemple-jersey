package com.hamma.main;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.hamma.jersey.model.Locale;
import com.hamma.jersey.model.User;
import com.mongodb.client.MongoClients;

public class MongoApp {

    private static final Log logger = LogFactory.getLog(MongoApp.class);

    public static void main(String[] args) {
        try {
            //System.out.println(10/0);
            logger.debug("test-->");
            ClasseB classeB = new ClasseB();
            classeB.foo();
        } catch (ArithmeticException e) {
            throw new NullPointerException();
        }
    }
}