package com.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DaoInterface.DaoInterface;
import com.DaoInterface.DaoInterface2;
import com.ServiceInterface.ServiceInterface;
import com.model.Login;
import com.model.User;
@Service
public class ServiceImpl implements ServiceInterface {
@Autowired
DaoInterface dao;

	public DaoInterface getDao() {
	return dao;
}

public void setDao(DaoInterface dao) {
	this.dao = dao;
}
@Autowired

DaoInterface2 dao2;

	public DaoInterface2 getDao2() {
	return dao2;
}

public void setDao2(DaoInterface2 dao2) {
	this.dao2 = dao2;
}

	public User SaveUser(User user) {
		// TODO Auto-generated method stub
		return dao2.save(user);
	}

	public Login check(Login login) {
		// TODO Auto-generated method stub
		return dao.findAllByUnameAndPassword(login.getUname(), login.getPassword());
	}

	public User getAllRecord() {
	
		return (User) dao2.findAll();
	}

	public List<User> getAlllData() {
		
		return (List<User>) dao2.findAll();
	}

	public void deleteUser(int id) {
	  dao2.delete(id);
		
	}
}
