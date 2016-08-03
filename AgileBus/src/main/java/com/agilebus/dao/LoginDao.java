package com.agilebus.dao;

import java.sql.SQLException;

import com.agilebus.model.LoginBean;

public interface LoginDao {
	public boolean isValidUser(LoginBean loginBean) throws SQLException;
}
