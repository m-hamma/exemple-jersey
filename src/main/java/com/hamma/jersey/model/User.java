package com.hamma.jersey.model;

import lombok.Builder;
import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private Locale local;

    // standard getters and setters
}
