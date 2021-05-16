package com.hamma.jersey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamma.jersey.dao.DbConnector;
import com.hamma.jersey.dao.ExempleDao;

@Service
public class ExempleService {
	@Autowired
	ExempleDao exempleDao;

	public void createCollection () {
		exempleDao.createcollection();
	}
}
