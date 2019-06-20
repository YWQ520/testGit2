package com.factory.service.impl;

import org.junit.Test;

import com.factory.dao.UserDao;
import com.factory.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;   //UserServiceImpl “¿¿µ ”⁄UserDao  ◊¢»ÎDI
	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Test
	@Override
	public void query() {
		userDao.selAll();
	}
	
}
