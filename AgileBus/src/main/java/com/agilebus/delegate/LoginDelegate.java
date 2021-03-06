package com.agilebus.delegate;

import java.sql.SQLException;

import com.agilebus.model.User;
import com.agilebus.model.UserRole;
import com.agilebus.service.LoginService;

public class LoginDelegate {
	private LoginService loginService;

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public boolean isValidUser(User loginBean) throws SQLException {
		return loginService.isValidUser(loginBean);
	}

	public boolean isUserRegistered(String username, String password) throws SQLException {
		return false;
	}

	public boolean isPasswordResetted(String username, String password) throws SQLException {
		return false;
	}

	public boolean isPasswordUpdated(String username, String password) throws SQLException {
		return false;
	}

	public boolean isPasswordChanged(String username, String password) throws SQLException {
		return false;
	}
	
	public boolean addUserRole(UserRole roleBean) throws SQLException {
		return loginService.addUserRole(roleBean);
	}

}
