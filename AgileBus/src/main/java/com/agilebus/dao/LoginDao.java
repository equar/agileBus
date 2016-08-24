package com.agilebus.dao;

import com.agilebus.model.User;
import com.agilebus.model.UserRole;

public interface LoginDao {
	public boolean isValidUser(User user);

	public boolean addUserRole(UserRole userRole);

	public boolean registerAccount(User user);
}
