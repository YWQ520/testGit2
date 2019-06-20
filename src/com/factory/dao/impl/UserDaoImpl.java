package com.factory.dao.impl;

import com.factory.dao.UserDao;

public class UserDaoImpl implements UserDao{

	@Override
	public void selAll() {
		System.out.println("我是dao层查询所有方法");
	}

}
