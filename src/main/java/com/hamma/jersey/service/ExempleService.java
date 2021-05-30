package com.hamma.jersey.service;

import java.util.Collection;
import java.util.concurrent.ExecutionException;

import org.mapstruct.factory.Mappers;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamma.jersey.dao.ExempleDao;
import com.hamma.jersey.dto.UserDto;
import com.hamma.jersey.mapper.UserMapper;

@Service
public class ExempleService {
	ExempleDao exempleDao;
	public ExempleService(ExempleDao exempleDao) {
		super();
		this.exempleDao = exempleDao;
	}
	private UserMapper userMapper = Mappers.getMapper(UserMapper.class);

	public Collection<UserDto> getListUsers () throws InterruptedException, ExecutionException {
		
		return userMapper.toListDto(exempleDao.getCollection());
	}
}
