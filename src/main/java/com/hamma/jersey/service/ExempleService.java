package com.hamma.jersey.service;

import java.util.Collection;
import java.util.concurrent.ExecutionException;

import org.jvnet.hk2.annotations.Contract;

import com.hamma.jersey.dto.UserDto;

@Contract
public interface ExempleService {
	public Collection<UserDto> getListUsers () throws InterruptedException, ExecutionException;
}
