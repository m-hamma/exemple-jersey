package com.hamma.jersey.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import com.hamma.jersey.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, String>, QueryByExampleExecutor<User> {
	//List<User> findByName(String name);

    //Page<User> findByEmail(String email, Pageable pageable);

}
