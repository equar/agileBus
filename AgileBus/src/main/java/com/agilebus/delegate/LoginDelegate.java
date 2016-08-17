package com.agilebus.delegate;

import java.sql.SQLException;

import com.agilebus.model.LoginBean;
import com.agilebus.model.RoleBean;
import com.agilebus.service.LoginService;

public class LoginDelegate {
	private LoginService loginService;

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public boolean isValidUser(LoginBean loginBean) throws SQLException {
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
	
	public boolean addUserRole(RoleBean roleBean) throws SQLException {
		return loginService.addUserRole(roleBean);
	}

}
