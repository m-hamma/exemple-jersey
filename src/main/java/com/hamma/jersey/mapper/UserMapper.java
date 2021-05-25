package com.hamma.jersey.mapper;

import java.util.Collection;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hamma.jersey.dto.UserDto;
import com.hamma.jersey.model.User;

@Mapper(uses= { LocaleMapper.class} )
public interface UserMapper {
	@Mapping(source = "name", target = "name")
	@Mapping(source = "local", target = "local")
    User toEtity (UserDto userDto);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "local", target = "local")
    UserDto toDto(User user, @Context Collection<User> users);
    
    Collection<UserDto> toListDto(Collection<User> users);
}
