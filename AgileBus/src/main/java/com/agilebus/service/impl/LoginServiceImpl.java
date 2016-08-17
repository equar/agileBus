package com.agilebus.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agilebus.dao.LoginDao;
import com.agilebus.model.LoginBean;
import com.agilebus.model.RoleBean;
import com.agilebus.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	private LoginDao loginDao;

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	@Transactional
	public boolean isValidUser(LoginBean loginBean) {
		return loginDao.isValidUser(loginBean);
	}

	@Override
	@Transactional
	public boolean addUserRole(RoleBean roleBean) {
		return loginDao.addUserRole(roleBean);
	}

}
