package com.hamma.jersey.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Data
public class UserDto {
	@Setter
    private String name;
    private LocaleDto local;

    // standard getters and setters
}
