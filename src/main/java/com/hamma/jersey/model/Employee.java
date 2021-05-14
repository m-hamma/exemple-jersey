package com.hamma.jersey.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int id;
    private String firstName;

    // standard getters and setters
}
