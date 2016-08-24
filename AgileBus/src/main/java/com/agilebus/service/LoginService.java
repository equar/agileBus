package com.agilebus.service;

import com.agilebus.model.User;
import com.agilebus.model.UserRole;

public interface LoginService {
	public boolean isValidUser(User user);

	public boolean addUserRole(UserRole userRole);

	public boolean registerAccount(User user);
}
