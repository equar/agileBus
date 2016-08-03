package com.agilebus.service;

import java.sql.SQLException;

import com.agilebus.model.LoginBean;

public interface LoginService {
	public boolean isValidUser(LoginBean loginBean) throws SQLException;
}
