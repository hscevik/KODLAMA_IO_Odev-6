package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.UserService;
import com.hrms.hrms.dataAccess.abstracts.UserDao;
import com.hrms.hrms.entities.abstracts.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	
	@Override
	public List<User> getUserAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}


	@Override
	public void addUser(User user) {
		userDao.save(user)		;
	}

}
