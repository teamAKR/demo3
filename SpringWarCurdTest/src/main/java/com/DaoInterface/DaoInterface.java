package com.DaoInterface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;

public interface DaoInterface extends CrudRepository<Login, Integer> {
	
	Login findAllByUnameAndPassword(String uname, String password);


}
