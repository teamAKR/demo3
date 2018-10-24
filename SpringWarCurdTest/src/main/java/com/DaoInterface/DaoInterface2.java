package com.DaoInterface;

import org.springframework.data.repository.CrudRepository;

import com.model.User;

public interface DaoInterface2 extends CrudRepository<User, Integer>{
	
	User findAllByname(String name);

}
