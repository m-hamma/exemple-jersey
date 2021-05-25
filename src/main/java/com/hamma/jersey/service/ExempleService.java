package com.hamma.jersey.service;

import java.util.Collection;

import org.bson.Document;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamma.jersey.dao.DbConnector;
import com.hamma.jersey.dao.ExempleDao;
import com.hamma.jersey.dto.UserDto;
import com.hamma.jersey.mapper.UserMapper;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

@Service
public class ExempleService {
	@Autowired
	ExempleDao exempleDao;
	private UserMapper userMapper = Mappers.getMapper(UserMapper.class);

	public Collection<UserDto> getListUsers () {
		
		return null;
				//userMapper.toListDto(exempleDao.getCollection());
	}
}
