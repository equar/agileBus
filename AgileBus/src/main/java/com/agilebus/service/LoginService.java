package com.agilebus.service;

import java.sql.SQLException;

import com.agilebus.model.LoginBean;
import com.agilebus.model.RoleBean;

public interface LoginService {
	public boolean isValidUser(LoginBean loginBean);

	public boolean addUserRole(RoleBean roleBean);
}
