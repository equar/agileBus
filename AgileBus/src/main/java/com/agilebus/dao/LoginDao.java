package com.agilebus.dao;

import com.agilebus.model.LoginBean;
import com.agilebus.model.RoleBean;

public interface LoginDao {
	public boolean isValidUser(LoginBean loginBean);

	public boolean addUserRole(RoleBean roleBean);
}
