package com.hamma.jersey.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String name;
    private LocaleDto local;

    // standard getters and setters
}
