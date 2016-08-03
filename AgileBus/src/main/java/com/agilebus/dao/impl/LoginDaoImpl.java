package com.agilebus.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.agilebus.dao.LoginDao;
import com.agilebus.model.LoginBean;

public class LoginDaoImpl implements LoginDao {

	DataSource dataSource;

	public DataSource getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public boolean isValidUser(LoginBean loginBean) throws SQLException {
		String query = "Select count(1) from users where username = ? and password = ?";
		PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
		pstmt.setString(1, loginBean.getUsername());
		pstmt.setString(2, loginBean.getPassword());
		ResultSet resultSet = pstmt.executeQuery();
		if (resultSet.next())
			return (resultSet.getInt(1) > 0);
		else
			return false;
	}

}