package com.agilebus.service.impl;

import java.sql.SQLException;

import com.agilebus.dao.LoginDao;
import com.agilebus.model.LoginBean;
import com.agilebus.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao;

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public boolean isValidUser(LoginBean loginBean) throws SQLException {
		return loginDao.isValidUser(loginBean);
	}

}
