package com.agile.bus.dao;

import java.sql.SQLException;

public interface UserDao {
	public boolean isValidUser(String username, String password) throws SQLException;
}
