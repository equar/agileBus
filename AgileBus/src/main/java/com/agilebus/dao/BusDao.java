package com.agilebus.dao;

import java.sql.SQLException;

import com.agilebus.model.BusBean;

public interface BusDao {
	public boolean isValidUser(BusBean busBean) throws SQLException;
}
