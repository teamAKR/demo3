package com.ServiceInterface;

import java.util.List;

import com.model.Login;
import com.model.User;

public interface ServiceInterface {

	User SaveUser(User user);

	Login check(Login login);

	User getAllRecord();

	List<User> getAlllData();

	void deleteUser(int id);





}
