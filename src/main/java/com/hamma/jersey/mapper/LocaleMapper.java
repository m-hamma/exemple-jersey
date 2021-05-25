package com.hamma.jersey.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.hamma.jersey.dto.LocaleDto;
import com.hamma.jersey.model.Locale;

@Mapper
public interface LocaleMapper {
	@Mapping(source = "email", target = "email")
    Locale toEtity (LocaleDto localeDto);

	@Mapping(source = "email", target = "email")
    LocaleDto toDto(Locale locale);
	
	
}