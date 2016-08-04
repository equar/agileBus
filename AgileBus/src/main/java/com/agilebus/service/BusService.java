package com.agilebus.service;

import java.sql.SQLException;

import com.agilebus.model.BusBean;

public interface BusService {
	public boolean isValidUser(BusBean  busBean) throws SQLException;
}
