package com.agilebus.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.agilebus.dao.LoginDao;
import com.agilebus.model.User;
import com.agilebus.model.UserRole;
import com.agilebus.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao;

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	@Transactional
	public boolean isValidUser(User user) {
		return loginDao.isValidUser(user);
	}

	@Override
	@Transactional
	public boolean addUserRole(UserRole userRole) {
		return loginDao.addUserRole(userRole);
	}

	@Override
	@Transactional
	public boolean registerAccount(User user) {
		return loginDao.registerAccount(user);
	}

}
